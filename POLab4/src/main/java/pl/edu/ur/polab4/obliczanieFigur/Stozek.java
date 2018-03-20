package pl.edu.ur.polab4.obliczanieFigur;

public class Stozek {

    public double promienPodstawy;
    public double wysokosc;
    public double tworzaca;

    public Stozek(double promienPodstawy, double wysokosc, double tworzaca) {

        this.promienPodstawy = promienPodstawy;
        this.wysokosc = wysokosc;
        this.tworzaca = tworzaca;

    }

    public void objetosc() {

        double pi = 3.14;
        double objetosc = ((pi*promienPodstawy*promienPodstawy)*wysokosc)/3;
        System.out.println("Objetosc stozka wynosi: " + objetosc);

    }
}
