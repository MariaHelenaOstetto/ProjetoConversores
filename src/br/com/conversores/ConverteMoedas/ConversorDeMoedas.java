package br.com.conversores.ConverteMoedas;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import br.com.conversores.ConverteMoedas.*;

/**
*This program converts Real to other 5 currencies and also converts these currencies into Real.
*@version 0.1
*@author - Maria Helena Ostetto
*First of all, creates the constants for countrie's monetary units and monetary currency symbols, same as used by international convention.
*Constants are static, used only by the class, and also private final, which means values will be constant.
*A DecimalFormat is used to format with only two digits after dot to turn simpler reading the results. 
 */
public class ConversorDeMoedas{
	
	private static final String unidadeMonetariaReal = "R$";
	private static final String unidadeMonetariaDolar = "US$";
	private static final String unidadeMonetariaEuro = "€";
	private static final String unidadeMonetariaLibraEsterlina = "£";
	private static final String unidadeMonetariaPesoArgentino = "$";
	private static final String unidadeMonetariaPesoChileno = "$";
	private static final String unidadeMonetariaPLNteste = "$";

	private static final String simboloMonetarioReal = "(BRL)";
	private static final String simboloMonetarioDolar = "(USD)";
	private static final String simboloMonetarioEuro = "(EUR)";
	private static final String simboloMonetarioLibraEsterlina = "(GBP)";
	private static final String simboloMonetarioPesoArgentino = "(ARS)";
	private static final String simboloMonetarioPesoChileno = "(CLP)";

	private static final DecimalFormat formatoDeMoeda = new DecimalFormat("0.00");
/**
 *Method calls a HashMap created from the class program which reads quotations from Brazil's Central Bank.
 *A constructor is built and create method to convert the currencies.
 *@param cotacoes refers to all currency quotations.
 *Currency Converter program is first presented with a JPanel with animation.
 *Clicking OK on such panel calls the choose options method to run.
 */
	public static void executarConversao(Map<String, Float> cotacoes) {
		ConversorDeMoedas conversor = new ConversorDeMoedas();

		        ImageIcon imagem = new ImageIcon(ConversorDeMoedas.class.getResource("YinYangCatsCambio.gif"));
		        JLabel icon = new JLabel(imagem);
		        JLabel text = new JLabel("CONVERSOR DE MOEDAS", JLabel.CENTER);
		        text.setFont(new Font("Tahoma", Font.BOLD, 28));
		        JLabel text2 = new JLabel("Converte Reais para 5 moedas diferentes e delas para Reais");

		        JPanel panel = new JPanel();
		        panel.setLayout(new BorderLayout());
		        panel.add(icon, BorderLayout.CENTER);
		        panel.add(text, BorderLayout.NORTH);
		        panel.add(text2, BorderLayout.SOUTH);

		        JOptionPane.showMessageDialog(null, panel, "Bem Vindos!", JOptionPane.PLAIN_MESSAGE);
		        do {
		        	escolherReaisParaOutrasOuOutrasParaReais(cotacoes);
		        }
		        while (true);
		     	}

/**
@param cotacoes the variable cotacoes from HashMap with all currency quotations.
*First, user chooses converting Real to Other Currencies OR Other Currencies to Real.
*/
	public static void escolherReaisParaOutrasOuOutrasParaReais(Map<String, Float> cotacoes) {
		    	
/**
*Creates string with options to choose in between the two options Real to Other Currencies OR Other Currencies to Real.
*Uses do while to loop in between the options while they are true.
*Turning options value null will call to terminate program with YES_NO_CANCEL.Options used from JOptionPane showInputDialog 
*/
		
		    	String[] opcoes = {"CONVERTER REAIS PARA OUTRAS MOEDAS", "CONVERTER OUTRAS MOEDAS PARA REAIS"};

		        do {
		        	
		        	Object escolha = JOptionPane.showInputDialog(null, "ESCOLHA", "TIPO DE CONVERSÃO", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

		        	if (escolha == ("CONVERTER REAIS PARA OUTRAS MOEDAS")) {
		        		converterReaisParaOutrasMoedas(cotacoes);
		        	}
		            if (escolha == ("CONVERTER OUTRAS MOEDAS PARA REAIS")) {
		            	converterOutrasMoedasParaReais(cotacoes);
		            }	
		            	int choice = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Programa?",
		                        "ENCERRAR PROGRAMA?", JOptionPane.YES_NO_CANCEL_OPTION);

		                if (choice == JOptionPane.YES_OPTION) {
		                    JOptionPane.showMessageDialog(null, "Encerrando o Programa...");
		                    System.exit(0);
		                } else if (choice == JOptionPane.CANCEL_OPTION) {
		                    JOptionPane.showMessageDialog(null, "Cancelando o Programa...");
		                    System.exit(0);
		                }
  
		         }while (true);
		    }
/**
*@param cotacoes the variable cotacoes from HashMap with all currency quotations.
*Method processes and convert Real to the other 5 currencies under multiple choice options.
*Uses JOptionPane showInputDialog.	
*Processes results under a series of IFs conditional statements method.   
*Calculates quotations reading HashMap "cotacoes" from LerDoArquivoSVC class program.
*/
	public static  void converterReaisParaOutrasMoedas(Map<String, Float> cotacoes) {
		        
				String[] opcoes = {"Dólar(USD)", "Euro(EUR)", "Libra Esterlina(GBP)", "Peso Argentino(ARS)", "Peso Chileno(CLP)"};
		        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para converter", "CONVERTER REAIS PARA",
		                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		        if (escolha != null) {
		        
		            float montante = obterMontante();
		            float resultado = 0;

		            if (escolha.equals("Dólar(USD)")) {
		            	resultado = montante / cotacoes.get("USD");
		                    resultado = montante / cotacoes.get("USD");
		                    exibirResultado(unidadeMonetariaReal, montante, simboloMonetarioReal, unidadeMonetariaDolar, resultado, simboloMonetarioDolar);
		            }
		            if (escolha.equals("Euro(EUR)")) {
		                    resultado = montante / cotacoes.get("EUR");
		                    exibirResultado(unidadeMonetariaReal, montante, simboloMonetarioReal, unidadeMonetariaEuro, resultado, simboloMonetarioEuro);
		            }
		            if(escolha.equals("Libra Esterlina(GBP)")) {
		                    resultado = montante / cotacoes.get("GBP");
		                    exibirResultado(unidadeMonetariaReal, montante, simboloMonetarioReal, unidadeMonetariaLibraEsterlina, resultado, simboloMonetarioLibraEsterlina);
		            }
		            if(escolha.equals("Peso Argentino(ARS)")) {
		                    resultado = montante / cotacoes.get("ARS");
		                    exibirResultado(unidadeMonetariaReal, montante, simboloMonetarioReal, unidadeMonetariaPesoArgentino, resultado, simboloMonetarioPesoArgentino);
		            }
		            if(escolha.equals("Peso Chileno(CLP)")) {
		                    resultado = montante / cotacoes.get("CLP");
		                    exibirResultado(unidadeMonetariaReal, montante, simboloMonetarioReal, unidadeMonetariaPesoChileno, resultado, simboloMonetarioPesoChileno);
		            }
		            else {
		                    return;
		            	}
		        }
	}

/**
*Same method with conditional statements from before is used,  
*only that here it processes choices from Other Currencies to Real primary choice.
*Uses same HashMap "cotacoes".
*/
	
