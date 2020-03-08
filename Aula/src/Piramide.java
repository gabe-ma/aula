public class Piramide extends Figura3D {

	private int lado;
	private int altura;
	
	@Override
	public double volume() {
		return 1/3 * Math.pow(lado, 2) * altura;
	} 


	public Piramide(int lado, int altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}