package pl.edu.ur.polab4.obliczanieFigur;

public class Kula {

    private double promien;

    public Kula(double promien) {

        this.promien = promien;

    }

    public Kula(){}

    public double getPromien(){
        return this.promien;
    }

    public void setPromien(double promien){
        this.promien = promien;
    }

    public void objetosc() {

        double pi = 3.14;
        double objetosc = 4/3*pi*(promien*promien*promien);
        System.out.println("Objetosc kuli wynosi: " + objetosc);

    }


}
