/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni3;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class Cviceni3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Var
        int cisloVstup = 0;
        int cyklus = 0;
        int min, max = 0;
        int soucet = 0;
        double prumer = 0;
        //Code
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte číslo");
        cisloVstup = vstup.nextInt();
        min = max = cisloVstup;
        soucet = cisloVstup;
        while (cisloVstup != 0) {
            //nejmensi
            if (cisloVstup < min) {
                min = cisloVstup;
            }
            //nejvetsi cislo
            if (cisloVstup > max) {
                max = cisloVstup;
            }

            //  pro prumer
            cyklus = cyklus + 1;
            soucet = soucet + cisloVstup;
            //dalsi cislo
            System.out.println("Zadejte číslo");
            cisloVstup = vstup.nextInt();

        }
        //chyceni chyby pri jednom clenu  napr. vstup 1;0
        if(cyklus > 2){
        prumer = soucet / cyklus;
         }
        else{
        prumer =  soucet /2;  
        }
        
        System.out.println("Minimum je " + min);
        System.out.println("Maximum je " + max);
        System.out.println("Průměr je " + prumer);
    }
}


