//One that writes a String to a file
//One that reads from a file to a String
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class StringProject
{
    public StringProject()
    {

    }
    public void writeFile(String inputName) 
    {
        try{
            // Create new file
            String content = "This is the content to write into create file";
            String fileName = inputName + ".txt";
            File file = new File(fileName);

            // If file doesn't exists, then create it
            if (!file.exists()) 
            {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);

            // Close connection
            bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
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