package ds.array;

public class BinarySearchImpl {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int index= BinarySearchImpl.BinarySearch(arr,6,0,6);
		System.out.println(index);
		
	}
	
	public static int BinarySearch(int[] arr, int num, int start, int end) {
		int mid= start+((end-start)/2); 
		
		if(num==arr[mid]) {
			return mid;
		}
		else if(num<arr[mid]) {
			end= mid-1;
			return BinarySearch(arr, num, start, end);
		}
		else {
			start=mid+1;
			return BinarySearch(arr, num, start, end);
		}
	}
}
