import java.util.Scanner;

class BookManager{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int bookSize=3;
		String book[] = new String[bookSize];
		
		int idx = 0;
		while(true){
			System.out.print("책을 입력합니다.");
			String input = sc.nextLine();
			
			book[idx]=input;
			idx++;
			
			if(idx==book.length)
				break;
			System.out.println(book[0]);
			
		}
	}
}