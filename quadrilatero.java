public abstract class quadrilatero implements forma {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    
    public quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public double calcuPerimetro(){
        return ladoA+ladoB+ladoC+ladoD;
    }

    public double[] getLados(){
        double [] lados = new double[4];
        lados[0] = ladoA;
        lados[1] =ladoB;
        lados[2] = ladoC;
        lados[3] = ladoD;
        return lados;
    }

}
