import java.io.IOException;

public class StringProjectTester 
{
    public static void main(String[] args) throws IOException 
	{
		StringProject tester = new StringProject();
		//tester.writeFile("Yeah");
        System.out.println(tester.readFile("ReadThisFile"));
	}
}
