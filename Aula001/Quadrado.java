
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int lado) {
		super(lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		return super.getBase() * Math.sqrt(2);
	}
	
	
}
