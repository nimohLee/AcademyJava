import java.util.Scanner;

class Var3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력하시오");
		int wei = scan.nextInt();
		System.out.println("키를 입력하시오");
		float hei = scan.nextFloat()/100;
		float bmi = wei/(hei*hei);
	
		System.out.println("당신의 BMI 지수는"+bmi+"입니다.");
		
		if(bmi>=18.5&&bmi<=24.9)
			System.out.println("*********정상체중입니다*********");
		else if(bmi>=25)
			System.out.println("*********비만입니다**********");
		else
			System.out.println("정상적인 입력하시오");

		
	}
}