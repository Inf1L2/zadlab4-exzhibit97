package pl.edu.ur.polab4.obliczanieFigur;

public class Prostokat {

    public double bokA;
    public double bokB;

    public Prostokat(double bokA, double bokB) {

        this.bokA = bokA;
        this.bokB = bokB;

    }

    public void pole() {

        double pole = bokA*bokB;
        System.out.println("Pole prostokata wynosi: " + pole);
    }

}
