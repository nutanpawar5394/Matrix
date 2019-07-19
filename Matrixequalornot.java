//Write a java program which accept two matrices from user and check whether that two matrices are equal or not.

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Matrixequalornot
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		equalornot eobj=new equalornot();
		
		System.out.println("Enter value of a and b");
		
		int	a=sobj.nextInt();
		int	b=sobj.nextInt();
			int arr[][]=new int[a][b];
			int brr[][]=new int[a][b];
			int i=0;
			int j=0;
			
			System.out.println("Enter elements in Martrix1");
			
			for( i=0;i<arr.length;i++)
			{
				for( j=0;j<arr.length;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
			System.out.println("Enter elements in Martrix2");
			
			for( i=0;i<brr.length;i++)
			{
				for( j=0;j<brr.length;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
			
			
			System.out.println("Martrix1 is:");
			
			for( i=0;i<arr.length;i++)
			{
				for( j=0;j<arr.length;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			System.out.println("Martrix2 is:");
			
			for( i=0;i<brr.length;i++)
			{
				for( j=0;j<brr.length;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			
		boolean bret=eobj.equals(arr,brr);
		
		if(bret==true)
		{
			System.out.print("matrix equals");
		}
		else
		{
			System.out.print("matrix  not equals");
		}

	}
}

class equalornot
{
	public boolean equals(int arr[][],int brr[][])
	{
		
		int rlength1=arr.length;
		int rlength2=brr.length;
		int clength1=arr[0].length;
		int clength2=brr[0].length;
		int i=0;
		int j=0;
		for( i=0;(i<rlength1)&&(i<rlength2);i++)
		{
			for( j=0;(j<clength1)&&(j<clength1);j++)
			{
				if(arr[i][j]!=brr[i][j])
				{
					break;
				}
			}
		}
		if((i==rlength1)||(j==clength1))
		{
			System.out.println("equal");
			return true;
		}
		else
		{
			System.out.println("not equal");
			return false;
		}
	}
	
}