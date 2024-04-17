package entities;

public class Retangulo {

    private double largura;
    private double altura;

    public double areaRet() {
        return largura * altura;
    }

    public double perimeterRet() {
        return 2 * (largura + altura);
    }

    public double diagonalRet() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
