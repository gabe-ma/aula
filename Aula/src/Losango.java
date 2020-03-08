public class Losango extends Poligono {

	public Losango(int bMaior, int bMenor) {
		super(bMaior, bMenor);
	}
	
	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}
	

}