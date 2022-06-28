import java.util.Scanner;

class Sallary{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int sallary;
		int years;

		System.out.print("기본연봉 입력: ");
		sallary = sc.nextInt();
		System.out.print("연차 입력: ");
		years = sc.nextInt();
		
		System.out.print("당신의 연봉은");
		
		if(years < 10){
			if(years == 2)
				System.out.print((int)(sallary*1.05));
			else if(years == 3)
				System.out.print((int)(sallary*1.05*1.05) );
			else if(years >= 4)
				System.out.print((int)(sallary*1.05*1.05*1.05));
		}
		else 
			System.out.print((int)(sallary*1.1));
		
		System.out.print("만원 입니다.");

	}
}
