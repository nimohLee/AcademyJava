import java.util.Scanner;

class Var3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력하시오");
		int wei = scan.nextInt();
		System.out.println("키를 입력하시오(m)");
		float hei = scan.nextFloat()/100;
		
		float bmi = wei/(hei*hei);
		
		System.out.print("당신의 BMI 지수는"+bmi+"입니다.");
		
		
		
		
	}
}