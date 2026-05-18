package twoDimensionalArray;

public class TwoDimensional_Array {

	public static void main(String[] args) {

		// Initialize the 2D array
		int numbers[][] = { { 120, 250, 789, 7 }, { 58, 79, 31, 87 }, { 8, 1, 2, 3 }, { 99, 98, 97, 96 } };

		// 1. Print the array in table form
		System.out.println("Table Form:");
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers[x].length; y++) {
				System.out.print(numbers[x][y] + "\t");
			}
			System.out.println();
		}

		// 2. Find the index of number 1
		// 3. Change value 1 to 50
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers[x].length; y++) {

				if (numbers[x][y] == 1) {

					// Print the index of number 1
					System.out.println("\nNumber 1 is found at indices [" + x + "][" + y + "]");

					// Change value 1 to 50
					numbers[x][y] = 50;
				}
			}
		}

		// Print the array after changing 1 to 50
		System.out.println("\nArray After Changing 1 to 50:");
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers[x].length; y++) {
				System.out.print(numbers[x][y] + "\t");
			}
			System.out.println();
		}

		// 4. Change all values in row index 2 (3rd row) to 0
		for (int y = 0; y < numbers[2].length; y++) {
			numbers[2][y] = 0;
		}

		// 5. Print the updated 2D array
		System.out.println("\nUpdated 2D Array:");
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers[x].length; y++) {
				System.out.print(numbers[x][y] + "\t");
			}
			System.out.println();
		}
	}
}