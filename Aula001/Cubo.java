
public class Cubo extends Figura3D {

	private int aresta;
	
	@Override
	public double volume() {
		return Math.pow(getAresta(), 3);
	}
	
	public Cubo(int aresta) {
		this.aresta = aresta;
	}
	
	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}
	
}
