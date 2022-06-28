import java.util.Scanner;

class Calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해 주세요 : ");
		int i = sc.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		int j = sc.nextInt();
		System.out.print("연산식을 입력해 주세요 : ");
		char op = sc.next().charAt(0);// 문자열에서 0번째(첫번째)글자 하나를 가져온다.
		                    // 글자 하나이기 때문에 char 타입이다.
		// charAt(0)의 결과가 char 이지만 필요에 따라서 int로 받아도 된다.
		// char <-> int는 자동으로 바뀐다. int에 대응하는 숫자는 아스키코드표 참조
		
		if(op=='+'){
			System.out.println(i+j);
		}else if(op=='-'){
			System.out.println(i-j);
		}else if(op=='/'){
			System.out.println(i/j);
		}else if(op=='*'){
			System.out.println(i*j);
		}
		
	}
}