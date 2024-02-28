package t2_연산자;

import java.util.Scanner;

public class Test7 {
 public static void main(String[] args) {
	
	 // 점수가 90점 이상은 'A'학점,  점수가 80점 이상은 'B'학점,  점수가 70점 이상은 'C'학점,  점수가 60점 이상은 'D'학점,  점수가 60점 미만은 'F'학점 
	 Scanner sc = new Scanner(System.in);
	
	 String res;
	 int su;
	 
	 System.out.print("점수를 입력하세요? ");
	 su = sc.nextInt();
	 
	 res = (su >= 90) ? "A" : (su >= 80) ? "B" : (su >= 70) ? "C" : (su >= 60) ? "D" : "F";
	 System.out.println("점수 " + su+ "는 " + res + "입니다.");
	
	 sc.close();
 }
}
