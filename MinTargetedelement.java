//Accept matrix and return targeted element(border element)   with minimum time complexity


import java.lang.*;
import java.io.*;
import java.util.Scanner;

class MinTargetedelement
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		target tobj=new target();
		
			int arr[][]=new int[4][4];
		
			
			System.out.println("Enter elements in Martrix");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
		System.out.println("Martrix is:");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			
			tobj.MinBorder(arr);
			
			//System.out.println("Maximum number form lists are"+ iret);
		
	}
}

class target
{
	public void MinBorder(int arr[][])
	{
		int iMin=arr[0][0];
		int clength=arr[0].length;
		int rlength=arr.length;
		for(int i=0;i<rlength;i++)
		{ 
			if(iMin>arr[0][i])
			{
				iMin=arr[0][i];
			}
			if(iMin>arr[3][i])
			{
				iMin=arr[3][i];
			}
			if(iMin>arr[i][0])
			{
				iMin=arr[i][0];
			}
			if(iMin>arr[i][3])
			{
				iMin=arr[i][3];
			}
			
		}
		System.out.println("Maximum border element is"+ iMin);
	
	}
	
}