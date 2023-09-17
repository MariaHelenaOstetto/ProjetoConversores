package br.com.conversores.ConverteMedidas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import br.com.conversores.ConverteMedidas.*;
/**
*This program converts distance units from Metric and Imperial systems.
*@version 0.1
*@author Maria Helena Ostetto
*/

public class ConversorDeUnidadesDeDistancia {

/**
*At first, program builds constructor then creates method to convert the units.
*Following, creates JPanel with animation presenting the Distance Converter program.
*Clicking OK calls the method choose options and convert units
*/
	public static void executarConversao() {

			ConversorDeUnidadesDeDistancia converteDistancias = new ConversorDeUnidadesDeDistancia();
			
			ImageIcon imagem = new ImageIcon(ConversorDeUnidadesDeDistancia.class.getResource("ConversorDistancia.gif"));
	        JLabel icon1 = new JLabel(imagem);
	        JLabel textT = new JLabel("CONVERSOR DE UNIDADES DE DISTÂNCIA", JLabel.CENTER);
	        textT.setFont(new Font("Tahoma", Font.BOLD, 28));
	        JLabel textT2 = new JLabel("Converte centímetros, metros, kilômetros, polegadas, pés, milhas, milhas náuticas e léguas");

	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());
	        panel.add(icon1, BorderLayout.CENTER);
	        panel.add(textT, BorderLayout.NORTH);
	        panel.add(textT2, BorderLayout.SOUTH); 
	    	
	       
	       JOptionPane.showMessageDialog(null, panel, "Bem Vindos!", JOptionPane.PLAIN_MESSAGE);
	        do {
	        	escolherDistanciasParaConverter();
	        }
	        while (true);
	     	}
	
			double opc;
			static double resultado;
			double saida;
			double metros = 0;
			double polegadas = 0;
			double pes = 0;
		
