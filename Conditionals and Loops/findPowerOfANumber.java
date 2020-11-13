import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
		int n=scan.nextInt();
		int i=1;
		int k=1;
		
		while(i<=n)
		{
			k=k*x;
			i=i+1;
		}
		
		System.out.println(k);
           
        
    }
}
