class Var3{
	public static void main(String[] args){
		int i = 10;
		String str = "10";
		
		int a = Integer.parseInt(str)+str;
		
		float f = 20f;
		String str2 = "20";
		
		System.out.println(i+str);
		System.out.println(f+str2);
		System.out.println(str+str2);
		System.out.println(a);
	}
}