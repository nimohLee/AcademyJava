import java.util.Scanner;

class Var4{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("키 입력:");
	int hei = sc.nextInt();

	
	double ft = hei/30.48;
	double inch = (hei-((int)ft*30.48))/2.54;
	
	System.out.println(hei+"cm는"+(int)ft+"피트"+inch+"인치입니다.");
	
	}
}