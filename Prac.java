import java.util.Scanner;

class Prac{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("500원 갯수 :");
	int a = sc.nextInt()*500;
	
	System.out.print("100원 갯수 :");
	int b = sc.nextInt()*100;
	
	System.out.print("50원 갯수 :");
	int c = sc.nextInt()*50;
	
	System.out.print("10원 갯수 :");
	int d = sc.nextInt()*10;
	
	System.out.print("총 금액은 "+(a+b+c+d)+"입니다");
	
	
	
	}
}
	