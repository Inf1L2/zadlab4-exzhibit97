package pl.edu.ur.polab4.obliczanieFigur;

public class Prostokat {

    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {

        this.bokA = bokA;
        this.bokB = bokB;

    }

    public Prostokat(){}

    public double getBokA(){
        return bokA;
    }

    public double getBokB(){
        return bokB;
    }

    public void setBokA(double bokA){
        this.bokA = bokA;
    }

    public void setBokB(double bokB){
        this.bokB = bokB;
    }

    public void pole() {
        double pole = bokA*bokB;
        System.out.println("Pole prostokata wynosi: " + pole);
    }
}
