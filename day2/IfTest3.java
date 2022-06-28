import java.util.Scanner;


	class IfTest3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("영어 알파벳을 입력하시오 : ");
			
		int asc = sc.next().charAt(0);// 문자열에서 첫번째 글자만 가져오기.
		// char 타입과 int 타입은 자유롭게 형변환
		
		if((asc >= 65 && asc <= 90) || (asc >=97 && asc<=122)){
			if(asc == 65 || asc == 69 || asc == 73 || asc == 79 || asc == 85 || asc == 97 || asc == 101 || asc == 105 || asc == 111 || asc == 117)
				System.out.println("모음");
			else
				System.out.println("자음");
		}
		else{
			System.out.print("영어 알파벳이 아닙니다");
		}
		
	}
}