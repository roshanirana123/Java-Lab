import java.io.*;
public class FileCreateDemo {
    public static void main (String[] args) {
		try{
		 System.out.println("creating txt file");
	     FileOutputStream output=new FileOutputStream("hello.txt"); 
		 String value="Namaskar sathi ho from aadim college.";
		 byte[] bytes = value.getBytes();
		 output.write(bytes);
		 output.close();
		 System.out.println("txt file created successfully.");
		 
		
       } catch (FileNotFoundException fnfe){
	   fnfe.printStackTrace();
       }catch (IOException ioe){
		   ioe.printStackTrace();

	   }
	
	 }   
 } 
	