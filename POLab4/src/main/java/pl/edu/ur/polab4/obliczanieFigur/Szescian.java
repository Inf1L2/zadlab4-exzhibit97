package pl.edu.ur.polab4.obliczanieFigur;

public class Szescian {

    private double krawedz;

    public Szescian(double krawedz) {
        this.krawedz = krawedz;
    }

    public Szescian(){}

    public double getKrawedz() {
        return this.krawedz;
    }

    public void setKrawedz(double krawedz) {
        this.krawedz = krawedz;
    }

    public void objetosc() {
        double objetosc = krawedz * krawedz * krawedz;
        System.out.println("Objetosc szescianu wynosi: " + objetosc);
    }
}
