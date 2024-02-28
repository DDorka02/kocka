
package feladat;

import java.util.Scanner;

public class Feladat {

    static Scanner sc = new Scanner (System.in);    
    
    public static void main(String[] args) {
        System.out.print("Kérek egy pozitiv számot: ");
        int dobasokszama = sc.nextInt();
        while (dobasokszama<1){
            System.out.print("Hibás! kérek egy pozitív számot: ");
            dobasokszama = sc.nextInt();
        }
        final int OLDALOKSZAMA = 6;
        int [] tomb = new int [OLDALOKSZAMA+1];
        for (int i = 0; i < dobasokszama; i++) {
            int h = (int) (Math.random()*6+1);
            h++;
        }
        
        for (int j=0;j<tomb.length ;j++){
        
        }
        
        
   
        }
}