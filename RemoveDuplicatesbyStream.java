package Java;

import java.util.Arrays;

public class RemoveDuplicatesbyStream {

	public static void main(String[] args) {

		int[] array = {1,2,3,1,2,4,5};

		int[] result = Arrays.stream(array).distinct().toArray();

		System.out.println(Arrays.toString(result));
	}

}
