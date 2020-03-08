
public class Circulo extends Figura {
	
	private double raio;
	
	@Override
	public double area() {
		return 0;
	}
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
