package algorithmsImp;

public class BinarySearchAlgorithm {

	public static int findNum(int[] arr, int number) {
		int low = 0;	
		int high = arr.length - 1;
		while (low <= high) {
			int mid = Math.round((low + high) / 2);
			int guss = arr[mid];
			if (guss == number)
				return mid;
			else if (guss > number)
				high = mid - 1;
			else if (guss < number)
				low = mid + 1;
		}		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {40,45,60,322,336,789,1235,2354,4651,78984 };
		System.out.println(findNum(arr,789));

	}

}
