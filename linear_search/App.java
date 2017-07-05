package linear_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {4, 8, 15, 16, 23, 42};
		int value = 15;
		
		System.out.println(linearSearch(arr, value));
	}
	
	// O(n)
	// look at each element of the array and return its index if it matches value.
	// otherwise, return -1
	public static int linearSearch(int[] arr, int value) {	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
