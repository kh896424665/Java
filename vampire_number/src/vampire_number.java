import java.util.Arrays;
public class vampire_number{
	public static void main(String[] args ) {
		int s=0;
		String[] str1,str2;
		int mul;
		for(int i=10;i<100;i++)
		{
			//  1000/10=100,��10��������λ����˶��������λ�������޳���Щ��
			for(int j=Math.max(1000/i,i+1);j<100;j++)
			{
				mul=i*j;
				str1=String.valueOf(mul).split("");
				str2=(String.valueOf(i)+String.valueOf(j)).split("");
				Arrays.sort(str1);
				Arrays.sort(str2);//���Ƚ����Ĵ�Сת��Ϊ�Ƚ��ַ�����ȵ�˼��
				if(Arrays.equals(str1, str2)) {
					System.out.println(mul+"="+i+"*"+j+";");
					s++;
				}
			}
		}
		System.out.println("We find "+s+" vampire numbers !");
	}
}