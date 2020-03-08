public class Cilindro extends Figura3D {

	private int raio;
	private int altura;
	
	@Override
	public double volume() {
		return Math.PI * Math.pow(raio, 2) * altura;
	}
	
	public Cilindro(int raio, int altura) {
		this.raio = raio;
		this.altura = altura;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}