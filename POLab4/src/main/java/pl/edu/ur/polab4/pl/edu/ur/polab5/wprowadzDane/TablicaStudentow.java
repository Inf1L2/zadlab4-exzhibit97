package pl.edu.ur.polab4.pl.edu.ur.polab5.wprowadzDane;
import java.util.Scanner;


public class TablicaStudentow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] tablicaStudentow = new Student[100];
        int menu = 10, indeks, decyzja, start, stop;
        for (int i = 0; i < tablicaStudentow.length; i++) {
            tablicaStudentow[i] = new Student("","",0);
        }

        while(menu!=0){
            System.out.println("1.Wprowadzenie danych\n 2.Edycja danych\n 3.Resetowanie danych\n 4.Wyswietlenie danych\n 5.Wszystkie obiekty\n 6. Zakres obiektow\n 0.Wyjscie");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    //1.wprowadzanie pod podany indeks
                    System.out.println("Podaj numer indeksu, ktorego dane chcesz wprowadzic:");
                    indeks = input.nextInt();
                    tablicaStudentow[indeks].wprowadzDane();
                    break;
                case 2:
                    //2.edycja pod wybranym indeksem
                    System.out.println("Podaj numer indeksu, ktorego dane chcesz edytowac:");
                    indeks = input.nextInt();
                    if ((tablicaStudentow[indeks].getImie().equals("")) && (tablicaStudentow[indeks].getNazwisko().equals("")) && (tablicaStudentow[indeks].getIndeks() == 0)) {
                        System.out.println("Ten element tablicy jest nieuzupelniony. Uzupelnij dane:");
                        tablicaStudentow[indeks].wprowadzDane();
                    } else {
                        System.out.println("Sa tu juz jakies dane. Czy chcesz je edytować? 1 - tak, inna cyfra - nie");
                        decyzja = input.nextInt();
                        if (decyzja == 1) {
                            tablicaStudentow[indeks].wprowadzDane();
                        } else continue;
                    }
                    break;
                case 3:
                    //3.przywrocenie domyslnych danych
                    System.out.println("Podaj numer indeksu, ktorego dane chcesz zresetowac:");
                    indeks = input.nextInt();
                    tablicaStudentow[indeks].domyslneDane();
                    break;
                case 4:
                    //4.wyswietlenie informacji o obiekcie o danym indeksie
                    System.out.println("Podaj numer indeksu, ktorego dane chcesz wyswietlic:");
                    indeks = input.nextInt();
                    tablicaStudentow[indeks].wyswietlDane();
                    break;
                case 5:
                    for (int i = 0; i < tablicaStudentow.length; i++) {
                        System.out.print(i + ". ");
                        tablicaStudentow[i].wyswietlDane();
                    }
                    break;
                case 6:
                    //5.wyswietlenie danego zakresu obiektow
                    System.out.println("Podaj zakres START i STOP obiektow, ktorych dane chcesz pokazac");
                    System.out.println("Start:");
                    start = input.nextInt();
                    System.out.println("Stop:");
                    stop = input.nextInt();
                    for (int i = start; i <= stop; i++) {
                        System.out.print(i + ". ");
                        tablicaStudentow[i].wyswietlDane();
                    }
                        break;

                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}
