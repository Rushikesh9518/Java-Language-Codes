package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PairWithSum {

	public static List<int[]> findPairs(int[] array,int target) {

		List<int[]> result = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();

		for (int num : array) {

			int complement = target - num;

			if(map.containsKey(complement)) {

				result.add(new int[] {complement,num});

			}

			map.put(num,map.getOrDefault(num,0) + 1);

		}
		return result;
	}

	public static void main(String[] args) {

		int[] array = {2,4,3,7,5,1,9};
		int target = 10;

		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Target Sum: " + target);

		List<int[]> pairs = findPairs(array,target);

		if (!pairs.isEmpty()) {

			System.out.println("Pairs with Sum " + target + ":");

			for(int[] pair : pairs) {

				System.out.println(Arrays.toString(pair));
			}
		}else {

			System.out.println("No pairs found with sum " + target + ".");

		}

	}
}