package LastDayPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("ExampleOutput.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("example of buffer writer");
			bw.close();
            System.out.println("Data written to file successfully.");

		
	} catch (IOException e) {
        e.printStackTrace();
    }
	}
}
