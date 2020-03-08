public class Circulo extends Figura2D {
	
	private double raio;
	
	@Override
	public double area() {
		return Math.PI * (Math.pow(raio, 2));
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