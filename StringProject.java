//One that writes a String to a file
//One that reads from a file to a String
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class StringProject
{
    public StringProject()
    {

    }
    public void writeFile(String inputContent) throws IOException
    {
        PrintWriter pw = new PrintWriter("This is the output file");
        pw.print(inputContent);
        pw.close();
            
    }
    public String readFile(String fileName) throws IOException 
	{
		 BufferedReader br = new BufferedReader(new FileReader (fileName));
	        try
	        {
	            String string = "";
	            while(br.ready())
	            {
	                string += (char)br.read();
	            }
	            br.close();
	            return string;
	        }
	        catch(FileNotFoundException e)
			{
				return "File not found, whoops!";
			}
	 }
}