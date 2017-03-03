import static java.lang.System.out;

import java.util.Scanner;
import java.io.*;
public class CScrape {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		

			System.out.println("Enter file name (i.e test.java: ): ");
			String file_name = input.nextLine();
	
			input.close();
	try {
		
			if(file_name.substring(0, file_name.indexOf('.')) != "."   ){
				System.out.println("Error no '.' found");
			}
			
			file_name = file_name.substring(0, file_name.indexOf('.'));

		
			FileWriter fw = new FileWriter(file_name + ".txt");
			PrintWriter pw = new PrintWriter(fw);
		
		
			System.out.println("Comment Scrape - B. Farias\n");
			pw.println("1:" + "/*****************************************");
			pw.println("2" + " ** This is my program // Weird comment! **");
			pw.println("3" + "*****************************************/");
			pw.println("4" + "/* Amount available */");
			pw.println("5" + "/* Amount available */");
			pw.println("6" + " /* This is my code */");
		
		
		
			fw.close();
			pw.close();
		
		} catch (IOException e) {
			out.println("Error.");
		}
		System.out.println("Successful.");
	
	
	
	
	try {
			FileReader fr = new FileReader(file_name + ".txt");
			BufferedReader br = new BufferedReader(fr);
		
			String str;
		
		
		
		
		
			while ((str = br.readLine())!=null) {
				out.println(str);
			}
			br.close();
		} catch (IOException e) {
			out.println("File not found.");
		}
	



	}
	}