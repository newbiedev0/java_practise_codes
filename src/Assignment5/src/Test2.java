package Assignment5.src;
import java.util.Arrays;


//this cooked up trash is not that beautiful code from fantasy.
//This is simply for manipulating the array index and the elements within index
//the two different arrays but manipulated as same using looping concepts

public class Test2 {
	public static void main(String[] args) {

		int[] arr1 = new int[5];

		arr1[2] = 10;
		arr1[4] = 20;

		int[] arr2 = new int[5];

		arr2[0] = 5;
		arr2[2] = 15;
		arr2[3] = 25;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				int vacantIndex = 0;
				for (int j = 0; j < arr2.length; j++) {
					if (arr2[j] == 0) {
						vacantIndex = j;
						break;
					}
				}
				arr2[vacantIndex] = arr1[i];
			}
		}

		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
	}
}
