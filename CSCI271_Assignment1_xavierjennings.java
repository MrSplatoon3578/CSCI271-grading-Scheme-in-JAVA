import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CSCI271_Assignment1_xavierjennings {
	public static void main(String[] args) {
		try {
                	File file = new File("assignment1_data");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()){
                        	String line = sc.nextLine();
				String[] fields = line.split(",");
				for
                                //System.out.println(line);



			}

			sc.close();
		} 	catch (FileNotFoundException e) {
		  	System.out.println("error!!!!");
		  	e.printStackTrace();
	        }


	}


}


