package t1_variable;

public class Test2 {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 010; //8진수 10이라 읽는다
		int a3 = 0x10; //16진수
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println();
		
		int num = 10;
		
		String binaryNum = Integer.toBinaryString(num); //2진수로 변환
		String octaNum = Integer.toOctalString(num); 		//8진수로 변환
		String hexaNum = Integer.toHexString(num);  		//16진수로 변환
				
		
		System.out.println("10진수 num : " + num);
		System.out.println("2진수 binaryNum : " + binaryNum);
		System.out.println("8진수 octaNum : " + octaNum);
		System.out.println("16진수 hexaNum : " + hexaNum);
	}
}
