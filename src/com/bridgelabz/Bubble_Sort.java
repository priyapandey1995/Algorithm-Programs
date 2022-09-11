package com.bridgelabz;

import java.util.Scanner;
/**
 * 
 * @author pande
 *
 */

public class Bubble_Sort {
	/**
	 * 
	 * @param args
	 */
	

	public static void main(String[] args) {
		{
			Bubble_Sort bubbleSort = new Bubble_Sort();

			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of Elements: ");
			int n = input.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				System.out.println("Enter the array elements: ");
				arr[i] = input.nextInt();
			}
			input.close();

			bubbleSort.bubbleSort(arr);

			System.out.print("Sorted arrays are: ");
			bubbleSort.printArray(arr);
		}
		}
	/**
	 * 
	 * @param arr
	 * two for loop is performed i.e i and j
	 * secondly,array[0] is compared with array[1],if its greater than it will swap
	 * and again the process continues 
	 */

		void bubbleSort(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n-1; i++)
				for (int j = 0; j < n-i-1; j++)
					if (arr[j] > arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
		}

		/**
		 * 
		 * @param arr
		 * here,we print the sorted array at the end
		 */
		void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}    
	
	
		

	}


