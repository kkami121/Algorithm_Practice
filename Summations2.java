import java.util.Scanner;

public class Summations2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수의 자리 수를 알려줍니다.");
		System.out.println("정수를 입력하시오.");
		System.out.println("int 타입 수이어야 하고 0이 아니어야 합니다.");		
		
		int number = input.nextInt();
		
		System.out.println(numberOfDigits(number) + "자리 수입니다.");
	}
	
	public static int powersOfTen(int n){
		int power = 1;
		if(n == 0){
			power = 1;
		}
		else{
			for(int i = 1; i <= n; i++){
				power *= 10;
			}
		}
		return power;
	}
	
	public static int numberOfDigits(int n){
		int i;
		for (i = 9; (n / powersOfTen(i)) == 0; i--);
			
		return i + 1;
	}
}