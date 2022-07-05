class Lotto{
	public static void main(String[] args){
		int[] nums = new int[6];
		for(int i=0;i<nums.length;i++){
			int ran = (int)(Math.random()*45)+1;
			nums[i]=ran;
		}// 로또 배열에 1~45까지 값 다 넣기
	
		//두번째(i=1)일 때 부터 비교 -> nums[0(i)]와만 비교하면 된다
	
		//중복 제거 코드
		for(int j=0;j<i;j++){
			if(nums[j]==nums[i]){
				i--;
				break;
			}
		}
	
	
	
	
	
	
	
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
}