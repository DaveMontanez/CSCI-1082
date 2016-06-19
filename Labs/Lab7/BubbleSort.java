
public class BubbleSort {

	/**
	 * This method is using bubble sort algorithm to sort
	 * an int array
	 * @param array
	 * @return sorted array
	 */
	public static int[] sortIntArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++){
			for (int j = 0; j < array.length - 1; j++){
				if (array[j] > array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * This method is using bubble sort algorithm to sort
	 * a double array
	 * @param array
	 * @return sorted array
	 */
	public static double[] sortDoubleArray(double[] array) {
		for (int i = 0; i < array.length - 1; i++){
			for (int j = 0; j < array.length - 1; j++){
				if (array[j] > array[j+1]){
					double temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			
			}
		}
		return array;
	}

	/**
	 * This method is using bubble sort algorithm to sort
	 * a string array
	 * @param array
	 * @return sorted array
	 */
	public static String[] sortStringArray(String[] array) {
		for (int i = 0; i < array.length - 1; i++){
			for (int j = 0; j < array.length - 1; j++){
				if (array[j].charAt(0) > array[j+1].charAt(0)){
					String temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// initialize and array of int type
		int[] intArray = { 2, 1, 7, 8, 10 };
		System.out.println("Before sorting intArray");
		// print the unsorted array
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		// invoke sortIntArray method with the unsorted intArray
		// store the returned sorted array in the variable sortedIntArray
		int[] sortedIntArray = sortIntArray(intArray);
		System.out.println("After sorting intArray");
		// print the returned sorted array
		for (int i : sortedIntArray) {
			System.out.print(i + " ");
		}
		System.out.println("\n***************************************\n");

		// initialize and array of double type
		double[] doubleArray = { 9.1, 1.1, 7.3, 1.1, 10.5 };
		System.out.println("Before sorting doubleArray");
		// print the unsorted array
		for (double d : doubleArray) {
			System.out.print(d + " ");
		}
		System.out.println();
		// invoke sortDoubleArray method with the unsorted intArray
		// store the returned sorted array in the variable sortedDoubleArray
		double[] sortedDoubleArray = sortDoubleArray(doubleArray);
		System.out.println("After sorting doubleArray");
		// print the returned sorted array
		for (double d : sortedDoubleArray) {
			System.out.print(d + " ");
		}
		System.out.println("\n***************************************\n");
		
		// initialize and array of string type
		String[] stringArray = { "apple", "orange", "strawberries", "mango", "banana" };
		System.out.println("Before sorting stringArray");
		// print the unsorted array
		for (String s : stringArray) {
			System.out.print(s + " ");
		}
		System.out.println();
		// invoke sortStringArray method with the unsorted stringArray
		// store the returned sorted array in the variable sortedStringArray
		String[] sortedStringArray = sortStringArray(stringArray);
		System.out.println("After sorting stringArray");
		// print the returned sorted array
		for (String s : sortedStringArray) {
			System.out.print(s + " ");
		}
		System.out.println();

	}

}
