import java.lang.Math;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner scan= new Scanner(System.in);
        
        int Basic = scan.nextInt();
        String str = scan.next();
        char grade = str.charAt(0);
       
        double hra=0;
        double da=0;
        int allow=0;
        double pf=0;
        double Total_salary=0;
       if(grade=='A')
       {
           allow=1700;
       }
        else if(grade=='B')
        {
            allow = 1500;
        }
        
        else{
            allow=1300;
        }
        
        
            hra = 0.2*Basic;
            da= 0.5*Basic;
            pf=0.11*Basic;
      
	
        Total_salary=Basic+hra+da+allow-pf;
        System.out.println(Math.round(Total_salary));        
	}
}
