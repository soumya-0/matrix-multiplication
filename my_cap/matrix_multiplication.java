package my_cap;
import java.io.*;
public class matrix_multiplication
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the dimension of 1st and 2nd matrix");
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int ar[][]=new int[n][m];
		int arr[][]=new int[n][m];
		System.out.println("Enter the value of 1st matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ar[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter the value of 2nd matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("1st matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter 1 for matrix ADDITION and 2 for matrix MULTIPLICATION");
		int c=Integer.parseInt(br.readLine());
		switch(c)
		{
			case 1:
			{
				int sum[][]=new int[n][m];
				int summ=0;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						summ=ar[i][j]+arr[i][j];
						sum[i][j]=summ;
					}
				}
				System.out.println("Added matrix is");
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						System.out.print(sum[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}
			case 2:
			{
				int mul[][]=new int[n][m];  //3 rows and 3 columns 
				System.out.println("Multiplyied matrix is");
			    
				//multiplying and printing multiplication of 2 matrices    
				for(int i=0;i<n;i++)
				{    
					for(int j=0;j<m;j++)
					{    
						mul[i][j]=0;      
						for(int k=0;k<m;k++)      
						{      
							mul[i][j]+=ar[i][k]*arr[k][j];      
						}//end of k loop  
						System.out.print(mul[i][j]+" ");  //printing matrix element  
					}//end of j loop  
					System.out.println();//new line    
				} 
				break;
			}
			default :
			{
				System.out.println("Wrong choice");
			}
		}
	}
}


