package application;

public class Program {

	public static void main(String[] args) {

		int[] array = { 9, 5, 1, 3, 4, 7, 2 };
		int aux = 0;
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cont += j;

				}
			}
		}

		for (int vect : array) {
			System.out.print(vect + ", ");
		}
		System.out.println(cont);
	}

}
