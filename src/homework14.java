import java.util.Scanner;
public class homework14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("中間試験の点数を入力してください");
		int score_m = Integer.parseInt(scanner.next());
		System.out.println("期末試験の点数を入力してください");
		int score_f = Integer.parseInt(scanner.next());
		
		if (score_m >= 75 && score_f >= 75)
			System.out.println("合格");
		else if (score_m + score_f >= 140)
			System.out.println("合格");
		else if (score_m + score_f >= 100) {
			if (score_m >= 90 || score_f >= 90)
				System.out.println("合格");
			else
				System.out.println("不合格");
		}
		else 
			System.out.println("不合格");
	}
	

}
