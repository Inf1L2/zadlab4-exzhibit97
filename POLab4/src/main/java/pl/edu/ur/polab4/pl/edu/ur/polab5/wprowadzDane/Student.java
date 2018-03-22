package pl.edu.ur.polab4.pl.edu.ur.polab5.wprowadzDane;
import java.util.Scanner;
public class Student {

    private String imie;
    private String nazwisko;
    private int indeks;

    public Student(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;

    }

    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public int getIndeks(){
        return this.indeks;
    }

    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setIndeks(int indeks){
        this.indeks = indeks;
    }


    public void wyswietlDane(){
        System.out.println("Imie:" + getImie() + " Nazwisko:" + getNazwisko() + " Indeks:" + getIndeks());
    }

    public void wprowadzDane(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie:");
        imie = input.nextLine();
        System.out.println("Podaj nazwisko:");
        nazwisko = input.nextLine();
        System.out.println("Podaj numer indeksu");
        indeks = input.nextInt();
    }

    public void domyslneDane(){
        imie = "";
        nazwisko = "";
        indeks = 0;
    }

}
