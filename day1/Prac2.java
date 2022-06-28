import java.util.Scanner;

class Prac2{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	double power;
	double me;
	
	System.out.print("힘을 입력하시오.(단위 : N) : ");
	power = sc.nextDouble();
	
	System.out.print("면적을 입력하시오. (단위 : m2) : ");
	me = sc.nextDouble();
	
	System.out.println("압력은 "+(power/me)+"Pa 입니다");
	
	}
}