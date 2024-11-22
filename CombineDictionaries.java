package Java;

import java.util.HashMap;
import java.util.Map;

public class CombineDictionaries {

	public static Map<String, Integer> combineMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

		Map<String, Integer> combinedMap = new HashMap<>(map1);

		for (Map.Entry<String, Integer> entry : map2.entrySet()) {

			String key = entry.getKey();
			int value = entry.getValue();

			combinedMap.put(key, combinedMap.getOrDefault(key, 0) + value);
		}

		return combinedMap;
	}

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 10);
		map1.put("b", 20);
		map1.put("c", 30);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("b", 5);
		map2.put("c", 15);
		map2.put("d", 25);

		Map<String, Integer> result = combineMaps(map1, map2);

		System.out.println("Combined Map: " + result);
	}
}




