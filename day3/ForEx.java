class ForEx{
	
	public static void main(String[] args){
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		
		
		for(int i=0;i<100;i+=3){
			sum1+=i;
		}
		System.out.println("3의 배수의 합은 "+sum1+"입니다.");
		
		for(int i=0;i<100;i++){
			if(i%3==0)
				sum2+=i;
		}
		
		System.out.println("3의 배수의 합은 "+sum2+"입니다.");
		
		for(int i=1;i<=100;i++){
			sum3+=i;
			
			if(i%2==0)
				sum4+=i;
			else sum5+=i;
			
		}
		
		System.out.println("1~100 전체 합은 "+sum3+"입니다.");
		
		System.out.println("1~100 짝수의 합은 "+sum4+"입니다.");
		
		System.out.println("1~100 홀수의 합은 "+sum5+"입니다.");
		
	}
}