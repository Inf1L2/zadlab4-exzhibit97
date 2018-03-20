package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {

    public double bok;

    public Kwadrat(double bok) {

        this.bok = bok;

    }

    public void pole() {

        double pole = bok*bok;
        System.out.println("Pole kwadratu wynosi: " + pole);
    }
}
