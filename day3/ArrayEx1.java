class ArrayEx1{
	//1. 배열 -> 2. Collection
	// 배열은 변수의 묶음이다.
	// 배열은 미리 공간을 만들어야 한다. (몇개짜리 묶음인가?)
	// 배열은 변수 + [숫자] 형태로 만들어 진다. ex) book[0]
	// 배열의 시작은 0부터 이고, 배열의 전체 크기는 "배열이름.length"
	// 배열을 만들때는 type 배열명[] = new type[개수];
	// 			ex) int arr[] = new int[10]; (10개짜리 변수묶음)
	// 또는 미리 값을 넣어도 된다. int arr2[] = {1,2,3,4,5};
	
	public static void main(String args[]){
		String book[] = {"노인과 바다", "오만과 편견", "데미안"};
		String book1[] = new String[5];
		//String book1 = "노인과 바다";
		book1[0] = "오만과 편견";
		book1[1] = "데미안";
		book1[2] = "노인과 바다";
		book1[3] = "장발장";
		book1[4] = "달과 6펜스";
		
		for(int i=0;i<book1.length;i++)
			System.out.println(book1[i]);
	}
}