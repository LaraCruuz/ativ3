public class circulo implements forma{

    private double Raio;

    public circulo(){
        this.Raio = 1.0;
    }

    public circulo(double Raio){
        this.Raio = Raio;
    }   

    public void setRaio(double Raio){
        this.Raio = Raio;
    }

    public double getRaio(){
        return Raio;
    }

    public double calcuPerimetro(){
        return Raio*2*Math.PI;
    }

    public double calcuArea(){
        return Math.PI*Math.pow(Raio,2);
    }

}
