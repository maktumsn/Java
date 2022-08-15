package patterns;

import java.util.Iterator;

public class Patterns {
  public static void main(String[] args) {
	pattern9(5);
}
  static void pattern9(int n)
  {
	  for(int i=0;i<n;i++)
	  {   char val=(char)(i+65);
		  for (int j=0;j<=i;j++)
		  {   if((i+j)%2!=0)
			     System.out.print(val+" ");
		     else
		    	 System.out.print(Character.toLowerCase(val)+" ");
			  ++val;
			  
		  }
		
		  System.out.println();
	  }
	  
  }
  static void pattern8(int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  for (int j=0;j<=i;j++)
		  {
			  int k=j+n-i-1+65;
			  char val=(char)(k);
			 
			  System.out.print(val+" ");
			  
		  }
		  System.out.println();
	  }
	  
  }
  
  static void pattern7(int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  for (int j=0;j<=i;j++)
		  {
			  char val=(char)(j+65);
			  System.out.print(val+" ");
			  
		  }
		  System.out.println();
	  }
	  
  }
  static void pattern6(int n)
  {
	  for(int i=0;i<2*n-1;i++)
	  {
		  for (int j=0;j<2*n-1;j++)
		  {
			  int val=n-(Math.min(Math.min(i,(2*n-2-i)),Math.min(j,(2*n-2-j))));	
			  System.out.print(val+" ");
			  
		  }
		  System.out.println();
	  }
	  
  }
  static void pattern5(int n)
  {
	  for(int i=0;i<2*n-1;i++)
	  {
		  int NumberOfStars=i>(n-1)?(2*n-i-2):i;
		  for (int j=0;j<=NumberOfStars;j++)
			  System.out.print("*");
		  System.out.println();
	  }
	  
  }
  static void pattern4(int n)
  {
	  for(int i=1;i<=n;i++)
	  {
		  for (int j=1;j<=i;j++)
			  System.out.print(j+" ");
		  System.out.println();
	  }
	  
  }
  static void pattern3(int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  for (int j=n;j>i;j--)
			  System.out.print("*");
		  System.out.println();
	  }
	  
  }
  static void pattern1(int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  for (int j=0;j<n;j++)
			  System.out.print("*");
		  System.out.println();
	  }
	  
  }
  static void pattern2(int n)
  {
	  for(int i=0;i<=n;i++)
	  {
		  for (int j=0;j<i;j++)
			  System.out.print("*");
		  System.out.println();
	  }
	  
  }
  
}
