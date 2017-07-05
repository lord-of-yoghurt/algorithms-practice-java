package recursive_binary_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		System.out.println(recBinarySearch(arr, 2, 7, 5)); // => 5
		System.out.println(recBinarySearch(arr, 0, 7, 21)); // => -1
		System.out.println(recBinarySearch(arr, 1, 8, 13)); // => 7
	}

	// for recursive binary search, we need to know where our subset starts
	// and ends (first and last are indices) because we can't be assigning 
	// those values inside the method body - they'll get overwritten every time. 
	public static int recBinarySearch(int[] arr, int first, int last, int val) {
		// initialize middle of array reference
		int mid = 0;
		
		// sanity check AND check if val isn't found and the subset shrunk to
		// one element, in which case first will be 0 and last will be -1
		if (first > last) {
			return -1;
		} else {
			
			// set the midpoint
			mid = (first + last) / 2;
			
			// return the midpoint if the value is at the index
			if (arr[mid] == val) {
				return mid;
				
			// if the value at midpoint is more than val, then val is in the left half.
			// call recBinarySearch recursively using first and mid - 1 as last
			} else if (arr[mid] > val) {
				return recBinarySearch(arr, first, mid - 1, val);
				
			// else, call recBinarySearch using mid + 1 as first and original last
			} else {
				return recBinarySearch(arr, mid + 1, last, val);
			}
		}
	}
}
