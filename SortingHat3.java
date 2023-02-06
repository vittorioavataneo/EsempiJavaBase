import java.util.Arrays;
public class SortingHat3{
	public static void main(String[] args){
		System.out.println("benvenuti al nuovo anno di Java Howarts!");
		System.out.println("Il cappelo selezionatore vi asegnara a le vostre case...");

		int n = askNumber("Quanti studenti ci sono questo anno magico? ");
		int capienza = n / NUMERO_CASE;
		int rimanenti = n % NUMERO_CASE;

		String [][] houses = new String [NUMERO_CASE][capienza];
		for (int i = 0; i <= capienza * NUMERO_CASE; i++ ){
		   	String nome = ask("inserisci il nome del prossimo studente oppure basta per terminare");
		  	int hn = hashName(nome);  
		   	int r = dado.nextInt(4);
		  	if (r == 0){
		    		 hn += RANDOM_ADD;
		        }

		        int pos = hn % NUMERO_CASE; //è id casa
		        boolean full = isHouseFull(pos,houses, capienza);
			
		        if (!full){
		        	int col = addToHouse(nome,pos,houses);
			   		System.out.println("studente inserito nella colonna " + col);
		        }
		        else {
                	do {
			    		pos = (pos + 1)%NUMERO_CASE; 
						
		        	}while(isHouseFull(pos, houses, capienza));       
					int col = addToHouse(nome,pos,houses);
					System.out.println("studente inserito nella colonna " + col);
		   		}	
		}
		System.out.println(Arrays.deepToString(houses));
	}



	public static java.util.Scanner console = new java.util.Scanner(System.in);
	public static java.util.Random dado = new java.util.Random();

		public static final int NUMERO_CASE = 4;
		public static final int GRIFFINDOR = 0;
		public static final int RAVENCLAW = 1;
		public static final int HUFLEPUFF = 2;
		public static final int SLYTHERIN = 3;
		public static final int RANDOM_ADD= 3;
	
	public static String ask(String prompt){
		System.out.print(prompt + ": ");
		String answer = console.nextLine(); 
		return answer;
	}  
	 public static int askNumber(String promt){
	 		System.out.print(promt + ": ");
			String answer = console.nextLine(); 
			int n = Integer.parseInt(answer);
			return n;
	}

	public static int hashName(String name){
		String noSpace = name.replace(" ","").toLowerCase();
		int hash = 0;
		for(int i=0;i<noSpace.length();i++){                                           
			hash= hash + noSpace.codePointAt(i) * (int)Math.pow(7, i);
		}
		return hash;
	}

	public static boolean isHouseFull(int pos, String[][] c, int capienza){
	  if (c[pos][capienza-1] != null){
	    return true;                                                                
	  }
	  return false;                                 
	}


	public static int addToHouse(String n, int p, String [][] c){
		String[] house = c[p];
		int col = 0;
		while(house[col] != null){
		  col++;	 
		}
		house[col] = n;		
		return col;
	}


}


































/*
-con input da tastiera per riempire l'array
-dovrà creare un array di stringhe con nome e cognome
-dovrà modificare l'array togliendo lo spazio e farle diventare minuscole
-per ogni nome deve eseguire un algoritmo che prenda il nome e genererà un numero intero

sum=c0*7^0 + c1*7^1 + c2*7^2 + c3*7^3...

-in maniera random una volta su quattro aggiungere il numero 3(se capita) al totale, questo per ogni persona
-dividere il numero totale per 4, se resto:
		0 = gryffindor
		1 = slytherin
		2 = hufflepuff
		3 = ravenclaw

-colcolare la grandezza massima in base a quanti siamo e tenere traccia delle assegnazioni, quando una casa raggiunge il numero massimo
verrà esclusa dalle assegnazioni quindi verrà assegnata alla casa dopo disponibile (quindi dobbiamo dividerci equamente)
-se ci dovessero essere deile persone restanti e le case sono tutte piene 
i restanti verranno assegnati a caso ad una casa tramite un numero casuale, (massimo 1 per casa)

*/