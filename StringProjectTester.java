import java.io.IOException;

public class StringProjectTester 
{
    public static void main(String[] args) throws IOException 
	{
		StringProject tester = new StringProject();
		tester.writeFile("this is what I want to write to the file");
        System.out.println(tester.readFile("ReadThisFile"));
	}
}
