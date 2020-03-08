public class Trapezio extends Poligono {

	private int bMenor;
	private int lado;
	
	@Override
	public double area() {
		return ((getBase() * bMenor) * getAltura()) / 2;
	}
	
	public Trapezio(int bMaior, int altura, int bMenor, int lado) {
		super(bMaior, altura);
		this.bMenor = bMenor;
		this.lado = lado;
	}

	public int getBMenor() {
		return bMenor;
	}

	public void setBMenor(int bMenor) {
		this.bMenor = bMenor;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
