package geeksforgeeks;

public class QuickSort {
	
	 public static int partition(int []arr,int low,int high) {
		int pivot=arr[low];
		int  start=low;
		int end=high;
		while(start<end){
			while(arr[start]<=pivot) {
			start++;
			}
			while(arr[end]>pivot) {
				end--;
				}
				if(start<end) {
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
				}
		}
		int temp1=arr[low];
		arr[low]=arr[end];
		arr[end]=temp1;
		return end;
	 }
	public static void Sort(int[]arr,int low, int high) {
		 if(low<high) {
			 int pivot=partition( arr,low,high);
			 Sort(arr,low,pivot-1);
			 Sort(arr,pivot+1,high);
		 }
	 }
	 public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  

	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.Sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr);
		

	}
}
