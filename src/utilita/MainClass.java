package utilita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainClass 
{

	public static void main(String[] args) throws IOException
	{
		
		TextFile reader = null;
		try 
		{
			reader= new TextFile("prova.txt", 'R');
			while (true)
			{
				System.out.println(reader.fromFile());
			}		
		} 
		
		catch (EccezioneFile e) 
		{
			System.out.println(e.toString());
		} 
		catch (EccezioneTextFileEOF e) 
		{
			reader.closeFile();
		}
		
		catch (IOException e) 
		{
			System.out.println("Impossibile aprire il file");
		} 
	}

}
