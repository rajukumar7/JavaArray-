import java.util.*;
public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		//reading the array elements
		for(int i=0; i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		//printing the array elements
		System.out.println("Array elements are :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		// find maximum element from array
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		System.out.println("\nMax element = "+max);
		//find minimum element from array
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min= arr[i];
			}
		}
		System.out.println("Min element = "+min);
	}
}
