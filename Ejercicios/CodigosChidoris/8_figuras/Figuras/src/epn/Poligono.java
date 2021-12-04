package epn;

public abstract class Poligono {
	
		private int numLados;

		
		public Poligono(int numLados) {
			
		this.numLados = numLados;
		
		}
	    
		public abstract double GetArea();
		

}
