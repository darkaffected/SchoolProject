import java.util.Scanner;
import java.io.*;
public class CScrape {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	
		System.out.println("Enter file name: ");
		String file_name = input.nextLine();
	
	
		try {
			File reader = new File(file_name);
			Scanner in = new Scanner(reader);
			file_name = file_name.substring( 0, file_name.indexOf('.'));
			file_name = file_name + ".txt";
			
			PrintWriter writer = new PrintWriter("poop.java");
			writer.println("test");
			writer.close();
			
			
		}
		catch(IOException e) {
			System.out.println("Unable to read file: " + file_name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter file name: ");
		String file_name = input.nextLine();
		String readLine = null;
		
		InputStream inStr = null;
		OutputStream outStream = null;
		
		//String New_file = file_name.substring(0, file_name.length()-5)+".txt";
		
		
		try{
			
			String file_dir = System.getProperty("user.dir")+"\\"+file_name;
			
			File afile = new File(file_dir);
			File bfile = new File("C:\\Windows\\Temp\\"+New_file);
			
			inStr = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);
				
			byte[] buffer = new byte[1024];
				
			int length;
			while ((length = inStr.read(buffer))> 0) {
				outStream.write(buffer, 0, length);
			}
			
			inStr.close();
			outStream.close();
			
			System.out.println("File has successfully copied.");
			}catch (IOException er) {
				er.printStackTrace();
			}
		
		
		try {

			FileReader reader = new FileReader("C:\\Windows\\Temp\\"+New_file);
			
			BufferedReader buffReader = new BufferedReader(reader);
			
			while ((readLine = buffReader.readLine()) !=null ) {
				System.out.println(readLine);
			}
			
			buffReader.close();
			
		}
		catch (IOException Error) {
			System.out.println("Unable to read file: " + file_name);
		}
	
	
	
	
	*/
	
	
	
	
	}

}
