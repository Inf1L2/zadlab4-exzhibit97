package pl.edu.ur.polab4.obliczanieFigur;

public class Prostopadloscian {

    private double dlugosc;
    private double szerokosc;
    private double wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {

        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;

    }

    public Prostopadloscian(){}

    public double getDlugosc(){
        return this.dlugosc;
    }

    public double getSzerokosc(){
        return this.szerokosc;
    }

    public double getWyskosc(){
        return this.wysokosc;
    }

    public void setDlugosc(double dlugosc){
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(double szerokosc){
        this.szerokosc = szerokosc;
    }
    public void setWysokosc(double wysokosc){
        this.wysokosc = wysokosc;
    }
    public void objetosc() {
        double objetosc = dlugosc*szerokosc*wysokosc;
        System.out.println("Objetosc prostopadloscianu wynosi: " + objetosc);
    }
}
