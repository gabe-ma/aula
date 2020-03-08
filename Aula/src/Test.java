import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList <Figura2D> figura = new ArrayList<>();
		figura.add(new Quadrado(32));
		figura.add(new Triangulo(9, 8));
		figura.add(new Losango(6, 12));
		figura.add(new Retangulo(8, 3));
		figura.add(new Circulo(18));
		figura.add(new Trapezio(10, 4, 5, 4));
		
		System.out.println("Figuras 2D");
		for (Figura2D fig:figura) {
			System.out.println("A área da figura é: "  + fig.area() + "cm²");
			
			if (fig instanceof Diagonal) {
				System.out.println("E sua diagonal é: " + ((Diagonal)fig).diagonal());
				System.out.println("-------------------");
			} else {
				System.out.println("-------------------");
			}
		}
		
		System.out.println(" ");
		
		ArrayList <Figura3D> figura3 = new ArrayList<>();
		figura3.add(new Cilindro(12, 15));
		figura3.add(new Cubo(10));
		figura3.add(new Esfera(8));
//		figura3.add(new Piramide(5, 20)); única que não entendi
		
		System.out.println("Figuras 3D");
		System.out.println(" ");
		for (Figura3D fig:figura3) {
			System.out.println("O volume da figura é: "  + fig.volume() + "cm³");
			System.out.println("-------------------");
		}
		
	}
}