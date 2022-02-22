package corejavaexamples;

public class ArrayAddDemo 
{
	public static void main(String[] args)
	{
		int arr[] = {10,15,20,25,30,100};
		int sum=0,revNo;
		
		 for (int i = 0; i < arr.length; i++)
		 {
			 if(arr[i]>15)
			 {
				 sum=sum+arr[i];
				System.out.println("Total Sum Is "+sum);
				
				int num=sum;
				int revNum=0;
				
				while(num!=0)
				{
					int digit=num%10;
					num/=10;
					revNum=revNum*10+digit;
				}
				System.out.println("Reverse No Is "+revNum);
			 }
		 }
	}

}
