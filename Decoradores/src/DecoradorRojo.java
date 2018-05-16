public class DecoradorRojo extends DecoradorFigura {

   public DecoradorRojo(Figura figuraDecorada) {
      super(figuraDecorada);		
   }

   @Override
   public void draw() {
      figuraDecorada.draw();	       
      setBordeRojo(figuraDecorada);
   }

   private void setBordeRojo(Figura figuraDecorada){
      System.out.println("Color del borde: Rojo");
   }
}