import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter a string \n");
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         String rev= "";
         
         for(int i=str.length()-1; i>=0 ;i--) {
        	 rev = rev + str.charAt(i);
         }
         if(str.equals(rev)) 
        	 System.out.println(str+ " is a palindrome");
         else
        	 System.out.println(str+ " is not a palindrome");
        	
         }
	}


