import java.util.Scanner;
public class homework14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���Ԏ����̓_������͂��Ă�������");
		int score_m = Integer.parseInt(scanner.next());
		System.out.println("���������̓_������͂��Ă�������");
		int score_f = Integer.parseInt(scanner.next());
		
		if (score_m >= 75 && score_f >= 75)
			System.out.println("���i");
		else if (score_m + score_f >= 140)
			System.out.println("���i");
		else if (score_m + score_f >= 100) {
			if (score_m >= 90 || score_f >= 90)
				System.out.println("���i");
			else
				System.out.println("�s���i");
		}
		else 
			System.out.println("�s���i");
	}
	

}
