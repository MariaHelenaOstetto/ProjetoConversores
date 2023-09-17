package br.com.conversores.ConverteMoedas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Map;
import java.util.HashMap;
import br.com.conversores.ConverteMoedas.*;

/**
*This program returns the quotations.
*Reads and extracts information currencies from the csv file. 
*@version 0.1
*@author - Maria Helena Ostetto
*/
public class LerDoArquivoCSV {

/**
*Method obtain quotations information and stocks it in a HashMap to be used by Currency Converter program.
*@return cotacoes a list of quotations and its country's currencies from HashMap.
*/
	public static Map<String, Float> obterCotacoes(){
		Map<String, Float> cotacoes = new HashMap<String, Float>();
		String cotacoesCSV = "C:/Users/jrost_000/Pictures/FO/especializacaoAlura/ECLIPSEjre/ValorCotacoesDaWeb/InformacaoValorMoedas.csv";
		String csvDivisor = ";";
		String linha = "";
		int lineNumber = 0;
/**
*Reads file submitting it to BufferedReader and FileReader methods.
*Conditional method chooses only the 5 needed currencies and floats its for sale values. 		
 */
		try {
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader(cotacoesCSV));
	            while ((linha = br.readLine()) != null) {
	                String[] cotacao = linha.split(csvDivisor);
	                String unidadeMonetaria = cotacao[3];
	                float valorParaVenda = Float.parseFloat(cotacao[5].replace(",", "."));
	                cotacoes.put(unidadeMonetaria, valorParaVenda);
	                if(unidadeMonetaria.equals("USD") || unidadeMonetaria.equals("EUR") || unidadeMonetaria.equals("GBP") || unidadeMonetaria.equals("ARS") || unidadeMonetaria.equals("CLP")) {
		            	System.out.println("Unidade Monetaria: " + unidadeMonetaria + " Cotação: " + valorParaVenda);
		            }
	                }
/**
 *Method closes opened streams.
 */
	    br.close();        
	    }
/**
*Block surrounded with try catch to get eventual exception errors, 
*such as file not found or no space on disk,  
*so errors can be backtracked for eventual corrections.
*/
		 catch (FileNotFoundException e) {
	        e.printStackTrace();
	     } catch (IOException e) {
	        e.printStackTrace();
	    }
/**
 *Returns actualized quotation values.
 */
		return cotacoes;
		} 
/**
*Creates float variable values referring to for sale values from latest quotations.
*/
	public float valorParaVenda;
/**
*Creates String variable referring to a list of quotations from HashMap.
*/
	public String cotacoes;
/**
*Creates String variable referring to country's currencies.
*/
	public String unidadeMonetaria;
	
/**
*@param args
*Method is used by the Currency Converter program and can run this program separately.
*/
	public static void main(String[]args) {

		obterCotacoes();
		
	}	}		