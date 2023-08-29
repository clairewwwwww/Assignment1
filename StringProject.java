
//One that writes a String to a file
//One that reads from a file to a String
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;

public class StringProject {
	public StringProject() {

	}

	public void writeFile(String inputContent) throws IOException // inputContent = what the user want to write to the
																	// file
	{
		PrintWriter pw = new PrintWriter("This is the output file name"); // the name of the output file
		pw.print(inputContent); // print the content
		pw.close();

	}

	public String readFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName)); // the name of the file that want to read
		try {
			String string = "";
			while (br.ready()) {
				string += (char) br.read(); // read the char in the file, store to a string
			}
			br.close();
			return string; // return the string
		} catch (FileNotFoundException e) // if the file name is not found
		{
			return "File not found, whoops!";
		}
	}

	public int countCharacters(String filename) throws IOException {
		File file = new File(filename);

		if (!file.exists()) {
			throw new FileNotFoundException();
		}

		return (int) file.length();
	}
}