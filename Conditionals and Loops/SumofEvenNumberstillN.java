import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       
        int sum=0;
         int i = 2;
        while(i <= n)
         {
             if(i%2 == 0)
             {
                 sum=sum+i;
                 i=i+2;
             //    return;
                 
             }
             
            
         }
		 System.out.println(sum);
	}

}
