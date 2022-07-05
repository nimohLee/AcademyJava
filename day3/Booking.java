import java.util.Scanner;

class Booking{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String book[] = new String[10];
		
		for(int i=0;i<book.length;i++)
			book[i] = "책없음";
	
		System.out.println("== 도서관리 프로그램 ==");
		//System.out.println("메뉴를 선택하세요(1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)");
		
		//int input = sc.nextInt();
		int input; // 메뉴선택 번호
		int idx; // 책 번호
		boolean isRun = true; //while이 반복되기 위한 변수
		int savedIdx=0; //신경안써도 됨
		
		while(isRun){
			System.out.println("메뉴를 선택하세요(1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)");
		
			input = sc.nextInt();
			switch(input){
				
				case 1: 
						System.out.println("책 이름을 입력하세요. : ");
						String book_name = sc.next(); 
						System.out.println();
						
						for(int i=0;i<book.length;i++){
							if(book[i] == "책없음"){
								book[i] = book_name;
								savedIdx= i+1; //savedIdx 신경안써도 됨
								break;}
						}
						System.out.println("===도서명 \""+book_name+"\"이(가) "+savedIdx+"번에 입력되었습니다.===\n");//savedIdx 신경안써도 됨
						break;
					
				case 2: System.out.println("삭제할 도서의 번호를 입력하세요.");
						idx = sc.nextInt(); //삭제하고 싶은 책 번호 입력
						System.out.println(book[idx-1]+"를 삭제합니다"); // 삭제하고 싶은 책 선택(사람은 1번째를 입력해도 코드에서 배열은 0번부터(book[0]) 시작하기때문에 사람입력숫자 -1 )
						book[idx-1] = "책없음"; // 삭제하고 싶은 책꽂이에 "책없음"이라고 넣어줌
						System.out.println("===삭제가 완료되었습니다.===");
						break;
						
				case 3: System.out.println("===전체 도서를 출력합니다.===\n");
						for(int i=0;i<book.length;i++)//0부터 책꽂이 길이만큼
							System.out.println((i+1)+"번 도서: "+ book[i]+"\n"); //i는 0부터지만 도서는 1번부터 시작하기 때문에 (i+1)번도서라고 표현
						break;
						
				case 4: System.out.println("책 번호을 입력하세요. : ");
						idx = sc.nextInt(); // 책 번호 입력
						System.out.println();
						System.out.println("===검색하신 번호에 해당하는 도서는 " + book[idx-1] + "입니다.===\n"); // 책 번호(사람이 쓴 번호-1)을 책꽂이에서 검색해서 안에 내용표시(book[idx-1])
						break;
				
				case 5: System.out.println("===서비스를 종료합니다.===");
						isRun=false; // isRun이 false(거짓)이 되면 while이 끝남.
						break;
				
				default : System.out.println("잘못 입력하셨습니다.");
				
			}
			
		}
	}

}