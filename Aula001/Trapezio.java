
public class Trapezio extends Poligono {

	private int bMenor;
	private int lado;
	
	public Trapezio(int bMenor, int altura, int baseMenor, int lado) {
		super(bMenor, altura);
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
	
	@Override
	public double area() {
		return ((getBase() * bMenor) * getAltura()) / 2;
	}
}
