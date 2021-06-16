public class principal {
    
    public static void main(String[] args) {
        
        quadrado quadrado = new quadrado(2);
        circulo circulo = new circulo(5);
        retangulo retangulo = new retangulo(12, 10);

        System.out.println("*******Quadrado*******");
        System.out.println(quadrado.getLado());
        System.out.println(quadrado.calcuArea());
        System.out.println(quadrado.calcuPerimetro());
        System.out.println();

        System.out.println("********Circulo*********");
        System.out.println(circulo.getRaio());
        System.out.println(circulo.calcuArea());
        System.out.println(circulo.calcuPerimetro());
        System.out.println();

        System.out.println("********Retangulo*********");
        System.out.println("Altura: " + retangulo.getAltura()+" - Base: "+ retangulo.getBase());
        System.out.println(retangulo.calcuArea());
        System.out.println(retangulo.calcuPerimetro());
    }
}
