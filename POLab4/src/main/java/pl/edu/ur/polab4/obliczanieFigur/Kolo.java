package pl.edu.ur.polab4.obliczanieFigur;

public class Kolo {

    private double promien;

    public Kolo(double promien){

        this.promien = promien;
    }

    public Kolo() {}

    public double getPromien(){
        return this.promien;
    }

    public void setPromien(double promien){
        this.promien = promien;
    }



    public void obwod(){
        double pi = 3.14;
        double obwod = 2*pi*promien;
        System.out.println("Obwod kola wynosi: " + obwod);
    }

    public void pole(){
        double pi = 3.14;
        double pole = 2*pi*(promien*promien);
        System.out.println("Pole okregu wynosi: " + pole);
    }

}
