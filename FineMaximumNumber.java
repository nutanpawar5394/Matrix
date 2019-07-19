//accept multidimentional array and find maximum from each row

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class FineMaximumNumber
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		Maximum mobj=new Maximum();
		
			int arr[][]=new int[4][4];
		
			
			System.out.println("Enter elements in Martrix");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
			
			mobj.MaximumNumber(arr);
			System.out.println("Martrix is:");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
	}
}

class Maximum
{
	public void MaximumNumber(int arr[][])
	{
		int iMax=0;
		int clength=arr[0].length;
		for(int i=0;i<arr.length;i++)
		{iMax=0;
			for(int j=0;j<clength;j++)
			{
				if(iMax<arr[i][j])
				{
				iMax=arr[i][j];	
				}
			}System.out.println("Maximum number form lists are"+ iMax);
		}
	}
	
}