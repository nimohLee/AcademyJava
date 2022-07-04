class ForEx6{
	
	public static void main(String[] args){
	
	int num =0;

	for(int i=0;i<10;i++){
		for(int j=1;j<=10;j++){
			num++;
			if(i>1){ // 숫자가 10 이상일때
				if((i%3==0 && num%10!=0 ) || j%3 == 0|| num%30 ==0) // i가 3 의 배수면서(30,60,90번대) num이 10의 배수가 아닐 때 or j가 3의 배수일 때(일의 자리가 3,6,9) or num이 30의 배수일 때
					System.out.print("짝 ");
				else
					System.out.print(num+" ");
			}	
			else{// i=0일때 ( 1의 자리일 때)
				if(j%3==0)
					System.out.print("짝 ");
				else	
					System.out.print(num+ " ");
			}
		}
		
		System.out.println();
	}
	
	 
      for(int i=1;i<=10;i++){// 1번 반복될때 1~10
         for(int j=1;j<=10;j++){// 10번 반복됨 1~10 //총 100qjs
            num++;
            if(j%3==0){
               System.out.print("짝 ");
            }else if(num%30==0){
               System.out.print("짝 ");
            }else if((int)(num*0.1)==3 || (int)(num*0.1)==6 || (int)(num*0.1)==9){
               System.out.print("짝 ");
            }else{
               System.out.print(num+" ");
            }
         }
         System.out.println();
      }

	
  }
}