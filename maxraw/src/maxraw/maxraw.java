package maxraw;

public class maxraw {
	public static void main(String[] args){
		int[][] a={{4,2,6,1},{8,9,8,4},{7,2,4,2}};
		int sum=0;
		int row=-1;
		int t=0;
		System.out.println("The Array is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			
			if (sum>t){
				t=sum;
				row=i;
			}
		}
		System.out.println("The max row number is:"+row);
		
	}
}
