package utilita;

import java.io.IOException;

public class menu2 
{

	private String[] elencoVoci;
	private int numeroVoci;
	
	public menu2(String[] elenco)
	{
		numeroVoci=elenco.length;
		elencoVoci=new String [numeroVoci];
		for (int i = 0; i < numeroVoci; i++) 
		{
			elencoVoci[i]=elenco[i];
		}
		
	}
	
	
	public void visualizza()
	{
		for (int i = 0; i <numeroVoci; i++) 
		{
			System.out.println(elencoVoci[i]);
		}
	}
	
	public int scelta()
	{
		
		ConsoleInput tastiera=new ConsoleInput();
		
		int scelta=-1;
		
		do
		{
			visualizza();
			System.out.println("Scegli-->");
			try 
			{
				scelta=tastiera.readInt();
				if (scelta<0 || scelta>=numeroVoci)
					System.out.println("Voce non presente");
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("Formto non numerico. Reinserire");
			} 
			catch (IOException e) 
			{
				System.out.println("Errore nell'acquisizione del dato di input");
			}
		}while(scelta<0 || scelta >=numeroVoci);
		
		return scelta;
	}
	
}
