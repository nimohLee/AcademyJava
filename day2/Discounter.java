import java.util.Scanner;

class Discounter{

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건가격 : ");
		int price = sc.nextInt();
		System.out.print("개수 : ");
		int many = sc.nextInt();
		
		System.out.print("결과 : ");
		
		if(price<=100000){
			if(price<=10000)
				System.out.print((int)(price*many));
			else if(price<=50000)
				System.out.print((int)((price*0.95)*many));
			else 
				System.out.print((int)((price*0.9)*many));
			
		}
	
	
	
	
	
	
	}
}
