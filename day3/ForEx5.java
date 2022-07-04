class ForEx5{
public static void main(String args[]){
	
	
	int sum=0;
	for(int i=1; i<=100;i++){
		if(i%10==0)
		System.out.println(i);
		else
		System.out.print(i+" ");
	}

		System.out.println();

	for(int i=1; i<=10;i++){
		for(int j=1; j<=10; j++){
			sum++;
			System.out.print(sum+" ");
		}
		
		System.out.println();
		
	}
	
}
}