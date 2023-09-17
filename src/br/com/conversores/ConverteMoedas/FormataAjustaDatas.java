package br.com.conversores.ConverteMoedas;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.*;
import java.text.*;
import br.com.conversores.ConverteMoedas.*;

/**
*This program formats dates to extract actualized currencies values from Brazil's Central Bank url and stocks it into a local file.
*A given url is replaced with the actualized date.
*Program opens stream, goes to the actualized url, and downloads csv file offered by the site.
*Stocks it into a local file. 
*LerDoArquivoCSV class program reads this local csv file to process actualized quotations.
*Reads byte a byte all csv file.
*Quotations are get from for sale values.
*Site actualizes quotations 4 times a day on weekdays and don't actualize in the weekends.
*During weekends, program gets the last Friday date to extract the latest values.
*@version 0.1
*@author Maria Helena Ostetto
*/
public class FormataAjustaDatas {
/** *@param args
*Formats actual date and grabs DAY_OF_WEEK. 
*Uses Date, SimpleDateFormat and Calendar methods and its options.
*The formatted actualized date is used to replace url address.
*If it is Saturday or Sunday, program gets Last Friday's Date to replace date on url.
*/
	public static void main(String[] args) {
		
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	System.out.println(date);
	SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");//you can use any format that you want, for example:("yyyy/MM/dd")
	String s = SDF.format(date);
	//System.out.print(s + "\n");
	//se é sat ou sun precisa repetir a data da ultima fri
	//se é mon tue wed thu fri entao visita atualiza e muda para a data do dia
	String urlComDiaAtual = "https://www4.bcb.gov.br/Download/fechamento/20230619.csv";
	if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
	    String url = urlComDiaAtual.replace("20230619", s);
	    System.out.println(url);
	    String file = "C:/Users/jrost_000/Pictures/FO/especializacaoAlura/ECLIPSEjre/TesteConversorDeMoedas/";
	    String nomeArquivo = "InformacaoValorMoedas.csv";
/**
*Url is accessed by block of methods surrounded by try/catch.
*Method opens stream and reads byte a byte all the file.
 */
	    try {
	    InputStream is = new URL(url).openStream();
	    FileOutputStream fos = new FileOutputStream(file + nomeArquivo);
	    int contByte;
	    byte[] buffer = new byte[8192];
	    long tempo = System.currentTimeMillis();
	    while ((contByte = is.read(buffer)) >= 0) {
	    fos.write(buffer, 0, contByte);
	    }
/**
*Method closes streams and try catch advises possible Input or Output exceptions
* such as file not found, or no Internet, or even a problem with hard disk, or full drive.
*/
	    is.close();
	    fos.close();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }}
	    
/**
 *If it is Saturday or Sunday, method counts minus one until it is Last Friday Date.
 */
     if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            // Subtrai dias até chegar na última sexta-feira (6)
            while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
                calendar.add(Calendar.DAY_OF_WEEK, -1);
            }
        }
/**
 *Last Friday Date is get formatted and transfered to the url replacing its old date.
 *File is created to stock the csv file.  
 */
		Date lastFriday = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdf.format(lastFriday);
        System.out.println("Última sexta-feira: " + formattedDate);
        String url = urlComDiaAtual.replace("20230619", formattedDate);
	    System.out.println(url);
        String file = "C:/Users/jrost_000/Pictures/FO/especializacaoAlura/ECLIPSEjre/ValorCotacoesDaWeb/";
	    String nomeArquivo = "InformacaoValorMoedas.csv";
/**
*Same try catch surround block with same methods to open and then close stream.
*If some IO error happens it will show a backtrace of where the exception occurred.	   	   
 */
	    try {
	      
	    	InputStream is = new URL(url).openStream();
	    	FileOutputStream fos = new FileOutputStream(file + nomeArquivo);
	    	int contByte;
	    	byte[] buffer = new byte[8192];
	    	long tempo = System.currentTimeMillis();
	    	while ((contByte = is.read(buffer)) >= 0) {
	    		fos.write(buffer, 0, contByte);
	        }

	    	is.close();
	    	fos.close();
	     	} catch (IOException e) {
	    	e.printStackTrace();
	     	}

	    String cotacoesCSV = nomeArquivo;
	}
}