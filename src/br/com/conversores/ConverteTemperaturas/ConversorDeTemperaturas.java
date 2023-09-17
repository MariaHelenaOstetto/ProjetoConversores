package br.com.conversores.ConverteTemperaturas;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.*;
import br.com.conversores.ConverteTemperaturas.*;
/**
*This program converts temperatures Celsius, Fahrenheit, and Kelvin.
*@version 0.1
*@author - Maria Helena Ostetto
*/
public class ConversorDeTemperaturas {

/**
*Builds a constructor that will be called by the Escolhedor program.
*/	
	public static void executarConversao() {

		ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
/**
*Presents Temperature Converter program with JPanel and animation.
*Clicking OK will call methods to choose units and convert them.		
*/		
		ImageIcon imagem = new ImageIcon(ConversorDeTemperaturas.class.getResource("TERMNOVO3r.gif"));
		JLabel icon1 = new JLabel(imagem);
		JLabel textT = new JLabel("CONVERSOR DE TEMPERATURAS", JLabel.CENTER);
		textT.setFont(new Font("Tahoma", Font.BOLD, 28));
		JLabel textT2 = new JLabel("Converte graus Celsius, Fahrenheit e Kelvin");

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(icon1, BorderLayout.CENTER);
		panel.add(textT, BorderLayout.NORTH);
		panel.add(textT2, BorderLayout.SOUTH); 
		    	
		       
		JOptionPane.showMessageDialog(null, panel, "Bem Vindos!", JOptionPane.PLAIN_MESSAGE);
		   do {
		        	escolherTemperaturasParaConverter();
		        }
		   while (true);
		     	}

/**
*Method creates String with each unit and options to convert them.
*Also customizes icon on JOptionPane with small scale jpg image to present results.
*/
	public static void escolherTemperaturasParaConverter() { 
		
		ImageIcon termometro = new ImageIcon(ConversorDeTemperaturas.class.getResource("TERMPEQUENO.jpg"));
		termometro.setImage(termometro.getImage().getScaledInstance((termometro.getIconWidth()/3), termometro.getIconHeight()/3, Image.SCALE_DEFAULT));
			
		String[] opc = { "GRAUS CELSIUS PARA GRAUS FAHRENHEIT", "GRAUS CELSIUS PARA GRAUS KELVIN",
		                "GRAUS FAHRENHEIT PARA GRAUS CELSIUS", "GRAUS FAHRENHEIT PARA GRAUS KELVIN",
		                "GRAUS KELVIN PARA GRAUS CELSIUS", "GRAUS KELVIN PARA GRAUS FAHRENHEIT" };

		String escolhaAConversao = (String) JOptionPane.showInputDialog(null, "CONVERTER:", "ESCOLHA A CONVERSÃO",
		                JOptionPane.PLAIN_MESSAGE, null, opc, "GRAUS CELSIUS PARA GRAUS FAHRENHEIT");
/**
*Conditionally while not null, options will loop. 
*Switch method to present multiple choices using JOptionPane InputDialog.
*Block surrounded by try catch exception method.
*/    
		if (escolhaAConversao != null) {
		        try {
		            float montante = obterMontante();
		            float resultado = 0;
	                DecimalFormat resultadoFormatado = new DecimalFormat ("0.00");

		            switch (escolhaAConversao) {
		            case "GRAUS CELSIUS PARA GRAUS FAHRENHEIT":
	                    resultado = ((montante * 9 / 5f) + 32);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Celsius (ºC) correspondem a " + resultadoFormatado.format(resultado) + " Graus Fahrenheit (ºF)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro);
	                    break;
	                case "GRAUS CELSIUS PARA GRAUS KELVIN":
	                    resultado = (montante + 273);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Celsius (ºC) correspondem a " + resultadoFormatado.format(resultado) + " Graus Kelvin (K)","RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro );
	                    break;
	                case "GRAUS FAHRENHEIT PARA GRAUS CELSIUS":
	                    resultado = ((montante - 32) * 5 / 9);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Fahrenheit (ºF) correspondem a " + resultadoFormatado.format(resultado) + " Graus Celsius (ºC)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro);
	                    break;
	                case "GRAUS FAHRENHEIT PARA GRAUS KELVIN":
	                    resultado = (((montante - 32) * 5 / 9) + 273);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Fahrenheit (ºF) correspondem a " + resultadoFormatado.format(resultado) + " Graus Kelvin (K)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro);
	                    break;
	                case "GRAUS KELVIN PARA GRAUS CELSIUS":
	                    resultado = (montante - 273);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Kelvin (K) correspondem a " + resultadoFormatado.format(resultado) + " Graus Celsius (ºC)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro);
	                    break;
	                case "GRAUS KELVIN PARA GRAUS FAHRENHEIT":
	                    resultado = (((montante - 273) * 9 / 5) + 32);
	                    JOptionPane.showMessageDialog(null,
	                            montante + " Graus Kelvin (K) correspondem a " + resultadoFormatado.format(resultado) + " Graus Fahrenheit (ºF)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, termometro);
	                    break;
	                default:
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
		        }
/**
*User also can terminate program.
*Method presents showOptionDialog with YES_NO_CANCEL options.
*/	
		        else {
		        	int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "MONTANTE EM BRANCO",
		                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		            if ((confirmacao == JOptionPane.YES_OPTION)|| (confirmacao == JOptionPane.CANCEL_OPTION)) {
		                JOptionPane.showMessageDialog(null, "Encerrando o programa", "ENCERRANDO...", JOptionPane.WARNING_MESSAGE);
		                System.exit(0);
		            }}
		        }

/**
*Creates method to terminate program presenting showOptionDialog with YES_NO_CANCEL options.
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
			                            executarConversao(); 
			        }
			 
		  }
/**
*@return method to return and send to process the entry value "montante" inputed by the user turned into float number and used to calculate results.
*Boolean valid value false to process conditional situations of invalid entries.
*JOptionPane showInputDialog to entry value.
*JOptionPane showOptionDialog with YES_NO_CANCEL options to processes invalid entries.
*It presents options or to terminate or continue program.
*In this last case, method is called to run program from begin all over again. 
*/
	        

    
	private static float obterMontante() {
		float montante = 0;
		boolean valorValido = false;
		while (!valorValido) {
	        String entrada = JOptionPane.showInputDialog(null, "Digite o montante a converter:", "ENTRADA", JOptionPane.PLAIN_MESSAGE);
	        if (entrada == null) {
	            int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "MONTANTE EM BRANCO",
	                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
	            if ((confirmacao == JOptionPane.YES_OPTION)|| (confirmacao == JOptionPane.CANCEL_OPTION)) {
	                JOptionPane.showMessageDialog(null, "Encerrando o programa", "ENCERRANDO...", JOptionPane.WARNING_MESSAGE);
	                System.exit(0);
	            }
	        } else {
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
*@param args
*Method used by Escolhedor program to run this Temperature Converter and to run program itself separately.
*/
	public static void main(String[]args) {

		ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
		conversor.executarConversao();
	}
}