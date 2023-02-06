public class Prove{
    public static void main(String[] args){
        double random = Math.random()*5;
        int randomintero =(int)random;
    }



    public static int assegnazioneCasa(long x){
        int Casa = 0;
        if(Casa!=0){
            Casa=0;
        }
        if(x % 4 == 0){
            Casa = Casa + 1;
            System.out.println("Sei stato assegnato alla casa Gryffindor");
        }else if(x % 4 == 1){
            Casa = Casa + 2;
            System.out.println("Sei stato assegnato alla casa Slytherin");
        }else if(x % 4 == 2){
            Casa = Casa + 3;
            System.out.println("Sei stato assegnato alla casa Hufflepuff");
        }else if(x % 4 == 3){
            Casa = Casa + 4;
            System.out.println("Sei stato assegnato alla casa Ravenclaw");
        }
        return Casa;
    }


    public static void assegnazioneCasa(long x){
        if(x % 4 == 0){
            System.out.println("Sei stato assegnato alla casa Gryffindor");
        }else if(x % 4 == 1){
            System.out.println("Sei stato assegnato alla casa Slytherin");
        }else if(x % 4 == 2){
            System.out.println("Sei stato assegnato alla casa Hufflepuff");
        }else if(x % 4 == 3){
            System.out.println("Sei stato assegnato alla casa Ravenclaw");
        }
        return Casa;
    }

    public static int assegnazioneCasa(long x){
        //System.out.printil(x);
        int Casa = 0;
        if(Casa!=0){
            Casa=0;
        }
        if(x % 4 == 0){
            Casa = Casa + 1;
            System.out.println("Sei stato assegnato alla casa Gryffindor");
        }else if(x % 4 == 1){
            Casa = Casa + 2;
            System.out.println("Sei stato assegnato alla casa Slytherin");
        }else if(x % 4 == 2){
            Casa = Casa + 3;
            System.out.println("Sei stato assegnato alla casa Hufflepuff");
        }else if(x % 4 == 3){
            Casa = Casa + 4;
            System.out.println("Sei stato assegnato alla casa Ravenclaw");
        }
        return Casa;
    }

    public static int maxCasa(int x){
        int num = x / 4;
        int resto = x % 4;
        System.out.println("Il resto è "+ resto);
        return num;
    }

    public static int assegnazioneCasa2(long x, int y){
        //System.out.printil(x);
        int Casa = 0;
        int maxCasa = y / 4;
        int resto = y % 4;

        if(Casa!=0){
            Casa=0;
        }
        if(x % 4 == 0 && maxCasa!=0){
            maxCasa = maxCasa-1;
            Casa = Casa + 1;
            System.out.println("Sei stato assegnato alla casa Gryffindor");
            System.out.println("Ci sono ancora: "+ maxCasa + " posti.");
        }else if(x % 4 == 1 && maxCasa!=0){
            maxCasa = maxCasa-1;
            Casa = Casa + 2;
            System.out.println("Sei stato assegnato alla casa Slytherin");
            System.out.println("Ci sono ancora: "+ maxCasa + " posti.");
        }else if(x % 4 == 2 && maxCasa!=0){
            maxCasa = maxCasa-1;
            Casa = Casa + 3;
            System.out.println("Sei stato assegnato alla casa Hufflepuff");
            System.out.println("Ci sono ancora: "+ maxCasa + " posti.");
        }else if(x % 4 == 3 && maxCasa!=0){
            maxCasa = maxCasa-1;
            Casa = Casa + 4;
            System.out.println("Sei stato assegnato alla casa Ravenclaw");
            System.out.println("Ci sono ancora: "+ maxCasa + " posti.");
        }
        return Casa;
    }



public static int ConteggioCasa(int nPersone, int idCasa, String nomePersona){
        int capienzaMax = nPersone/4;
        String[] CasaGryffindor = new String[capienzaMax];
        String[] CasaSlytherin = new String[capienzaMax];
        String[] CasaHufflepuff = new String[capienzaMax];
        String[] CasaRavenclaw = new String[capienzaMax];
            if(idCasa == 0){
                CasaGryffindor[i] = nomePersona;
                for(int k=0; k<capienzaMax; k++){
                    System.out.println(CasaGryffindor[k]);
                }
            }else if(idCasa == 1){
                CasaSlytherin[i] = nomePersona;
                for(int k=0; k<capienzaMax; k++){
                    System.out.println(CasaSlytherin[k]);
                }
            }else if(idCasa == 2){
                CasaHufflepuff[i] = nomePersona;
                for(int k=0; k<capienzaMax; k++){
                    System.out.println(CasaHufflepuff[k]);
                }
            }else if(idCasa == 3){
                CasaRavenclaw[i] = nomePersona;
                for(int k=0; k<capienzaMax; k++){
                    System.out.println(CasaRavenclaw[k]);
                } 
            }
        return 0;
    }

    public static java.util.Random dado = new java.util.Random();





     public static boolean isHouseFull(int pos, String[][] c){
	  int capienza = c[0].length;
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