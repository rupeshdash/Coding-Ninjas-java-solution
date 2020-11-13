import java.util.Scanner;
public class Solution {

  

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();
        int W = scan.nextInt();
        int far;
        while(S<=E && S>=0 && W>=0)
        {
            far= 5 *(S-32)/9;
                System.out.print(S);
                System.out.print("\t");
                System.out.println(far);
                S=S+W;
                
            
        }

		
	}

}
