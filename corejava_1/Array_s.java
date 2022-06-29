package corejava_1;
import java.util.Arrays;
import java.util.Scanner;
public class Array_s 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Static array initialization
				//int [] age= {12,5,9,10,4};
			//	int age[]= {12,5,9,10,4};
		    /*
				System.out.println("Accesing of array elements");
				System.out.println("First element :"+age[0]);
			*/
		//Accessing the total array	
			/*	System.out.println("Length "+age.length);
				for(int i=0;i<age.length;i++)
				{
					System.out.println(age[i]);
				}
			*/

		//Dynamic array initialization				
			/*	System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				int num[] =new int[n];
				System.out.println("Enter array elemnts :");
				for(int i=0 ; i<n;i++)
				{
					num[i]=scan.nextInt();
				}
				System.out.println("Array elemets:");
				for(int i=0;i<n;i++)
				{
					System.out.println(num[i]);
				}
			
		//Dynamic String Array
			/*	System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				String name[] =new String[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;++i)
				{
					name[i]=scan.next();
				}
				System.out.println("Array elements:");
				for(int i=0;i<n;++i)
				{
					System.out.println(name[i]);
				}
		    */
		//String Array using "for each"
			/*	System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				String name[] =new String[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;i++)
				{
					name[i]=scan.next();
				}
				System.out.println("Array elements:");
				for(String s:name)
				{
			 
					System.out.println(s);
				}
			*/
		//Sort using Array.sort() - String
		//import java.util.Arrays;
		 /*		System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				String name[] =new String[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;i++)
				{
					name[i]=scan.next();
				}
				Arrays.sort(name);
				System.out.println("Sorted Array");
				for(int i=0;i<n;i++)
				{
					System.out.println(name[i]);
				}
		*/	
		/*		System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				int num[] =new int[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;i++)
				{
					num[i]=scan.nextInt();
				}
				Arrays.sort(num);
				System.out.println("Sorted Array");
				for(int i=0;i<n;i++)
				{
					System.out.println(num[i]);
				}
			*/
			/*	System.out.println("Enter the size of array :");
				int n= scan.nextInt(),temp;
				int num[] =new int[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;i++)
				{
					num[i]=scan.nextInt();
				}
				for(int i=0;i<num.length-1;i++)
				{
					if(num[i]>num[i+1])
					{
						temp=num[i];
						num[i]=num[i+1];
						num[i+1]=temp;
					}
				}
				System.out.println("Sorted Array");
				for(int i=0;i<num.length;i++)
				{
					System.out.println(num[i]);
				}
			*/
		//Matrix
			/*	System.out.println("Enter the row size :");
				int n= scan.nextInt();
				System.out.println("Enter the col size :");
				int m= scan.nextInt();
				int arr[][]=new int[n][m];
				System.out.println("Enter the elements");
				//Entering the row and column
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						arr[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				//Printing of matrix
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			*/
		//Addition matrix
			/*	System.out.println("First matrix :");
				System.out.print("Enter the row size :");
				int n= scan.nextInt();
				System.out.print("Enter the col size :");
				int m= scan.nextInt();
				int arr1[][]=new int[n][m];
				System.out.println("Enter the elements");
				//Entering the row and column
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						arr1[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				System.out.println("Second matrix :");
				int arr2[][]=new int[n][m];
				System.out.println("Enter the elements");
				//Entering the row and column
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						arr2[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				System.out.println("Addition of two matrix");
				int arr[][]=new int[n][m];
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						arr[i][j]=arr1[i][j]+arr2[i][j];
					}
				}
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			*/	
			/*	System.out.println("First matrix :");
				System.out.print("Enter the row size :");
				int n1= scan.nextInt();
				System.out.print("Enter the col size :");
				int m1= scan.nextInt();
				int arr1[][]=new int[n1][m1];
				System.out.println("Enter the elements");
				//Entering the row and column
				for(int i=0;i<n1;i++)
				{
					for(int j=0;j<m1;j++)
					{
						arr1[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				System.out.println("Second matrix :");
				System.out.print("Enter the row size :");
				int n2= scan.nextInt();
				System.out.print("Enter the col size :");
				int m2= scan.nextInt();
				int arr2[][]=new int[n2][m2];
				System.out.println("Enter the elements");
				//Entering the row and column
				for(int i=0;i<n2;i++)
				{
					for(int j=0;j<m2;j++)
					{
						arr2[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				//Multiplication matrix
				int mul[][]=new int[n1][m1];
				System.out.println("Multiplication Matirx");
				for(int i=0;i<n2;i++)
				{
					for(int j=0;j<m2;j++)
					{
						mul[i][j]=0;
						for(int k=0;k<m2;k++)
						{
							mul[i][j]=arr1[i][k]*arr2[k][j];
						}
						
					}
				}
				for(int i=0;i<n2;i++)
				{
					for(int j=0;j<m2;j++)
					{
						 System.out.print(mul[i][j]+" ");
					}
					System.out.println();
				}
				
		*/		
		//Array Cloning
		/*     	System.out.println("Enter the size of array :");
				int n= scan.nextInt();
				int num[] =new int[n];
				System.out.println("Enter array elements :");
				for(int i=0;i<n;i++)
				{
					num[i]=scan.nextInt();
				}
				int copy[]=new int[n];
				copy = num;
				copy[0]++;
				System.out.println("Original Array");
				for(int i=0;i<n;i++)
				{
					System.out.println(num[i]);
				}
				System.out.println("Cloning Array");
				for(int i=0;i<n;i++)
				{
					
					System.out.println(copy[i]);
				}
	     */
	}

}
