package mnumber;
import java.util.Scanner;
public class maxnum {

	public static void main(String[] args) {
		int []a={1,3,5,2,5,0};
		int t=a[0];
		int k=-1;
		System.out.print("The Array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>t){
				t=a[i];
				k=i;
			}
		}
		System.out.println("The max number is:"+t);
		System.out.println("The localtion of the max number is:"+k);
		
		//第二种，可以自行输入数据
		/*
		int[] b=new int[10];
		Scanner scanf=new Scanner(System.in);
		System.out.println("Please input ten numbers:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=scanf.nextInt();
		}
		int m=b[0];
		int n=-1;
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>m) {
				m=b[i];
				n=i;
			}
		}
		System.out.println("The max number is:"+m);
		System.out.println("The localtion of the max number is:"+n);
		*/
		
	}

}
