public abstract class Poligono extends Figura2D {

	private int base;
	private int altura;
	
	@Override
	public double area() {
		return getBase() * getAltura();
	}

	public Poligono(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}