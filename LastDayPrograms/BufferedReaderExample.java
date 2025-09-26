package LastDayPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class BufferedReaderExample {
	public static void main(String[] args)  throws IOException{
		try {
			BufferedReader br = new BufferedReader(new FileReader("ExampleOutput.txt"));
			String line;
			System.out.println("Reading file using BufferReader :");
			while((line =br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
//		
//			FileWriter fw=new FileWriter("ExampleOutput.txt");
//			BufferedWriter bw=new BufferedWriter(fw);
//			bw.write("example of buffer writer");
//			bw.close();
		
	}

}
