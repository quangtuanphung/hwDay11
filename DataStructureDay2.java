import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day11 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 9, 5, 3, 1, 6, 5, 7, 9, 3, 1, 6 };

		System.out.println(findOddTimesAppearNum(arr));
		System.out.println(findSquare(2, 16));
	}

	public static ArrayList<Integer> findSquare(int a, int b) {
		ArrayList<Integer> allSqrtValue = new ArrayList<Integer>();
		double square = 0;
		for (int i = a; i <= b; i++) {
			square = Math.sqrt(i);
			if (square == (int) square) {
				allSqrtValue.add(i);
			}
		}
		return allSqrtValue;

	}

	public static ArrayList<Integer> findOddTimesAppearNum(int[] arr) {
		Map<Integer, Integer> appearances = new HashMap<Integer, Integer>();
		ArrayList<Integer> allOddAppearances = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (appearances.containsKey(arr[i])) {
				appearances.put(arr[i], appearances.get(arr[i]) + 1);

			} else {
				appearances.put(arr[i], 1);
			}
		}
		Set<Integer> keys = appearances.keySet();
		for (Integer key : keys) {
			if (appearances.get(key) % 2 != 0) {
				allOddAppearances.add(key);
			}
		}
		return allOddAppearances;
	}
}

