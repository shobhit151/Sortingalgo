package sortingalgo;

import java.util.Arrays;

public class Bubblesort {

	
		static void BubbleSort (int arr[]) {
			int temp = 0;
			int n = arr.length;
			for(int i=0;i<n;i++) {
				for(int j = 1;j<n;j++) {
					if(arr[j-1] > arr[j]) {
						temp = arr[j-1];
						
						arr[j-1] = arr[j];
						arr[j]=temp;
						
					}
				}
			}
		}
		public static void main(String[]args) {
			int arr[] = {3,60,35,2,45,320,5};
			System.out.println("Array before bubble sort ");
			
				System.out.println(Arrays.toString(arr));
			
			System.out.println();
			
			
			BubbleSort(arr);
			
			System.out.println("Array after bubble sort " );
			
				System.out.println(Arrays.toString(arr) );
		

			
		}
		
		

	}


