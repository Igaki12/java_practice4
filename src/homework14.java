import java.util.Scanner;
public class homework14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("’†ŠÔŒ±‚Ì“_”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int score_m = Integer.parseInt(scanner.next());
		System.out.println("Šú––Œ±‚Ì“_”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int score_f = Integer.parseInt(scanner.next());
		
		if (score_m >= 75 && score_f >= 75)
			System.out.println("‡Ši");
		else if (score_m + score_f >= 140)
			System.out.println("‡Ši");
		else if (score_m + score_f >= 100) {
			if (score_m >= 90 || score_f >= 90)
				System.out.println("‡Ši");
			else
				System.out.println("•s‡Ši");
		}
		else 
			System.out.println("•s‡Ši");
	}
	

}
