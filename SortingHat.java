import java.util.Arrays;
public class SortingHat{
    public static void main(String[] args){
        int pp = askNumber("Numero persone"); 
        int resto = pp % NumeroCase;
        String [] Persone = new String[pp];
        int capienzaMax = pp/NumeroCase;

        String [][] houses=new String[NumeroCase][capienzaMax + resto];

        for(int i=0; i<pp; i++){
            String s = ask("Nome");
            int idCasa = assegnazioneCasa(hashName(s));
            if(!isFull(houses, capienzaMax, idCasa)){
                System.out.println("Studente messo in "+ idCasa);
            }else {
                do {
			        idCasa = idCasa + 1; 
		        }while(isFull(houses, capienzaMax, idCasa));       
		   	}

            
        }
        System.out.println(Arrays.deepToString(houses));
        //printHouses(houses);

        
    }

    public static java.util.Scanner console = new java.util.Scanner(System.in);

    public static String ask(String prompt){
        System.out.print(prompt + ": ");
        String answer = console.nextLine(); //legge cosa abbiamo scritto
        return answer;
    }

    
    public static int askNumber(String prompt){
        System.out.print(prompt + ": ");
        String answer = console.nextLine();
        int n = Integer.parseInt(answer);  // trasforma la string in numero es. 3 e 2 diventano 32
        return n;
    }
    
    
    public static long hashName(String name){
        String noSpace = name.replace(" ","").toLowerCase();
        long hash = 0;
        for(int i=0; i<noSpace.length(); i++){
            hash = hash + noSpace.codePointAt(i)*(int)Math.pow(7,i); //7 è la base i è l'esponente
        }
        double random = Math.random()*5;
        int randomintero =(int)random;
        if(randomintero == 2){
            hash = hash + RandomNum;
        }
        return hash;
    }


    public static int assegnazioneCasa(long x){
        int casa=0;
        if(x % 4 == Gryffindor){
            casa=casa;
        } 
        else if(x % 4 == Slytherin){
            casa=casa+1;
        }
        else if(x % 4 == Hufflepuff){
            casa=casa+2;
        }
        else if(x % 4 == Ravenclaw){
            casa=casa+3;   
        }      
        return casa;     
    }

    public static boolean isFull(String[][] houses, int capienzaMax, int idCasa){
        if(houses[idCasa][capienzaMax-1]!=null){
            return true;
        }else return false;
    }



    /*public static void printHouses(String houses[][]){
        for(int i=0; i<houses.length;i++){
                System.out.println(Arrays.deepToString(houses)); 
            System.out.println();
        }
    }*/



        public static final int NumeroCase=4;
        public static final int Gryffindor=0;
        public static final int Slytherin=1;
        public static final int Hufflepuff=2;
        public static final int Ravenclaw=3;
        public static final int RandomNum=3;

}