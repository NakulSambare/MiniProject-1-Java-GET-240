import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;
public class Complaints {
    private static final String SAMPLE_CSV_FILE_PATH = "E:\\LTI\\mini_project\\Mini Project I\\Java and SAP ABAP\\complaints.csv";

    public static void main(String[] args) throws IOException, ParseException {
    	Scanner in = new Scanner(System.in);
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            System.out.println("Enter Choice \n 1.Display all the complaints based on the year provided by the user \n 2.Display all the complaints based on the name of the bank provided by the user  \n 3.Display complaints based on the complaint id provided by the user ");
            System.out.println("4.Display all the complaints closed/closed with explanation");
            System.out.println("5.Display all the complaints which received a timely response");
            System.out.println("6.Display number of days took by the Bank to close the complaint");
            int ch=in.nextInt();
           switch (ch) {
		case 1:
			Story1 s1 = new Story1();
			s1.display();
			break;
		case 2 :
			Story2 s2 = new Story2();
			s2.display();
	            break;
		case 3 :
			Story3 s3 = new Story3();
			s3.display();
            break;
		case 4 :
			//System.out.println("Enter Complaint ID ");
           // String closed=in.next();
           Story4 s4 = new Story4();
           s4.display();
            break;
            
		case 5 :
			//System.out.println("Enter Complaint ID ");
           // String closed=in.next();
          Story5 s5 = new Story5();
          s5.display();
            break;
		case 6 :
			//System.out.println("Enter Complaint ID ");
           // String closed=in.next();
          Story6 s6 = new Story6();
          s6.display();
            break;
            
		default:
			break;
		}
            
         
           
        }
    }
}