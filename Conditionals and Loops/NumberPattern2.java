import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int i=1;
		 while(i<=N)
		 {
			 int j=1;
			 int t=i;
		
             
             int space=1;
             while(space<=(N-i))
             {
                 System.out.print(" ");
                 space++;
             }
             
             
             
             
             
             while(j<=i)
			 {
				 System.out.print(t);
				 t++;
				 j++;
			 }
             
             
			 System.out.println();
			 i++;
		 }
		
	}

}
