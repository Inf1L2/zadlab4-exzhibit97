package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {

    private double bok;

    public Kwadrat(double bok) {

        this.bok = bok;

    }

    public Kwadrat(){}

    public double getBok(){
        return this.bok;
    }

    public void setBok(double bok){
        this.bok = bok;
    }

    public void pole() {

        double pole = bok*bok;
        System.out.println("Pole kwadratu wynosi: " + pole);
    }
}
