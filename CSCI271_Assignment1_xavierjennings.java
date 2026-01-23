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
				String name = fields = line.split(",");

				double assignment_Sum = 0;
				double test_Sum = 0;

				for (int i = 1; i <= 7; i++){
					assignments_Sum += Double.parseDouble(fields[i]);
				}

				for (int i = 8; i <= 14; i++){
					test_Sum += Double.parseDouble(fields[i]);
				}

				double assignment_Avg = assignment_Sum / 7;
				double test_Avg = test_Sum / 7;

				double midterm = Double.parseDouble(fields[15]);
				double final_Exam = Double.parseDouble(fields[16]);

				double E = 0.4 * final_Exam + 0.2 *midterm + 0.1 * test_Avg

				double G;

				if (E < 60){
				G = E;
				}
				else if ( E < 80) {
					double W = ((E - 60) / 20) * 0.3;
					G = (1 - W) * E + W * assignment_Avg;
				}
				else {
					G = 0.4 * final_exam + 0.2 * midterm + 0.1 * test_Avg + 0.3 * assignment_avg

			}

			sc.close();
		} 	catch (FileNotFoundException e) {
		  	System.out.println("error!!!!");
		  	e.printStackTrace();
	        }


	}


}


