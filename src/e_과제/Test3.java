package e_과제;

import java.util.Scanner;

// 1개의 수를 입력받아서 그 수가 2의 배수인지, 3의 배수진지, 5의 배수인지를 각각 구분해서 출력하시오.
public class Test3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("수를 입력하세요? ");
	
	int su1;
	su1 = sc.nextInt();
	
	if (su1 % 2 == 0) {
		System.out.println(su1 + "는 2의 배수입니다.");
		}

	if (su1 % 3 == 0) {
		System.out.println(su1 + "는 3의 배수입니다.");
		}
	
	if (su1 % 5 == 0) {
		System.out.println(su1 + "는 5의 배수입니다.");
	}
	}
}
