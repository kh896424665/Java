import java.util.Arrays;
public class vampire_number{
	public static void main(String[] args ) {
		int s=0;
		String[] str1,str2;
		int mul;
		for(int i=10;i<100;i++)
		{
			//  1000/10=100,即10与任意两位数相乘都不会得四位数，故剔除那些数
			for(int j=Math.max(1000/i,i+1);j<100;j++)
			{
				mul=i*j;
				str1=String.valueOf(mul).split("");
				str2=(String.valueOf(i)+String.valueOf(j)).split("");
				Arrays.sort(str1);
				Arrays.sort(str2);//将比较数的大小转换为比较字符串相等的思想
				if(Arrays.equals(str1, str2)) {
					System.out.println(mul+"="+i+"*"+j+";");
					s++;
				}
			}
		}
		System.out.println("We find "+s+" vampire numbers !");
	}
}