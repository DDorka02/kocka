
package feladat;

import java.util.Scanner;

public class Feladat {

    static Scanner sc = new Scanner (System.in);    
    
    public static void main(String[] args) {
        System.out.print("Kérek egy pozitiv számot: ");
        int szam = sc.nextInt();
        while (szam<1){
            System.out.print("Hibás! kérek egy pozitív számot: ");
            szam = sc.nextInt();
        }
        final int MERET = 6;
        int [] tomb = new int [MERET];
        for (int i = 0; i < szam; i++) {
            int h = (int) (Math.random()*6);
        System.out.println(tomb[i] + h +"");
        }
   
        }
}