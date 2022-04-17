import java.util.Arrays;
import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		
		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		
		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		
		
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("과목수를 입력하시오");
		double score = 0;
		double sum = 0;
		int num = scan.nextInt();
		double[] list = new double[scan.nextInt()];

		for (int i = 0; i < list.length; i++) {
			System.out.println("배열에 들어갈 숫자를 입력하세요 ");
			double input = scan.nextDouble();
			list[i] = input;
		}

		Arrays.sort(list);


		// [40,80,60]
		for (int i = 0; i < list.length; i++) {
			sum += ((list[i] / list[list.length - 1]) * 100);
		}


		System.out.println("평균점수는" + sum / list.length + "입니다");


		//
		// for (int i = 0; i < arr.length; i++) {
		// sum += ((arr[i] / arr[arr.length - 1]) * 100);
		// }
		// System.out.print(sum / arr.length);
	}

}


