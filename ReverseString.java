import java.util.Scanner;
import java.lang.String; 
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string \n");
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          
          String rev = "";
          for(int i= str.length()-1; i>=0 ; i--)
          {
        	  rev=rev+str.charAt(i);
          }
          
          System.out.println(rev+ " is a reverse string");
          
          
          
          
          
          
          
	}

}
