package application;

public class Program {

	public static void main(String[] args) {

		int[] array = { 5, 3, 8, 2, 6 };
		int aux = 0;

		System.out.print("Array desordenado = { ");
		for (int vect : array) {
			System.out.print(vect + ", ");
		}
		System.out.println("}");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				
				}
			}
		}

		System.out.print("Array ordenado = { ");
		for (int vect : array) {
			System.out.print(vect + ", ");
		}
		System.out.println("}");
	}

}
