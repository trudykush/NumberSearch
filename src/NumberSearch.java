import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;


public class NumberSearch {
	
	public static void main(String[] args) throws FileNotFoundException {
		String[] words=new String[500];     //string creation for file storage  
		ArrayList<String> list=new ArrayList<String>();
		String search = null, name;
		name = JOptionPane.showInputDialog ( null, "Enter the file name " );  // Retrieving the file
		
		FileReader readMyFile = new FileReader(name);  //Create object of FileReader to read a file
		Scanner scanFile = new Scanner(readMyFile);
		
		int i = 0;
		 while(scanFile.hasNext())  //copy file to array
		 {
			String start = scanFile.next();
			words[i] = start;
			i++;
		 }
		
		 int count=0;
		 for(int j=0;j<words.length;j++)  //Iterate loop till file length
		 {
		   try {
			 Double.parseDouble(words[j]);	//for checking input
			 String a= " "+words[j-1]+" "+words[j]+" "+words[j+1]+"\n";
			 list.add(count, a);
			 count++;
		   } 
		   catch (Exception e) {
			   System.err.println("Caught Exception: " + e.getMessage()); // will display null if no exceptions caught
		   }	
			
		}
		JOptionPane.showMessageDialog(null,list);
		
	}

}
	