package third;

public class program3 
{	
	public static void main(String[] args) 
	{
		int arr1[][] = new int [][] {{1,3,4},{6,8,1},{3,6,2},{2,1,0}};
		int arr2[][] = new int [][] {{2,1,0},{1,3,4},{6,8,1},{3,6,2}};
		int sum[][] = new int[4][5];
		for(int i=0;i<4;i++)
		{  for(int j=0;j<3;j++)
		  {  sum[i][j] = arr1[i][j]+arr2[i][j];
		  }
		}
		for(int i=0;i<4;i++)
		{  for(int j=0;j<3;j++)
		  {  System.out.print(sum[i][j] + "  ");
		  }
		System.out.print("\n");
		}
	}
}
