import java.util.Random;


public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		
		double totaleIncassi = 0;
		double incasso = 0;
		double[] incassiGiornalieri = new double[30];
		
		String[] giorniSettimana = {"Lunedi","Martedi","Mercoledi","Giovedi","Venerdi","Sabato","Domenica"	
		};        // Java in automatico riconosce di quanti elementi è composto il vettore stringa
		
		
		for (int giorno=0; giorno<30; giorno++)
		{
			System.out.print("Inserire l'incasso per il giorno "+giorno+": ");
			incassiGiornalieri[giorno] = r.nextDouble()*10000;
			System.out.println(incassiGiornalieri[giorno]);
			
			totaleIncassi +=incassiGiornalieri[giorno];
		}
		
		double mediaIncassi = totaleIncassi/30;
		System.out.println("\nIncasso medio giornaliero: "+mediaIncassi);
 
	}

}
