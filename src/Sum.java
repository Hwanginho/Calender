import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 두 수를 입력 받는다.
		// 출력 : 두 수의 합을 출력한다.
		int num1,num2;
		System.out.print("두 숫자 입력 : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
//		System.out.println("입력받은 숫자 = "+num1+", "+num2);
//		System.out.println("두 수의 합은 = "+(num1+num2));
		System.out.printf("입력받은 숫자 = %d, %d",num1,num2);
		System.out.printf("두 수의 합은 = %d",num1+num2);
		scan.close();
	}
}
