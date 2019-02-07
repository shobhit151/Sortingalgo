package sortingalgo;

import java.util.Arrays;

public class newsortalgo {

	public static void selectionsort(int[]arr) {
		 for(int i =0;i<arr.length;i++) {
			 for(int j = i + 1;j<arr.length;j++) {
				 if(arr[j]<arr[i]) {
					 int x = arr[j];
					 arr[j]=arr[i];
					 arr[i] = x;
					 
				 }
				 
			 }
		 }
		 
	 }
	 public static void main(String[]args) {
		 int arr[] = {5,1,3,9,2,7};
		 selectionsort(arr);
		 System.out.println(Arrays.toString(arr));
	 }
}