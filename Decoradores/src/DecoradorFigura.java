public abstract class DecoradorFigura implements Figura {
   protected Figura figuraDecorada;

   public DecoradorFigura(Figura figuraDecorada){
      this.figuraDecorada = figuraDecorada;
   }

   public void draw(){
      figuraDecorada.draw();
   }	
}