//accpct matrix from user and swap the contains of consecative rows from the matrix
import java.lang.*;
import java.util.Scanner;

class SwapMatrix
{
public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		Matrix mobj=new Matrix();
		
			int arr[][]=new int[5][4];
		
		int rlength=arr.length;
		int clength=arr[0].length;
			
			System.out.println("Enter elements in Martrix");
			
			for(int i=0;i<rlength;i++)
			{
				for(int j=0;j<clength;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
		System.out.println("Martrix is:");
			
			for(int i=0;i<rlength;i++)
			{
				for(int j=0;j<clength;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
		mobj.Swap(arr);
	}
}

class Matrix
{
		public int0 Swap(int arr[][])
		{
			int mix=10;
		int i,j,clength,rlength;
		int temp=0;
		rlength=arr.length;
		clength=arr[0].length;
		
		for(i=0;i<rlength-1;i+=2)
		{
				for(j=0;j<clength;j++)
				{
				 temp=arr[i][j];
				arr[i][j]=arr[i+1][j];
				arr[i+1][j]=temp;
				}
		}
		System.out.println(" Now Martrix is after swaping:");
			
			for( i=0;i<rlength;i++)
			{
				for( j=0;j<clength;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
		

		}
}
