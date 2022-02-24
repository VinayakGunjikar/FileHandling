package fileHandling;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileHandling {

		
	public static void main(String[] args)throws IOException  {
		Scanner in = new Scanner(System.in);
	System.out.println("Welcome to File handling  ");
	System.out.println("Enter your choice:");
	int choice=in.nextInt();
	switch (choice) {
	case 1: System.out.println("Read the file"); 

	    File file = new File( "C:\\New folder\\FileHandling.txt");
	    Scanner sc = new Scanner(file);
	 while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	break;
	case 2: System.out.println("Write into the file"); 
	String text = "Hello\nWriting into file was succesful";
Path fileName = Path.of( "C:\\New folder\\FileHandling.txt");
Files.writeString(fileName, text);
String file_content = Files.readString(fileName);
System.out.println(file_content);
	break;
case 3: System.out.println("Append the file");
	{
		String textToAppend = "\r\n Thank You !!"; 

	    Path path = Paths.get( "C:\\New folder\\FileHandling.txt");
	    Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
	}
	break;
}
}

private static void write(Path path, byte[] bytes, StandardOpenOption append) {
	
}

private static String readString(Path fileName) {
	return null;
}

private static void writeString(Path fileName, String text) {
	
}
}



