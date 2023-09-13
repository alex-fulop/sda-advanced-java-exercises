package inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) {
//		crea un obiect pentru lucrul cu fisier
		File file = new File("resources/catei.txt");

		if (file.exists()) {
			System.out.println("That file exists! :0");
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.getPath());

//			Verifica daca fisierul este un fisier (adica nu e folder)
			System.out.println(file.isFile());

//			sterge fisierul
//			file.delete();

//			folosit pentru a scrie intr-un fisier

			try {
//				Folosim FileWriter ca sa scriem in fisier
				FileWriter writer = new FileWriter("resources/catei.txt");
				writer.write("Bichon\nHuskey\nPitbull\nPug\n");
				writer.close();

//				Folosim FileReader ca sa citim din fisier
				FileReader reader = new FileReader("resources/catei.txt");
				int data = reader.read();
				while (data != -1) {
					System.out.print((char) data);
					data = reader.read();
				}

			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		} else {
			System.out.println("That file doesn't exist :(");
		}
	}
}
