import java.util.Scanner;

class HighLow{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int user,count=0;
		double ran = Math.random();// 0~1의 사이의 실수를 랜덤하게
		int answer = (int)(ran*100)+1;
		System.out.println(answer);
		
		
		
		System.out.println("== 하이 로우 게임 ==");
		System.out.println("랜덤 숫자가 생성되었습니다.");
		
		
		for(;;){
			System.out.print("숫자를 입력해주세요.");
			user = sc.nextInt();
			count++;
			if(user>answer)
				System.out.println(" 다운 ");
			else if(user<answer)
				System.out.println(" 업 ");
			else{
				System.out.println(count+"회만에 정답 ");
				break;}
		}
	}
	
}