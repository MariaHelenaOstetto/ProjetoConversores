package br.com.conversores.Escolhedor;
import javax.swing.*;
import br.com.conversores.ConverteMedidas.ConversorDeUnidadesDeDistancia;
import br.com.conversores.ConverteMoedas.ConversorDeMoedas;
import br.com.conversores.ConverteMoedas.LerDoArquivoCSV;
import br.com.conversores.ConvertePesos.ConversorDeUnidadesDeMassa;
import br.com.conversores.ConverteTemperaturas.ConversorDeTemperaturas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

/**	    	 
*This program initializes the package and presents options to access the four unit converters programs in it.
*@version 0.1
*@author - Maria Helena Ostetto
*/
public class EscolherConversor {

/**	        
*Creates method to present and offer the options 
*Uses JPanel with animation informing the four converter programs from the package.
*Clicking OK calls the options panel. 
*/
	    public static void escolhaUmConversor() {

	      	while (true) {
	            ImageIcon imagem = new ImageIcon(EscolherConversor.class.getResource("CONVERSOR2.gif"));
	            JLabel icon = new JLabel(imagem);
	            
	            JLabel text = new JLabel("CONVERSOR DE UNIDADES", JLabel.CENTER);
	            text.setFont(new Font("Tahoma", Font.BOLD, 28));
	            
	            JLabel text2 = new JLabel("Bem vindos! Este programa possui quatro conversores", JLabel.CENTER);
	          
	            
	            JPanel panel = new JPanel();
	            panel.setLayout(new BorderLayout());
	            panel.add(icon, BorderLayout.CENTER);
	            panel.add(text, BorderLayout.NORTH);
	            panel.add(text2, BorderLayout.SOUTH);
	            
	            JOptionPane.showMessageDialog(null, panel, "Bem Vindos!", JOptionPane.PLAIN_MESSAGE);
	
	            String[] escolha = {"CONVERSOR DE UNIDADES MONETARIAS", "CONVERSOR DE TEMPERATURAS",
	                    "CONVERSOR DE UNIDADES DE DISTÂNCIA", "CONVERSOR DE UNIDADES DE MASSA"};
	            	
	            Object escolhaQuatroOpcoes = JOptionPane.showInputDialog(null, "Escolha um Conversor",
	                    "CONVERSORES DE UNIDADES", JOptionPane.PLAIN_MESSAGE, null, escolha,
	                    "CONVERSOR DE UNIDADES MONETARIAS");
/**
*In case of choice not null (using if condition), switch method creates multiple choices of converters.
*Program remembers user from his choice using JOptionPane MessageDialog.
*Following it, program calls the chosen converter to run.     
*/
	            if (escolhaQuatroOpcoes != null) {
	                String escolhaSelecionada = escolhaQuatroOpcoes.toString();
	                switch (escolhaSelecionada) {
	                    case "CONVERSOR DE UNIDADES MONETARIAS":
	                    	JOptionPane.showMessageDialog(null, "Você escolheu CONVERTER MOEDAS");
	                        ConversorDeMoedas conversor = new ConversorDeMoedas();
	            			Map<String, Float> cotacoes = LerDoArquivoCSV.obterCotacoes();
	            			conversor.executarConversao(cotacoes);
	                        break;
	                    case "CONVERSOR DE TEMPERATURAS":
	                        JOptionPane.showMessageDialog(null, "Você escolheu CONVERTER TEMPERATURAS");
	                        ConversorDeTemperaturas converterTemperaturas = new ConversorDeTemperaturas();
	                        converterTemperaturas.executarConversao();
	                        break;
	                    case "CONVERSOR DE UNIDADES DE DISTÂNCIA":
	                        JOptionPane.showMessageDialog(null, "Você escolheu CONVERTER DISTÂNCIAS");
	                        ConversorDeUnidadesDeDistancia converteDistancias = new ConversorDeUnidadesDeDistancia();
	                        converteDistancias.executarConversao();
	                        break;
	                    case "CONVERSOR DE UNIDADES DE MASSA":
	                        JOptionPane.showMessageDialog(null, "Você escolheu CONVERTER UNIDADES DE MASSA");
	                        ConversorDeUnidadesDeMassa convertePesos = new ConversorDeUnidadesDeMassa();
	                        convertePesos.executarConversao();
	                        break;
	                }
/**
*Using JOptionPane ShowConfirmDialog YES_NO_CANCEL option in case user wishes
*or not terminate program.   
*/
	            } else {
	                int choice = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Programa?",
	                        "ENCERRAR PROGRAMA?", JOptionPane.YES_NO_CANCEL_OPTION);

	                if (choice == JOptionPane.YES_OPTION) {
	                    JOptionPane.showMessageDialog(null, "Encerrando o Programa...");
	                    System.exit(0);
	                } else if (choice == JOptionPane.CANCEL_OPTION) {
	                    JOptionPane.showMessageDialog(null, "Cancelando o Programa...");
	                    System.exit(0);
	                }
	            }
	        }
	    }

	    private void setIcon(Image icone) {
			
	    	return;
		}

/**
*@param args
*Constructors and methods to process other programs and run this program itself separately.
*/
		public static void main(String[] args) {
			EscolherConversor escolhaUmConversor = new EscolherConversor();
	        escolhaUmConversor.escolhaUmConversor();
	        ConversorDeMoedas conversor = new ConversorDeMoedas();
			Map<String, Float> cotacoes = LerDoArquivoCSV.obterCotacoes();
			conversor.executarConversao(cotacoes);
	    }


		
	}
