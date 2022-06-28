rimport java.util.Scanner;

class ElseIf{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int point = sc.nextInt();
		
		
		if(point<=100&&point>=90)
			System.out.print("결과 : A");
		else if(point<=89 && point >= 80)
			System.out.print("결과 : B");
		else if(point<=79 && point >= 70)
			System.out.print("결과 : C");
		else if(point<=69 && point >= 60)
			System.out.print("결과 : D");
		else if(point<=59)
			System.out.print("결과 : F");
		else
			System.out.print("잘못 입력되었습니다.");
	
	
	}
	
}