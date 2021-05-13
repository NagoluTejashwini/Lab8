package Lab8.assignment1;

import java.io.*;

public class FileProgram {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Users\\sms\\Desktop\\desktop[07-05-21]\\capgemini\\files1.txt");
		f.createNewFile();
		FileWriter f1 = new FileWriter(f);
		f1.write("Hi! Have a nice day. See you soon.");
		File f2 = new File("File2");
		
		 CopyDataThread obj = new CopyDataThread(f1,f2);
		 
		
		
	}

}