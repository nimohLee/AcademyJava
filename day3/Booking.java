import java.util.Scanner;

class Booking{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String book[] = new String[10];
		
		for(int i=0;i<book.length;i++)
			book[i] = "책없음";
	
		System.out.println("== 도서관리 프로그램 ==");
		System.out.println("메뉴를 선택하세요(1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)");
		
		int input = sc.nextInt();
		int idx;
		boolean isRun = true;
	
		
		while(isRun){
		
			switch(input){
				
				case 1: 
						System.out.println("책 이름을 입력하세요. : ");
						String book_name = sc.next();
						for(int i=0;i<book.length;i++){
							if(book[i] == "책없음"){
								book[i] = book_name;
								break;}
						}
						break;
					
				case 2: System.out.println("삭제할 도서의 번호를 입력하세요.");
						idx = sc.nextInt();
						System.out.println(book[idx-1]+"를 삭제합니다");
						book[idx-1] = "책없음";
						System.out.println("삭제가 완료되었습니다.");
						break;
				case 3: System.out.println("전체 도서를 출력합니다.");
						for(int i=0;i<book.length;i++)
							System.out.println(book[i]);
						break;
				case 4: System.out.println("책 번호을 입력하세요. : ");
						idx = sc.nextInt();
						System.out.println(book[idx-1]);
						break;
				
				case 5: System.out.println("서비스를 종료합니다.");
						isRun=false;
						break;
				
				default : System.out.println("잘못 입력하셨습니다.");
				
			}
			System.out.println("메뉴를 선택하세요(1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)");
		
			input = sc.nextInt();
		}
	}

}