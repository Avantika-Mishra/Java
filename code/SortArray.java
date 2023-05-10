import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, -1, -2, 4, -3};
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order:");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
