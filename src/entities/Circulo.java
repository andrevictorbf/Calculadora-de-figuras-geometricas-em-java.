package entities;

//classe circulo
public class Circulo {
    private double raioCirculo;

    // parametros comprimento e area do circulo
    public double areaCirculo() {
        return Math.PI * Math.pow(raioCirculo, 2);
    }

    public double comprimentoCirculo() {

        return 2 * Math.PI * raioCirculo;
    }

    public double getRaioCirculo() {
        return raioCirculo;
    }

    public void setRaioCirculo(double raioCirculo) {
        this.raioCirculo = raioCirculo;
    }

}
