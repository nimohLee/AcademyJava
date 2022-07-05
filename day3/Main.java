import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;
        
        if(a==b&& b==c)
            System.out.println(10000+(a*1000));
        else if(a==b)
            System.out.println(1000+(a*100));
        else if(b==c)
            System.out.println(1000+(b*100));
        else if(a==c)
            System.out.println(1000+(a*100));
        else{
            while(!(a>b&&b>c)){
                if(b>a){
                    tmp=a;
                    a = b;
                    b = tmp;
                }
                else if(c>b){
                    tmp=b;
                    b = c;
                    b = tmp;
                }
				
            }
        }
             System.out.println((a*100));
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
        
    }
}