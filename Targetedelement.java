//Accept matrix and return targeted element(border element)   border element larger element
//complexitiy is (n^2)

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Targetedelement
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
			
			tobj.MaxBorder(arr);
			
			//System.out.println("Maximum number form lists are"+ iret);
		
	}
}

class target
{
	public void MaxBorder(int arr[][])
	{
		int iMax=arr[0][0];
		int clength=arr[0].length;
		int rlength=arr.length;
		for(int i=0;i<rlength;i++)
		{ 
			for(int j=0;j<clength;j++)
			{
				if((i==0)||(j==0)||(i==rlength-1)||(j==clength-1))
				{
				if(iMax<arr[i][j])
				{
				iMax=arr[i][j];	
				}
				}
			}
		}
		System.out.println("Maximum border element is"+ iMax);
	
	}
	
}