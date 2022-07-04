import java.util.Scanner;


class Factorial{

	public static void main(String[] args){
		//숫자입력을 1개 받습니다.
		//1부터 입력받은 숫자까지의 곱
		//ex) 5를 입력 받으면 1*2*3*4*5 의 값을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int j = sc.nextInt();
		int fac =1;
		/*for(int i=1;i<=j;i++){
			fac = fac*i;
		}*/
		
		
	    for(int i = j;j>0;i--)
			fac *= i;
		
		System.out.println(fac);
			
		
	}

}