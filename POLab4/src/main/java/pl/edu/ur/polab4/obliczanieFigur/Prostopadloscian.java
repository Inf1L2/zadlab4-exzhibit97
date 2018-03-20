package pl.edu.ur.polab4.obliczanieFigur;

public class Prostopadloscian {

    public double dlugosc;
    public double szerokosc;
    public double wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {

        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;

    }

    public void objetosc() {

        double objetosc = dlugosc*szerokosc*wysokosc;
        System.out.println("Objetosc prostopadloscianu wynosi: " + objetosc);

    }
}
