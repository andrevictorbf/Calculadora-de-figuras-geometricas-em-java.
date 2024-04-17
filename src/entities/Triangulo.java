package entities;

public class Triangulo {
    // atributos do triangulo:
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double /* double é o tipo de dado que o metodo retorna - formula Herão */ areaTriangulo() {
        double semiPerimetro = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
    }

    public void tipoTriangulo() {
        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("Triangulo tipo escaleno.");
        } else if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("O triangulo é equilatero.");
        } else {
            System.out.println("O triangulo é isósceles.");
        }
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    

}
