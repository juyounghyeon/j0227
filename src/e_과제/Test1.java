package e_과제;

import java.util.Scanner;

// 수를 입력받아서 홀수 인지 짝수인지를 판별하시오.
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		
		System.out.print("수를 입력하세요? ");
		su = sc.nextInt();
		
		if(su % 2 == 1) {
			System.out.println(su + "는 홀수입니다.");
		}
		else {
			System.out.println(su + "는 짝수입니다.");
		}
		
		sc.close();
	}

}
