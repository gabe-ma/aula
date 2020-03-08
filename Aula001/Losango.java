
public class Losango extends Poligono {

	public Losango(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		return (super.getBase() * super.getAltura()) / 2;
	}
}
