import java.io.IOException;

public class StringProjectTester {
	public static void main(String[] args) throws IOException {
		StringProject tester = new StringProject();
		String input = "this is what I want to write to the file";
		tester.writeFile(input);
		System.out.println(tester.readFile("ReadThisFile"));
		System.out.println("File length: " + tester.countCharacters("ReadThisFile"));
	}
}