	   public static void converterOutrasMoedasParaReais(Map<String, Float>cotacoes) {
		        String[] opcoes = {"Dólar(USD)", "Euro(EUR)", "Libra Esterlina(GBP)", "Peso Argentino(ARS)", "Peso Chileno(CLP)"};
		        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para converter", "CONVERTER OUTRAS MOEDAS PARA REAL",
		                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

		        if (escolha != null) {
		            float montante = obterMontante();
		            float resultado = 0;

		            if(escolha.equals("Dólar(USD)")) {
		                	resultado = montante * cotacoes.get("USD");
		                    exibirResultado(unidadeMonetariaDolar, montante, simboloMonetarioDolar, unidadeMonetariaReal, resultado, simboloMonetarioReal);
		            }
		            if(escolha.equals("Euro(EUR)")) {
		                    resultado = montante * cotacoes.get("EUR");
		                    exibirResultado(unidadeMonetariaEuro, montante, simboloMonetarioEuro, unidadeMonetariaReal, resultado, simboloMonetarioReal);
		            }
		            if(escolha.equals("Libra Esterlina(GBP)")) {
		                    resultado = montante * cotacoes.get("GBP");
		                    exibirResultado(unidadeMonetariaLibraEsterlina, montante, simboloMonetarioLibraEsterlina, unidadeMonetariaReal, resultado, simboloMonetarioReal);
		            }
		            if(escolha.equals("Peso Argentino(ARS)")) {
		                    resultado = montante * cotacoes.get("ARS");
		                    exibirResultado(unidadeMonetariaPesoArgentino, montante, simboloMonetarioPesoArgentino, unidadeMonetariaReal, resultado, simboloMonetarioReal);
		            }
		            if(escolha.equals("Peso Chileno(CLP)")) {
		                    resultado = montante * cotacoes.get("CLP");
		                    exibirResultado(unidadeMonetariaPesoChileno, montante, simboloMonetarioPesoChileno, unidadeMonetariaReal, resultado, simboloMonetarioReal);
		            }
		            else {
		            	return;
		            }
		        }
	}
/**
*Returns and sends to process the entry value "montante" inputed by the user.
*Turns entry value into float number and uses it to calculate results.
*Boolean valid value false to process conditional situations of invalid entries.
*JOptionPane showInputDialog to entry value.
*JOptionPane showOptionDialog with YES_NO_CANCEL options to process invalid entries,
*which presents options or to terminate or to continue program.
*And in this last case, method is called to run program from begin all over again. 
*/
	private static float obterMontante() {
				float montante = 0;
		        boolean valorValido = false;

		        while (!valorValido) {
		            String entrada = JOptionPane.showInputDialog(null, "Digite o montante a converter:", "ENTRADA", JOptionPane.PLAIN_MESSAGE);
		            if (entrada == null) {
		                int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "MONTANTE EM BRANCO",
		                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		                if ((confirmacao == JOptionPane.YES_OPTION)) {
		                    JOptionPane.showMessageDialog(null, "Encerrando o programa", "ENCERRANDO...", JOptionPane.WARNING_MESSAGE);
		                    System.exit(0);
		                }
		                if (confirmacao == JOptionPane.CANCEL_OPTION) {
		                    JOptionPane.showMessageDialog(null, "Encerrando o programa", "ENCERRANDO...", JOptionPane.WARNING_MESSAGE);
		                    System.exit(0);
		                }
		            } else {
/**
*Try/catch to treat all invalid number format exceptions, like other characters or blank statements.
*Loops the program asking for the valid amount entry over and over again until conditions are satisfied.
*Or then, on turning it null, presenting terminate program YES_NO_CANCEL options. 
*/
		                try {
		                    montante = Float.parseFloat(entrada);
		                    valorValido = true;
		                } catch (NumberFormatException e) {
		                    JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente.", "ERRO", JOptionPane.WARNING_MESSAGE);
		                }
		            }
		        }

		        return montante;
		    }
/**
*@param unidadeMonetariaEntrada constants stated in the beginning of program.
*@param montanteEntrada valid float value inputed by user.
*@param simboloMonetarioEntrada constants from beginning of program.
*@param unidadeMonetariaSaida constant pertaining to the final currency chosen by user.
*@param montanteSaida, float value formated with two digits after dot, resulting from calculation
*between total value to convert and currency quotation. 
*@param simboloMonetarioSaida constant created in the beginning of program referring to the different country's currencies.  
*Custom modified icon from JOptionPane showMessageDialog creating Image Icon with a spinning coin animation to present results.
*/
	 private static void exibirResultado(String unidadeMonetariaEntrada, float montanteEntrada, String simboloMonetarioEntrada,
		                                 String unidadeMonetariaSaida, float montanteSaida, String simboloMonetarioSaida) {
		        
		    	ImageIcon moeda = new ImageIcon(ConversorDeMoedas.class.getResource("MOEDAGIRANDO.gif"));
			       moeda.setImage(moeda.getImage().getScaledInstance((moeda.getIconWidth()/2), moeda.getIconHeight()/2, Image.SCALE_DEFAULT));
			       
		 	
		    	
		    	String mensagem = unidadeMonetariaEntrada + " " + formatoDeMoeda.format(montanteEntrada) + " " + simboloMonetarioEntrada
		                + " correspondem a " + unidadeMonetariaSaida + " " + formatoDeMoeda.format(montanteSaida) + " " + simboloMonetarioSaida;

		        JOptionPane.showMessageDialog(null, mensagem, "RESULTADO", JOptionPane.INFORMATION_MESSAGE, moeda);
/**
*User can terminate program with this method: ShowOptionDialog with YES_NO_CANCEL options 
*YES and CANCEL options turn null and terminate program with System exit.
*NO	option returns to beginning to choose options all over again.	        
 */
		        int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "SAIR?",
		                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		    	if(confirmacao == JOptionPane.YES_OPTION || confirmacao == JOptionPane.CANCEL_OPTION) {
		    		JOptionPane.showMessageDialog(null, "Encerrando o programa :)");
		            System.exit(0);
		    	}        
		        if (confirmacao == JOptionPane.NO_OPTION) {
		        	Map<String, Float> cotacoes = LerDoArquivoCSV.obterCotacoes();
		        	escolherReaisParaOutrasOuOutrasParaReais(cotacoes);
		        }
		    
		    }
/**
*@param args
*Methods and constructor are called by program which initializes converters and also to run Currency Converter itself separately.
*/
	 public static void main(String[] args){
		
		 ConversorDeMoedas conversor = new ConversorDeMoedas();
				
		 Map<String, Float> cotacoes = LerDoArquivoCSV.obterCotacoes();
		 executarConversao(cotacoes);
	}
}