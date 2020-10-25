package geeksforgeeks;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class binarySearch {

	public static void main(String[] args) {
		
//	        int arr[] = { 10,30,11, 22, 35 }; 
//	        Arrays.sort(arr); 
//	  
//	        int key = 30; 
//	        int res = Arrays.binarySearch(arr, key); 
//	        if (res >= 0) 
//	            System.out.println(key + " found at index = " 
//	                                                  + res); 
//	        else
//	            System.out.println(key + " Not found"); 
//	  
//	        key = 40; 
//	        res = Arrays.binarySearch(arr, key); 
//	        if (res >= 0) 
//	            System.out.println(key + " found at index = " 
//	                                                  + res); 
//	        else
//	            System.out.println(key + " Not found");
		
//**************************************************************************************    
			
		List<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(13);
		
		int key=1;
		int res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
		
		 key=2;
		 res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
		
		 key=3;
		 res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
		
		 key=10;
		res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
		
		key=13;
		 res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
		
		 key=90;
		res=Collections.binarySearch(al, key);
		if (res >= 0) 
           System.out.println(key + " found at index = "  + res);
		else
          System.out.println(key + " Not found");
	
		
	} 
}


