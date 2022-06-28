class Operator{
	/*	전부 주석
		연산자 = 기본 4칙연산 + a
		+,-,*,/,%		
	*/
	public static void main(String args[]){
		int i = 10;
		int j = 3; // =이 하나면 대입연산자 ==면 비교연산자		
		// 삼(3)항 연산자 
		// 조건 ? 참 : 거짓
		System.out.println(i%j?"참":"거짓");
		
		//System.out.println(10 == 20);//false; 같다
		//System.out.println(10 != 20);//true; 같지않다.
		
		/*
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		*/
		/*
		//  and (&&)
		//    그리고
		//양쪽다 true일때만 결과가 true 임
		System.out.println((10>2) && (5>2) );	//true	
		System.out.println(true && true ); // true
		System.out.println((10>2) && (5<2) ); // false
		System.out.println(true && false ); //false
		
		// or (||)
		//	또는
		//양쪽중 한쪽만 true면 결과가 true 임;
		System.out.println((10>2) || (5>2) );	//true	
		System.out.println(true || true ); // true
		System.out.println((10>2) || (5<2) );// true
		System.out.println(true || false );// true
		*/
		
		/*
		i = i+2;
		i+=2;// 위와 같은 말
		i-=2;
		i*=2;
		i/=2;
		i%=2;
		*/
		
		
		
		//System.out.println(i++); // i = i+1; // 출력먼저! 이후 +1 해줌
		//System.out.println(i);
		
		//System.out.println(++i);// 일단 +1 부터 함
		
		
		
		/*
		i++;
		System.out.println("++ : "+i); // i = i+1 
		j--;
		System.out.println("-- : "+j); // j = j-1
		
		System.out.println("+ : "+(i+j));
		System.out.println("- : "+(i-j));
		System.out.println("* : "+(i*j));
		System.out.println("/ : "+(i/j));// 나누기 (나머지는 표시 안됨)
		System.out.println("% : "+(i%j));// 나눈 나머지 - mod
		*/
		
	}
}