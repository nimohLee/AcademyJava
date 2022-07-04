import java.util.Scanner;

class SwitchEx{
	// switch - case
	
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("출력을 원하는 달을 입력해주세요 : ");
	int a = sc.nextInt();
	
	
	switch(a){ //if(조건) //switch(변수-값)
		case 1: System.out.println("Janurary"); break;
		case 2: System.out.println("Feburary"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break; 
		case 6: System.out.println("June");break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("October");break;
		default : System.out.println("잘못입력됨");break;
	}
	
	}
	
}