/**
*Creates String with options and method to choose those options.
*Also customizes JOptionPane's icon with smaller scale animation to present results.
*/
			public static void escolherDistanciasParaConverter() { 
				   ImageIcon conversorDistancia = new ImageIcon(ConversorDeUnidadesDeDistancia.class.getResource("ConversorDistancia.gif"));
			       conversorDistancia.setImage(conversorDistancia.getImage().getScaledInstance((conversorDistancia.getIconWidth()/3), conversorDistancia.getIconHeight()/3, Image.SCALE_DEFAULT));
			       	
			String[] escolher = {"CENTIMETROS PARA POLEGADAS", "CENTIMETROS PARA PES", "METROS PARA POLEGADAS", "METROS PARA PES", "METROS PARA JARDAS", "POLEGADAS PARA CENTIMETROS", "PES PARA CENTIMETROS", "POLEGADAS PARA METROS", "PES PARA METROS", "JARDAS PARA METROS", "POLEGADAS PARA PES", "PES PARA POLEGADAS", "KILOMETROS PARA MILHAS", "KILOMETROS PARA MILHAS NAUTICAS", "KILOMETROS PARA LEGUAS", "MILHAS PARA KILOMETROS", "MILHAS NAUTICAS PARA KILOMETROS", "LEGUAS PARA KILOMETROS"};
			
			String escolherUnidadesParaConversao = (String)JOptionPane.showInputDialog(null, "CONVERTER:", "ESCOLHA A CONVERSAO",
	                JOptionPane.PLAIN_MESSAGE, null, escolher, "CENTIMETROS PARA POLEGADAS");
			
/**
*Switch method offers multiple choices using JOptionPane InputDialog surrounded by try catch exception method.
*/
			if(escolherUnidadesParaConversao != null) {
	            String quantidadeAConverter = JOptionPane.showInputDialog(null, "Digite o montante a converter", "QUANTO A CONVERTER?", JOptionPane.INFORMATION_MESSAGE);
				
	            try {
	                double montante = Double.parseDouble(quantidadeAConverter);
	                DecimalFormat resultadoFormatado = new DecimalFormat ("0.00"); //presents formatted number with two digits after dot
	                switch (escolherUnidadesParaConversao) {
		                case "CENTIMETROS PARA POLEGADAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter centímetros para polegadas");
		                    resultado = ((montante) / 2.54f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " centímetros correspondem a " + resultadoFormatado.format(resultado) + " polegadas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "CENTIMETROS PARA PES":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter centímetros para pés");
		                    resultado = ((montante) / 30.48f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " centímetros correspondem a " + resultadoFormatado.format(resultado) + " pés", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "METROS PARA POLEGADAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter metros para polegadas");
		                    resultado = (montante * 39.37f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " metros correspondem a " + resultadoFormatado.format(resultado) + " polegadas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "METROS PARA PÉS":  
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter metros para pés");
		                    resultado = (montante * 3.28f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " metros correspondem a " + resultadoFormatado.format(resultado) + " pés", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "METROS PARA JARDAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter metros para jardas");
		                    resultado = (montante * 1.094);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " metros correspondem a " + resultadoFormatado.format(resultado) + " jardas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break; 
		                case "POLEGADAS PARA CENTIMETROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter polegadas para centímetros");
		                    resultado = (montante * 2.54f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " polegadas correspondem a " + resultadoFormatado.format(resultado) + " centímetros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "PES PARA CENTIMETROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter pés para centímetros");
		                    resultado = (montante * 30.48f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " pés correspondem a " + resultadoFormatado.format(resultado) + " centímetros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "POLEGADAS PARA METROS":
		                    JOptionPane.showMessageDialog(null,"Você escolheu converter polegadas para metros");
		                    resultado = (montante / 39.37f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " polegadas correspondem a " + resultadoFormatado.format(resultado) + " metros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "PÉS PARA METROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter pés para metros");
		                    resultado = (montante / 3.281f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " pés correspondem a " + resultadoFormatado.format(resultado) + " metros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "JARDAS PARA METROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter jardas para metros");
		                    resultado = (montante / 1.094f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " jardas correspondem a " + resultadoFormatado.format(resultado) + " metros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                
		                case "POLEGADAS PARA PÉS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter polegadas para pés");
		                    resultado = (montante / 12);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " polegadas correspondem a " + resultadoFormatado.format(resultado) + " pés", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "PÉS PARA POLEGADAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter pés para polegadas");
		                    resultado = (montante * 12);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " pés correspondem a " + resultadoFormatado.format(resultado) + " polegadas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "KILÔMETROS PARA MILHAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter kilômetros para milhas");
		                    resultado = (montante / 1.609f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " kilômetros correspondem a " + resultadoFormatado.format(resultado) + " milhas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "KILOMETROS PARA MILHAS NAUTICAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter kilômetros para milhas náuticas");
		                    resultado = (montante / 1.852f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " kilômetros correspondem a " + resultadoFormatado.format(resultado) + " milhas náuticas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "KILOMETROS PARA LEGUAS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter kilômetros para léguas");
		                    resultado = (montante / 4.828f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " kilômetros correspondem a " + resultadoFormatado.format(resultado) + " léguas", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;   
		                
		                case "MILHAS PARA KILÔMETROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter milhas para kilômetros");
		                    resultado = (montante * 1.609f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " milhas correspondem a " + resultadoFormatado.format(resultado) + " kilômetros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "MILHAS NAUTICAS PARA KILOMETROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter milhas náuticas para kilômetros");
		                    resultado = (montante * 1.852f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " milhas náuticas correspondem a " + resultadoFormatado.format(resultado) + " kilômetros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break;
		                case "LEGUAS PARA KILOMETROS":
		                	JOptionPane.showMessageDialog(null,"Você escolheu converter léguas para kilômetros");
		                    resultado = (montante / 4.828f);
		                    JOptionPane.showMessageDialog(null,
		                            montante + " léguas correspondem a " + resultadoFormatado.format(resultado) + " kilômetros", "RESULTADO", JOptionPane.INFORMATION_MESSAGE, conversorDistancia);
		                    break; 
	                }
	                
	                sairDoPrograma();//terminates program
/**
*In case of invalid value, some character other than numbers or blank,
*the method returns a JOptionPane Message Dialog saying so.
*Also calls method to run program from beginning all over again.
*/
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente.", "ERRO",
	                        JOptionPane.WARNING_MESSAGE);
	                executarConversao(); // run converter method restarts from begin
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Cancelando o programa.");
	            System.exit(0);
	        }
	    }
/**
*User can terminate program.
*The method uses showOptionDialog with YES_NO_CANCEL options
*/
		 public static void sairDoPrograma() {
		        int confirmacao = JOptionPane.showOptionDialog(null, "Deseja sair do programa?", "SAIR?",
		                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirmacao == JOptionPane.YES_OPTION) {//in case user wishes really terminate program
		                            JOptionPane.showMessageDialog(null, "Encerrando o programa. Tchau!");
		                            System.exit(0);
		        } else if (confirmacao == JOptionPane.CANCEL_OPTION) {//in case user clicks cancel option , same will happen
		                            JOptionPane.showMessageDialog(null, "Cancelando o programa. Até breve!");
		                            System.exit(0);
		        } else {
		                            executarConversao(); 
		                            }
		 }

/**
*@param args
*Method is used by Escolhedor program to run this Distance Converter as well to run this program itself separately.
*/
	public static void main(String[] args) {

			 executarConversao();
		}	
}