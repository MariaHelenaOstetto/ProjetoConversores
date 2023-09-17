package br.com.conversores.ConvertePesos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
/**
*This program converts mass units from Metric, Imperial and American systems.
*@version 0.1
*@author - Maria Helena Ostetto
 */
public class ConversorDeUnidadesDeMassa {

/**
*Creates constants referring to each mass unit to be converted. 	
 */
			private final static String simboloKilograma = "kg";
			private final static String simboloGrama = "g";
			private final static String simboloLibra = "lb";
			private final static String simboloLibraTroy = "t lb";
			private final static String simboloOnca = "oz";
			private final static String simboloOncaTroy = "ozt";
			private final static String simboloQuilate = "kt";
/**
*Presents Weight Converter with JPanel and animation.
*Clicking OK will call methods to choose units and convert them.		
 */
			public static void executarConversao() {
/**
*Builds a constructor and method that will be called to initialize program.	
 */
				ConversorDeUnidadesDeMassa convertePesos = new ConversorDeUnidadesDeMassa();
				
				ImageIcon imagem = new ImageIcon(ConversorDeUnidadesDeMassa.class.getResource("BALANCA2.gif"));
		        JLabel icon1 = new JLabel(imagem);
		        JLabel textT = new JLabel("CONVERSOR DE UNIDADES DE MASSA", JLabel.CENTER);
		        textT.setFont(new Font("Tahoma", Font.BOLD, 28));
		        JLabel textT2 = new JLabel("Converte quilogramas, gramas, libras, libras Troy, onças, onças Troy e quilates");

		        JPanel panel = new JPanel();
		        panel.setLayout(new BorderLayout());
		        panel.add(icon1, BorderLayout.CENTER);
		        panel.add(textT, BorderLayout.NORTH);
		        panel.add(textT2, BorderLayout.SOUTH); 
		    	
		       
		       JOptionPane.showMessageDialog(null, panel, "Bem Vindos!", JOptionPane.PLAIN_MESSAGE);
		        do {
		        	escolherPesosParaConverter();
		        }
		        while (true);
		     	}
/**
*Creates method to choose options using JOptionPane.
*Also customizes icon from JOptionPane with a smaller scale animation to present results.
*/			
	public static void escolherPesosParaConverter() {
		
		ImageIcon balanca = new ImageIcon(br.com.conversores.ConvertePesos.ConversorDeUnidadesDeMassa.class.getResource("BALANCA2.gif"));
	    balanca.setImage(balanca.getImage().getScaledInstance((balanca.getIconWidth()/4), balanca.getIconHeight()/4, Image.SCALE_DEFAULT));
				String[] escolher = {"QUILOGRAMAS PARA LIBRAS", "QUILOGRAMAS PARA LIBRAS TROY", "QUILOGRAMAS PARA ONÇAS", "QUILOGRAMAS PARA ONÇAS TROY",
		                "GRAMAS PARA QUILATES", "LIBRAS PARA QUILOGRAMAS", "LIBRAS TROY PARA QUILOGRAMAS",
		                "ONÇAS PARA QUILOGRAMAS", "ONÇAS TROY PARA QUILOGRAMAS", "QUILATES PARA GRAMAS"};

		        String escolherUnidadesParaConverter = (String) JOptionPane.showInputDialog(null, "CONVERTER:", "ESCOLHA A CONVERSÃO",
		                JOptionPane.PLAIN_MESSAGE, null, escolher, "QUILOGRAMAS PARA LIBRAS"); 
/**
*Conditionally while not null, options will loop. 
*Switch method to present multiple choices using JOptionPane InputDialog.
*Surrounds block with try catch exception method.
*/
		        if (escolherUnidadesParaConverter != null) { 
		            String peso = JOptionPane.showInputDialog(null, "Digite o peso a converter", "QUANTO PESA?", JOptionPane.INFORMATION_MESSAGE);
		            
		             try {
	                
		            	double pesoAConverter = Double.parseDouble(peso);
		                double resultadoDaConversao = 0;
		                DecimalFormat resultadoFormatado = new DecimalFormat ("0.00");
				
				 switch(escolherUnidadesParaConverter) {
				
					case "QUILOGRAMAS PARA LIBRAS":
						JOptionPane.showMessageDialog(null,"Você escolheu quilogramas para libras");
						resultadoDaConversao = (pesoAConverter * 2.205f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloKilograma + " (quilogramas) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloLibra + " (libras)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "QUILOGRAMAS PARA LIBRAS TROY":
						JOptionPane.showMessageDialog(null,"Você escolheu quilogramas para libras Troy");
						resultadoDaConversao = (pesoAConverter * 2.6792f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloKilograma + " (quilogramas) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloLibraTroy + " (libras Troy)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "QUILOGRAMAS PARA ONÇAS":
						JOptionPane.showMessageDialog(null,"Você escolheu quilogramas para onças");
						resultadoDaConversao = (pesoAConverter * 35.274f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloKilograma + " (quilogramas) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloOnca + " (onças)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "QUILOGRAMAS PARA ONÇAS TROY":
						JOptionPane.showMessageDialog(null,"Você escolheu quilogramas para onças Troy");
						resultadoDaConversao = (pesoAConverter * 35.274f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloKilograma + " (quilogramas) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloOncaTroy + " (onças Troy)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;	
					case "GRAMAS PARA QUILATES":
						JOptionPane.showMessageDialog(null,"Você escolheu gramas para quilates");
						resultadoDaConversao = (pesoAConverter * 5f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloGrama + " (gramas) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloQuilate + " (quilates)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;	
					case "LIBRAS PARA QUILOGRAMAS":
						JOptionPane.showMessageDialog(null,"Você escolheu libras para quilogramas");
						resultadoDaConversao = (pesoAConverter / 2.205f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloLibra + " (libras) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloKilograma + " (quilogramas)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "LIBRAS TROY PARA QUILOGRAMAS":
						JOptionPane.showMessageDialog(null,"Você escolheu libras Troy para quilogramas");
						resultadoDaConversao = (pesoAConverter / 2.6792f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloLibraTroy + " (libras Troy) pesam " + resultadoDaConversao + simboloKilograma + " (quilogramas)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "ONÇAS PARA QUILOGRAMAS":
						JOptionPane.showMessageDialog(null,"Você escolheu onças para quilogramas");
						resultadoDaConversao = (pesoAConverter / 35.274f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloOnca + " (onças) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloKilograma + " (quilogramas)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;	
					case "ONÇAS TROY PARA QUILOGRAMAS":
						JOptionPane.showMessageDialog(null,"Você escolheu onças Troy para quilogramas");
						resultadoDaConversao = (pesoAConverter / 35.274f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloOncaTroy + " (onças Troy) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloKilograma + " (quilogramas)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
					case "QUILATES PARA GRAMAS":
						JOptionPane.showMessageDialog(null,"Você escolheu quilates para gramas");
						resultadoDaConversao = (pesoAConverter / 5f);
						JOptionPane.showMessageDialog(null, pesoAConverter + simboloQuilate + " (quilates) pesam " + resultadoFormatado.format(resultadoDaConversao) + simboloGrama + " (gramas)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, balanca);
						break;
				}
				sairDoPrograma();
/**
*In case of invalid value typed some character other than numbers or blank,
* the method returns a JOptionPane Message Dialog saying so.
*Also calls method to run program from beginning all over again.
*/
		        } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente.", "ERRO",
		                JOptionPane.WARNING_MESSAGE);
		        executarConversao(); 
		        }
		        } else {
				    JOptionPane.showMessageDialog(null, "Cancelando o programa.");
				    System.exit(0);
				}
			}
/**
*User also can terminate program.
*Method presents showOptionDialog with YES_NO_CANCEL options.
*/	
		    public static void sairDoPrograma() {
		        int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "SAIR?",
		                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirmacao == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Encerrando o programa. Tchau!");
		            System.exit(0);
		        } else if (confirmacao == JOptionPane.CANCEL_OPTION) {
		            JOptionPane.showMessageDialog(null, "Cancelando o programa. Até breve!");
		            System.exit(0);
		        } else {
		            executarConversao(); // Rechama o método para reiniciar a conversão
		        }
		    }

/**
*@param args
*Method used by Escolhedor program to run this Distance Converter as well to run this program separately.
*/
		 public static void main(String[] args) {
		    	
		    	ConversorDeUnidadesDeMassa convertePesos = new ConversorDeUnidadesDeMassa();
		        executarConversao();
		    }
}