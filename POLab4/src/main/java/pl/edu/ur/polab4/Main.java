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
        int menu = 10;
        System.out.println("1.Zadanie 3");
        System.out.println("2.Kalkulator: Kolo");
        System.out.println("3.Kalkulator: Kula");
        System.out.println("4.Kalkulator: Kwadrat");
        System.out.println("5.Kalkulator: Prostokat");
        System.out.println("6.Kalkulator: Prostopadloscian");
        System.out.println("7.Kalkulator: Stozek");
        System.out.println("8.Kalkulator: Szescian");

        while(menu!=0) {
            menu = scanner.nextInt();
            switch(menu) {

                case 1:

                    System.out.println("Koło: ");
                    Kolo kolo = new Kolo(10);
                    kolo.obwod();
                    kolo.pole();

                    System.out.println("Kula: ");
                    Kula kula = new Kula(10);
                    kula.objetosc();

                    System.out.println("Kwadrat: ");
                    Kwadrat kwadrat = new Kwadrat(10);
                    kwadrat.pole();

                    System.out.println("Prostokat: ");
                    Prostokat prostokat = new Prostokat(10, 20);
                    prostokat.pole();

                    System.out.println("Prostopadloscian: ");
                    Prostopadloscian prostopadloscian = new Prostopadloscian(10, 20, 30);
                    prostopadloscian.objetosc();

                    System.out.println("Stozek: ");
                    Stozek stozek = new Stozek(10, 10, 5);
                    stozek.objetosc();

                    System.out.println("Szescian: ");
                    Szescian szescian = new Szescian(10);
                    szescian.objetosc();


                    break;

                case 2:
                    Kolo kolo1 = new Kolo();
                    System.out.println("Kalkulator: Kolo");
                    System.out.println("Podaj wartosc promienia: ");
                    kolo1.setPromien(scanner.nextDouble());
                    kolo1.pole();
                    kolo1.obwod();
                    break;

                case 3:
                    Kula kula1 = new Kula();
                    System.out.println("Kalkulator: Kula");
                    System.out.println("Podaj wartosc promienia: ");
                    kula1.setPromien(scanner.nextDouble());
                    kula1.objetosc();
                    break;

                case 4:
                    Kwadrat kwadrat1 = new Kwadrat();
                    System.out.println("Kalkulator: Kwadrat");
                    System.out.println("Podaj dlugosc boku: ");
                    kwadrat1.setBok(scanner.nextDouble());
                    kwadrat1.pole();
                    break;

                case 5:
                    Prostokat prostokat1 = new Prostokat();
                    System.out.println("Kalkulator: Prostokat");
                    System.out.println("Podaj dlugosc 1 boku: ");
                    prostokat1.setBokA(scanner.nextDouble());
                    System.out.println("Podaj dlugosc 1 boku: ");
                    prostokat1.setBokB(scanner.nextDouble());
                    break;

                case 6:
                    Prostopadloscian prostopadloscian1 = new Prostopadloscian();
                    System.out.println("Kalkulator: Prostopadloscian");
                    System.out.println("Podaj dlugosc: ");
                    prostopadloscian1.setDlugosc(scanner.nextDouble());
                    System.out.println("Podaj szerokosc: ");
                    prostopadloscian1.setSzerokosc(scanner.nextDouble());
                    System.out.println("Podaj wysokosc: ");
                    prostopadloscian1.setWysokosc(scanner.nextDouble());
                    break;

                case 7:
                    Stozek stozek1 = new Stozek();
                    System.out.println("Kalkulator: Stozek");
                    System.out.println("Podaj promien: ");
                    stozek1.setPromienPodstawy(scanner.nextDouble());
                    System.out.println("Podaj wysokosc: ");
                    stozek1.setWysokosc(scanner.nextDouble());
                    System.out.println("Podaj tworzaca: ");
                    stozek1.setTworzaca(scanner.nextDouble());
                    break;

                case 8:
                    Szescian szescian1 = new Szescian();
                    System.out.println("Kalkulator: Szescian");
                    System.out.println("Podaj dlugosc krawedzi: ");
                    szescian1.setKrawedz(scanner.nextDouble());
                    szescian1.objetosc();
                    break;

                case 9:

                    break;
                default:
                    System.out.println("Niepoprawny wybor");
                    break;
            }
        }
    }
}
