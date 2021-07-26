import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Story1 {
	Scanner in = new Scanner(System.in);
	private static final String SAMPLE_CSV_FILE_PATH = "E:\\LTI\\mini_project\\Mini Project I\\Java and SAP ABAP\\complaints.csv";
	public void display() throws IOException, ParseException{
		
		 try (
		            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
		            CSVReader csvReader = new CSVReader(reader);
		        ) 
		 {
		 String[] nextRecord;
				 System.out.println("Enter Year");
				
		            String date_received=in.next();
		           
		            while ((nextRecord = csvReader.readNext()) != null) {
		            	String date4 = nextRecord[0];
		        		
		        		String s10[] = date4.split("/");
		            	//String s[]=nextRecord[0].split("/");
		            	if(s10[s10.length-1].equals(date_received))
		            	{
		            		 System.out.println("Date Received                : " + nextRecord[0]);
		                     System.out.println("Product                      : " + nextRecord[1]);
		                     System.out.println("Sub-product                  : " + nextRecord[2]);
		                     System.out.println("Issue                        : " + nextRecord[3]);
		                     System.out.println("Sub-issue                    : " + nextRecord[4]);
		                     System.out.println("Company                      : " + nextRecord[5]);
		                     System.out.println("State                        : " + nextRecord[6]);
		                     System.out.println("ZIP code                     : " + nextRecord[7]);
		                     System.out.println("Submitted via                : " + nextRecord[8]);
		                     System.out.println("Date sent to company         : " + nextRecord[9]);
		                     System.out.println("Company response to consumer : " + nextRecord[10]);
		                     System.out.println("Timely response?             : " + nextRecord[11]);
		                     System.out.println("Consumer disputed?           : " + nextRecord[12]);
		                     System.out.println("Complaint ID                 : " + nextRecord[13]);
		                     System.out.println("=================================================");
		            	}
		               
		            }
	}
	
}
}