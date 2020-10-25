package geeksforgeeks;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class GFG {
	
	 
		public static void main (String[] args)
		 {
		 Scanner scan=new Scanner(System.in);
		 int T=scan.nextInt();
		 for(int i=0;i<T;i++)
		 {
		     String str=scan.next();
		     int l=str.length();
		         if(l==10 && (str.charAt(0)=='7'||str.charAt(0)=='8'||str.charAt(0)=='9'))
		         System.out.println("Valid");
		         else if(l==11 && str.charAt(0)=='0'&&(str.charAt(1)=='7'||str.charAt(1)=='8'||str.charAt(1)=='9'))
		         System.out.println("Valid");
		         else if(l==12 && str.charAt(0)=='9' && str.charAt(1)=='1' &&(str.charAt(2)=='7'||str.charAt(2)=='8'||str.charAt(2)=='9'))
		         System.out.println("Valid");
		         else
		         System.out.println("Invalid");
		 }
		 }
	}


