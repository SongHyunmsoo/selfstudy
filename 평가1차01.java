package 평가01;

import java.util.Scanner;

public class 평가1차01 {

	/*
	 * [문항1] 사용자가 키보드로 입력한 연도가 
	 * 윤년인지 평년인지 판별하는 프로그램을 
	 * 작성하세요.(배점 20 점)( 답안은 txt. 파일로
	 * 작성하여 첨부파일란에 올려주세요.)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"연도를 입력하세요");
		int 년도 = scanner.nextInt();
		if (년도 % 4 == 0)  {
			System.out.println(
					"윤년입니다.");
		} else {
			System.out.println(
					"윤년이 아닙니다.");
		}

	}

}
