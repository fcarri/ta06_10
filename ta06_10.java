package project6;

import java.util.Random;
import java.util.Scanner;

public class ta06_10 {
	public static void main(String args[]){	
		
		int nombre1, nombre2, t = 0;
		
		Scanner sc = new Scanner(System.in);				
		
		System.out.println("Tamany array: ");
		int tamany = sc.nextInt();	
		
		System.out.print("nombre1: ");
		nombre1 = sc.nextInt();
		
		System.out.print("nombre2: ");
		nombre2 = sc.nextInt();
		
		int num[] = new int[tamany];
		
		System.out.println("nombres prims aleatoris: ");
		for(int n = 1; n <= tamany; n++) {
									
			num[t] = nAleatori(nombre1,nombre2);
			System.out.print(" "+num[t]);
			t++;								
		}							
		
		int numMG = num[0];
     
        for (t = 1; t < num.length; t++) {
            if (num[t] > numMG) numMG = num[t];
        }
        
        System.out.println();
        System.out.println("Nombre més gran: "+numMG);
		
        sc.close();
		
	}
	
	public static int nAleatori(int nombre1, int nombre2) {				
		 
        boolean prim = false;
        int nombreAleatori = 0;
		
		Random rand = new Random();
        
        if (nombre1 > nombre2) {
        	
        	int n1 = nombre1;
        	nombre1 = nombre2;
        	nombre2 = n1;        	
        }
          
        while (prim == false) {
        	//nombre aleatori entre 0 i nombre2. Després se li suma nombre1
        	nombreAleatori = rand.nextInt(nombre2 - nombre1) + nombre1;
        	prim = esPrim(nombreAleatori);        	
        }
             		
        return nombreAleatori;
	}
	
	public static boolean esPrim(int no) {
		
		boolean prim = true;
		
		if (no<=1) {
			prim = true;
		}
		
		for (int n=2;n<=no - 1;n++) {
			int r = no % n;
			if (r == 0) {
				prim = false;
			}
			
		}
		
		return prim;
	}

}
