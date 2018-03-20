package pl.edu.ur.polab4.obliczanieFigur;

public class Szescian {

    public double dlugoscKrawedzi;

    public Szescian(double dlugoscKrawedzi) {

        this.dlugoscKrawedzi = dlugoscKrawedzi;

    }

    public void objetosc() {

        double objetosc = dlugoscKrawedzi*dlugoscKrawedzi*dlugoscKrawedzi;
        System.out.println("Objetosc szescianu wynosi: " + objetosc);

    }

}
