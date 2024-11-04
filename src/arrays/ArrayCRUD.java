package arrays;

import static utils.InputUtils.*;

public class ArrayCRUD {
	public static void main(String args[]) {
		int size = readInt("Enter array size:");
		int[] arr = new int[size];

		ArrayCRUD obj = new ArrayCRUD();
		obj.getArrayInput(arr, size);

		obj.printArray(arr);

//		obj.insertAtBeginning(arr, 777);
//		obj.printArray(arr);
//
//		obj.insertAtPosition(arr, 2, 888);
//		obj.printArray(arr);
//
//		obj.insertAtEnd(arr, 999);
//		obj.printArray(arr);

//		obj.deleteAtBeginning(arr);
//		obj.printArray(arr);
//
//		obj.deleteAtEnd(arr);
//		obj.printArray(arr);
//
//		obj.deleteAtPosition(arr, 5);
//		obj.printArray(arr);
		
		obj.deleteElement(arr, 49);
		obj.printArray(arr);
	}

	/* Taking array input from user */
	public void getArrayInput(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			array[i] = readInt("");
		}
	}

	/* Print array method */
	public void printArray(int[] array) {
		for (int singleElement : array) {
			System.out.print(singleElement + " ");
		}
		System.out.print("\n");
	}

	/* Insert element at the end of the array */
	public void insertAtEnd(int[] array, int value) {
		try {
			int lastIndex = array.length - 1;
			array[lastIndex] = value;
		} catch (Exception e) {
			System.out.println("There is error in insertAtEnd method");
			System.out.println(e);
		}
	}

	/* Insert element at the beginning of an array */
	public void insertAtBeginning(int[] array, int value) {
		try {
			for (int i = (array.length - 1); i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = value;
		} catch (Exception e) {
			System.out.println("There is an error in insertAtBeginning method");
			System.out.println(e);
		}
	}

	/* Insert element at a given position in an array */
	public void insertAtPosition(int array[], int position, int value) {
		try {
			if (position >= array.length || position < 0) {
				System.out.println("Position " + position + " is not valid");
				return;
			}
			for (int i = (array.length - 1); i > position; i--) {
				array[i] = array[i - 1];
			}
			array[position] = value;
		} catch (Exception e) {
			System.out.println("There is an error in insertAtPosition method");
			System.out.print(e);
		}
	}

	/* Deleting the element from the beginning of an array */
	public void deleteAtBeginning(int[] array) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[length - 1] = 0;
	}

	/* Deleting the element from the end of an array */
	public void deleteAtEnd(int[] array) {
		int length = array.length;
		array[length - 1] = 0;
	}

	/* Deleting the element at given position in an array */
	public void deleteAtPosition(int[] array, int position) {
		int length = array.length;
		try {
			if (position < 0 || position >= length) {
				System.out.println("Position is not valid. Cannot delete element");
				return;
			}
			for (int i = position; i < length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[length - 1] = 0;
		} catch (Exception e) {
			System.out.println("There is an error in deleteAtPosition method");
			System.out.println(e);
		}
	}

	/* Deleting the given element from array */
	public void deleteElement(int[] array, int value) {
		int length = array.length;
		int i = 0;
		for (; i < length; i++) {
			if (array[i] == value) {
				break;
			}
		}
		if (i == length) {
			System.out.println("Cannot delete since element is not found!");
			return;
		}
		for (int j = i; j < length - 1; j++) {
			array[j] = array[j + 1];
		}
		array[length - 1] = 0;
	}
}
