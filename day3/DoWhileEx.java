class DoWhileEx{
	public static void main(String args[]){
	/*	
		int num=5;
		do{
			System.out.println("출력");
		}while(num<2);
		*/
		
		int num=4;
		do{
			System.out.println("내부"+num);
			num++;
		}while(num<=5);
		System.out.println("외부"+ num);
	}
}