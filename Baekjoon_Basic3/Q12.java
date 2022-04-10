import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" 시와 분을  입력하세요 ");
		int finishHour = 0;
		int finishMinute = 0;

		int hour = scan.nextInt();
		int minute = scan.nextInt();

		System.out.println(hour + "  " + minute);

		System.out.println("오분에 구워지는 시간을 입력하세요");
		int timeOven = scan.nextInt();
		System.out.println(timeOven);

		finishMinute = minute + timeOven;

		if (finishMinute > 60) {
			finishHour = (finishMinute / 60) + hour;
			finishMinute = (finishMinute % 60);

			if (finishHour == 24) {
				finishHour = 0;
			}


			System.out.println(finishHour + " " + finishMinute);
		} else {
			System.out.println(hour + " " + (minute + timeOven));
		}


	}

}
