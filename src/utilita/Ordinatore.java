package utilita;
/**
 * Classe che consente l'ordinamento crescente 
 * e decrescente di stringhe di array di interi e di array di stringhe
 * @author Laini Gian Marco
 *
 */
public class Ordinatore 
{
	/**
	 * Metodo privato che scambia fra loro due interi di un'array di interi
	 * @param array	Array su cui effettuare lo scambio
	 * @param pos1	posizione del primo elemento da scambiare
	 * @param pos2	posizione del secondo elemento da scambiare
	 */
	private static void scambia (int[] array, int pos1, int pos2)
	{
		int s=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=s;
	}
	
	/**
	 * Metodo privato che scambia fra loro due Stringhe di un'array di stringhe
	 * @param array	Array su cui effettuare lo scambio
	 * @param pos1	posizione del primo elemento da scambiare
	 * @param pos2	posizione del secondo elemento da scambiare
	 */
	private static void scambia (String[] array, int pos1, int pos2)
	{
		String s=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=s;
	}
	
	
	/**
	 * Metodo statico che ordina una array di interi in ordine crescente utilizzando l'algoritmo 
	 * Selection Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati 
	 */
	
	public static int[] insertionSortCrescente(int[] array)
	{
		//creo una copia dell'array da ordinare
		int[] risultato=new int[array.length];
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[j]<risultato[i])
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di interi in ordine decrescente utilizzando l'algoritmo 
	 * Selection Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati in ordine decrescente
	 */
	public static int[] insertionSortDecrescente(int[] array)
	{
		//creo una copia dell'array da ordinare
		int[] risultato=new int[array.length];
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[j]>risultato[i])
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	/**
	 * Metodo statico che ordina una array di stringhe in ordine alfabetico (A-Z) utilizzando l'algoritmo 
	 * Selection Sort. L'algoritmo non è Case sansitive, quindi ordina indipndentemente dal fatto che una stringa
	 * contenga lettere minuscole o maiuscole.
	 * @param array Array di stringhe da ordinare
	 * @return Altro array di stringhe con i valori ordinati alfabeticamente (A-Z)
	 */
	public static String[] insertionSortCrescente(String[] array)
	{
		//creo una copia dell'array da ordinare
		String[] risultato=new String[array.length];
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[i].compareToIgnoreCase(risultato[j])>0)
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di stringhe in ordine alfabetico decrescente (Z-A) utilizzando l'algoritmo 
	 * Selection Sort. L'algoritmo non è Case sansitive, quindi ordina indipndentemente dal fatto che una stringa
	 * contenga lettere minuscole o maiuscole.
	 * @param array Array di stringhe da ordinare
	 * @return Altro array di stringhe con i valori ordinati in ordine alfabetico decrescente (Z-A)
	 */
	public static String[] insertionSortDecrescente(String[] array)
	{
		//creo una copia dell'array da ordinare
		String[] risultato=new String[array.length];
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[i].compareToIgnoreCase(risultato[j])<0)
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di interi in ordine crescente utilizzando l'algoritmo 
	 * Bubble Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati 
	 */
	
	public static int[] bubbleSortCrescente(int[] array)
	{
		//creo una copia dell'array da ordinare
		int[] risultato=new int[array.length];
		Boolean scambioAvvenuto=false;
		
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		do
		{
			scambioAvvenuto=false;
			for (int i = 0; i < risultato.length-1; i++) 
			{
				if (risultato[i]>risultato[i+1])
				{
					scambia(risultato,i,i+1);
					scambioAvvenuto=true;
				}	
			}
		}
		while (scambioAvvenuto);
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di interi in ordine decrescente utilizzando l'algoritmo 
	 * Bubble Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati 
	 */
	
	public static int[] bubbleSortDecrescente(int[] array)
	{
		//creo una copia dell'array da ordinare
		int[] risultato=new int[array.length];
		Boolean scambioAvvenuto=false;
		
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		do
		{
			scambioAvvenuto=false;
			for (int i = 0; i < risultato.length-1; i++) 
			{
				if (risultato[i]<risultato[i+1])
				{
					scambia(risultato,i,i+1);
					scambioAvvenuto=true;
				}	
			}
		}
		while (scambioAvvenuto);
		return risultato;
	}

	
	/**
	 * Metodo statico che ordina una array di stringhe in ordine alfabetico crescente (A-Z) utilizzando l'algoritmo 
	 * Bubble Sort. L'algoritmo non è Case sansitive, quindi ordina indipndentemente dal fatto che una stringa
	 * contenga lettere minuscole o maiuscole.
	 * @param array Array di stringhe da ordinare
	 * @return Altro array di stringhe con i valori ordinati in ordine alfabetico crescente (A-Z)
	 */
	
	public static String[] bubbleSortCrescente(String[] array)
	{
		//creo una copia dell'array da ordinare
		String[] risultato=new String[array.length];
		Boolean scambioAvvenuto=false;
		
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		do
		{
			scambioAvvenuto=false;
			for (int i = 0; i < risultato.length-1; i++) 
			{
				if (risultato[i].compareToIgnoreCase(risultato[i+1])>0)
				{
					scambia(risultato,i,i+1);
					scambioAvvenuto=true;
				}	
			}
		}
		while (scambioAvvenuto);
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di stringhe in ordine alfabetico decrescente (Z-A) utilizzando l'algoritmo 
	 * Bubble Sort. L'algoritmo non è Case sansitive, quindi ordina indipndentemente dal fatto che una stringa
	 * contenga lettere minuscole o maiuscole.
	 * @param array Array di stringhe da ordinare
	 * @return Altro array di stringhe con i valori ordinati in ordine alfabetico decrescente (Z-A)
	 */
	
	public static String[] bubbleSortDecrescente(String[] array)
	{
		//creo una copia dell'array da ordinare
		String[] risultato=new String[array.length];
		Boolean scambioAvvenuto=false;
		
		for (int i = 0; i < risultato.length; i++) 
		{
			risultato[i]=array[i];
		}
		
		do
		{
			scambioAvvenuto=false;
			for (int i = 0; i < risultato.length-1; i++) 
			{
				if (risultato[i].compareToIgnoreCase(risultato[i+1])<0)
				{
					scambia(risultato,i,i+1);
					scambioAvvenuto=true;
				}	
			}
		}
		while (scambioAvvenuto);
		return risultato;
	}
	
}
