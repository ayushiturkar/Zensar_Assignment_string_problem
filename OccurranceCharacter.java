import java.util.Scanner;

public class OccurranceCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Enter String to Find First Char Occur = ");
		String string = scanner.nextLine();
		
		System.out.println("\nEnter the character to find");
		char ch = scanner.nextLine().charAt(0);
		
		for(int i=0; i<string.length(); i++) {
			if (string.charAt(i)==ch)
			{
				System.out.println("The First Character Occurrence of " +ch+ " at "  +i);
				break;
			}
		}

}
}
