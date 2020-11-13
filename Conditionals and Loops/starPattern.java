import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
        int N = scan.nextInt();
        int i=1;
        
        while(i<=N)
        {
            int space=1;
            while(space<=N-i)
            {
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            
            j=1;
            while(j<=i-1)
            {
                System.out.print("*");
                j++;
            }
             System.out.println();
            i++;
                
        }

		
	}

}
