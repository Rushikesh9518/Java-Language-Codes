package Java;

import java.util.Arrays;

public class RemoveDuplicatesbyCollection {

	public static void main (String[] args) {

		int[] array = {1,2,3,1,2,4,5};
		Arrays.sort(array);

		int[] temp = new int[array.length];
		int j = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i+1]){
				temp[j++] = array [i];
			}
		}

		temp[j++] = array[array.length - 1];

		int[] result = Arrays.copyOf(temp, j);

		System.out.println(Arrays.toString(result));
	}

}
