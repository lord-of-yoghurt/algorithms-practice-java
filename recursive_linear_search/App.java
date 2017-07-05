package recursive_linear_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {4, 8, 15, 16, 23, 42};
		System.out.println(recLinearSearch(arr, 1, 16)); // => 3
		System.out.println(recLinearSearch(arr, 4, 16)); // => -1
	}
	
	// recursive linear search takes an array,
	// an index of the element that starts a subset of that array,
	// and the value we're searching for
	public static int recLinearSearch(int[] arr, int idx, int val) {
		// check if the given idx is past where the value is in the array
		if (idx > arr.length - 1) {
			return -1;
			
		// if we've already found it, save the effort and just return the idx
		// (so, with luck, this algorithm could be O(1) )
		} else if (arr[idx] == val) {
			return idx;
		
		// else, call recLinearSearch recursively until it stumbles upon val,
		// in which case the above "else if" statement will fire
		} else {
			return recLinearSearch(arr, idx + 1, val);
		}
	}

}
