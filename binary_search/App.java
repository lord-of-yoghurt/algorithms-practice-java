package binary_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {4, 8, 15, 16, 23, 42};
		int val = 15; 
		System.out.println(binarySearch(arr, val)); // => 2
	}
	
	// binary search is O(log n) on average - nice and fast. 
	public static int binarySearch(int[] arr, int val) {
		int first = 0; // ref to first element of arr
		int last = arr.length - 1; // ref to last element of arr
		int mid = 0; // middle of arr
		
		// continue while arr is more than 1 element long
		while (first <= last) {
			// will floor because we're using ints
			mid = (first + last) / 2; 
			
			// return index if we've found the value
			if (arr[mid] == val) {
				return mid;
				
			// if the value in the middle is more than our value,
			// discard mid and the left half of arr
			} else if (arr[mid] > val) {
				last = mid - 1;
				
			// else, discard mid and the right half of arr
			} else {
				first = mid + 1;
			}
		}
		// -1 is returned if nothing is found
		return -1;
	}
}
