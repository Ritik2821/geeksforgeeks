package geeksforgeeks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class sorting {

	public static void main(String[] args) {
		int arr[]= { 13, 7, 6, 45, 21, 9, 101, 102 }; 
		Arrays.sort(arr,0,5);
		
		System.out.println("Sorted Array :" + Arrays.toString(arr));
//		
//		ArrayList<String>al=new ArrayList<String>();
//		al.add("Geeks For Geeks"); 
//        al.add("Friends"); 
//        al.add("Dear"); 
//        al.add("Is"); 
//        al.add("Superb");
//     
//        Collections.sort(al,Collections.reverseOrder());
//        
//        System.out.println("Sorted array is  -->"  +al );
	}

}
