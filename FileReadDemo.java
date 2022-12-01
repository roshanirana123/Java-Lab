import java.io.*;
public class FileReadDemo {
    public static void main (String[] args) throws FileNOtFoundException,IoExceptrion{
		FileInputStream fis =new FileInputStream("hello.text");
		int i=0;
		while((i=fis.read())!= -1){
			system.out.print((char)i);
		}
		fis.close();
	}
 }