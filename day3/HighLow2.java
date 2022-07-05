import java.util.Scanner;

class HighLow2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1.새게임 2.점수확인 3.게임종료 : ");
		int menu = sc.nextInt();
		boolean isRun = true;
		int score=0;
		
		
		while(isRun){
			if(menu==1){ 
				System.out.println("새 게임을 시작합니다.");
				double a = Math.random();
				int ranNum = (int)(a*100)+1;
				System.out.println(ranNum);
				while(true){
				System.out.println("숫자를 입력해 주세요(강제종료(0))");
				int input = sc.nextInt();
				
					if(input==0){
						System.out.println("강제종료합니다");
						isRun = false;
						break;
					}else if(input>ranNum){
						System.out.println("더 작은 수를 입력하세요");	
					}else if(input<ranNum){
						System.out.println("더 큰 수를 입력하세요");
					}else{
						System.out.println("빙고");
						score++;
						System.out.print("1.새게임 2.점수확인 3.게임종료 : ");
						menu = sc.nextInt();
						break;
					} 
				}

			}else if(menu==2){
				System.out.println("점수를 확인합니다.");
				System.out.println("현재 점수는 "+ score + "점 입니다.");
				System.out.print("1.새게임 2.점수확인 3.게임종료 : ");
				menu = sc.nextInt();
			}else if(menu==3){
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
			}
		}
	}
}