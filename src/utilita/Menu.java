package utilita;

import java.io.IOException;

public class Menu 
{
	
	private String[] elencoVoci;
	private int numeroVoci;
	private String titolo;
	
	
	public Menu(String titolo,String elenco[])
	{
		numeroVoci=elenco.length;
		this.titolo=titolo;
		elencoVoci=new String[numeroVoci];
		for (int i = 0; i < numeroVoci; i++)
		{
			elencoVoci[i]=elenco[i];
		}
	}
	
	public void visualizza()
	{
		for (int i = 0; i < numeroVoci; i++) 
		{
			System.out.println(elencoVoci[i]);
		}
	}
	
	public int scelta()
	{
		int voceScelta=-1;
		ConsoleInput tastiera= new ConsoleInput();
		
		do
		{
			System.out.println("MENU "+titolo);
			visualizza();
			System.out.println("Scegli voce:");
			try 
			{
				voceScelta=tastiera.readInt();
				if (voceScelta<0||voceScelta>=numeroVoci)
					System.out.println("Scelta non consentita. Ripetere la scelta");
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("Formato non corretto. Ripetere la scelta.");
			} 
			catch (IOException e) 
			{
				System.out.println("Impossibile leggere dal dispositivo di input.");
			}
		} while (voceScelta<0 || voceScelta>=numeroVoci);
		
		return voceScelta;

		
		
		
	}
	
	
}
