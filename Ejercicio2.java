import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		//definimos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double n,x;

		//solicitamos datos
		System.out.println("Ingrese un numero: ");
		n = scanner.nextDouble();
		//creamos un ciclo para saber los valores entre numeros
		for (x = n; x >= 1 ; x-- ) {
			System.out.println(x);
		}
	}
}