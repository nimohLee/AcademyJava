import java.util.Scanner;

class Gugudan{
	public static void main(String[] args){
		
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(i+"x"+j+"="+(i*j)+"  ");
			}
			System.out.println();
		}
		
		System.out.println("==============================================");
		
		for(int i=1;i<10;i++){
			for(int j=2;j<10;j++){
				System.out.print(j+"x"+i+"="+(j*i)+"  ");
			}
			System.out.println();
		}
	}
}