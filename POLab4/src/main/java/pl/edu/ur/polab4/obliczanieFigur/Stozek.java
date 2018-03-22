package pl.edu.ur.polab4.obliczanieFigur;

public class Stozek {

    private double promienPodstawy;
    private double wysokosc;
    private double tworzaca;

    public Stozek(double promienPodstawy, double wysokosc, double tworzaca) {

        this.promienPodstawy = promienPodstawy;
        this.wysokosc = wysokosc;
        this.tworzaca = tworzaca;

    }

    public Stozek(){}

    public double getPromienPodstawy(){
        return this.promienPodstawy;
    }

    public double getWysokosc(){
        return this.wysokosc;
    }

    public double getTworzaca(){
        return this.tworzaca;
    }

    public void setPromienPodstawy(double promienPodstawy){
        this.promienPodstawy = promienPodstawy;
    }

    public void setWysokosc(double wysokosc){
        this.wysokosc = wysokosc;
    }

    public void setTworzaca(double tworzaca){
        this.tworzaca = tworzaca;
    }

    public void objetosc() {

        double pi = 3.14;
        double objetosc = ((pi*promienPodstawy*promienPodstawy)*wysokosc)/3;
        System.out.println("Objetosc stozka wynosi: " + objetosc);

    }
}
