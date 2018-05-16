public class Demo {
   public static void main(String[] args) {

      Figura circulo = new Circulo();

      Figura circuloRojo = new DecoradorRojo(new Circulo());

      Figura rectanguloRojo = new DecoradorRojo(new Rectangulo());
      System.out.println("Circulo con borde normal");
      circulo.draw();

      System.out.println("\nCirculo con borde Rojo");
      circuloRojo.draw();

      System.out.println("\nRectangulo de borde Rojo");
      rectanguloRojo.draw();
   }
}