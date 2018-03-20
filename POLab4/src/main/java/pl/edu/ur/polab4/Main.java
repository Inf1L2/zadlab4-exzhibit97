package pl.edu.ur.polab4;

import pl.edu.ur.polab4.obliczanieFigur.*;

import java.io.Console;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double skaner;
        Szescian szescian1 = new Szescian(5);
        szescian1.objetosc();

        Kolo kolo1 = new Kolo();
        kolo1.setPromien(Double.parseDouble(scanner.nextLine()));
        double promien = kolo1.getPromien();
        System.out.println("Promien: " + promien);
        kolo1.obwod();
        kolo1.pole();



    }
    
}
