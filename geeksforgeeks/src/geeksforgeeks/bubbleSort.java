package geeksforgeeks;

import java.util.Arrays;

public class bubbleSort {
	void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
//	void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i=0; i<n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
	public static void main(String[] args) {
	 bubbleSort obj=new bubbleSort();
	 int arr[]= {10,12,41,22,89,0};
	 obj.bubbleSort(arr);
	 System.out.println("Sorted array is" + Arrays.toString(arr));
	 }
}
