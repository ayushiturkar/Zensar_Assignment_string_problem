import java.util.Scanner;

public class CountOccurrance {
    
	public static void main(String[] args) {
		System.out.println("Enter the string to count the occurrance: \n");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
        
       int count[] = new int[256]; 

   	//String length
   	int len = str.length(); 

   	for (int i = 0; i < len; i++) 
   		count[str.charAt(i)]++; 

   	
   	char array[] = new char[str.length()]; 
           for (int i = 0; i < len; i++) { 
   	   array[i] = str.charAt(i); 
   	   int flag = 0; 
   	   for (int j = 0; j <= i; j++) { 

   		
   		if (str.charAt(i) == array[j])  
   			flag++;                 
   	   } 

   	   if (flag == 1)  
   	      System.out.println("Occurrence of char " + str.charAt(i)
   		 + " in the String is:" + count[str.charAt(i)]);
       }
       
	}

}
