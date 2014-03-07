package cb.string;


/*
 * Adapted from http://blogs.ucl.ac.uk/chime/2010/06/28/java-example-code-of-common-similarity-algorithms-used-in-data-mining/
 */
public class HammingDistance implements IStringCompare{
	private String compOne;
	private String compTwo;


	public float compare(String s1, String s2) {
		compOne = s1;
		compTwo = s2;

		if (compOne.length() != compTwo.length()) {
			return  0.0f;
		}

		int counter = 0;

		for (int i = 0; i < compOne.length(); i++) {
			if (compOne.charAt(i) != compTwo.charAt(i))
				counter++;
		}

		return scale(counter,s1.length());
	}

	private float scale(int counter, int length) {
		if(counter==0) return 1.0f;
		return 1.0f -(float)counter/length;
	}

	// /
	// Hamming distance works best with binary comparisons, this function takes
	// a string arrary of binary
	// values and returns the minimum distance value
	// /
	public int minDistance(String[] numbers) {
		int minDistance = Integer.MAX_VALUE;

		if (checkConstraints(numbers)) {
			for (int i = 1; i < numbers.length; i++) {
				int counter = 0;
				for (int j = 1; j <= numbers[i].length(); j++) {
					if (numbers[i - 1].charAt(j - 1) != numbers[i]
							.charAt(j - 1)) {
						counter++;
					}
				}

				if (counter == 0)
					return counter;
				if (counter < minDistance)
					minDistance = counter;
			}
		} else {
			return -1;
		}

		return minDistance;
	}

	private Boolean checkConstraints(String[] numbers) {
		if (numbers.length > 1 && numbers.length <= 50) {
			int prevLength = -1;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i].length() > 0 && numbers[i].length() <= 50) {
					if (prevLength == -1) {
						prevLength = numbers[i].length();
					} else {
						if (prevLength != numbers[i].length()) {
							return false;
						}
					}

					for (int j = 0; j < numbers[i].length(); j++) {
						if (numbers[i].charAt(j) != '0'
								&& numbers[i].charAt(j) != '1') {
							return false;
						}
					}
				} else {
					return false;
				}
			}
		} else {
			return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		HammingDistance distance = new HammingDistance();
		System.out.println(distance.compare("ferosh", "ferosh"));
		}
}