import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        int sumEven=0;
		int sumOdd=0;
		int k;
        while(!((int)num/10==0))
		{
			k=num%10;
			if(k%2==0)
			{
				sumEven=sumEven+k;
			}
			
			else {
				sumOdd=sumOdd+k;
			}
			num=(int)num/10;
		}
        if(num%2==0)
		{
			sumEven=sumEven+num;
		}
		else {
			sumOdd=sumOdd+num;
		}
		System.out.print(sumEven);
		System.out.print(" ");
		System.out.println(sumOdd);

	}
}
