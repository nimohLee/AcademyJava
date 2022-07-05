import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<String> sum = new ArrayList<String>();
        //int copyArray[];
        int a,b,i=0;
        boolean isRun = true;
      
        while(isRun){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0&&b==0)
                break;
            else{
                sum.add(Integer.toString(a+b));
                 }
        }
        
        String copyArray[] = new String[sum.size()];
        
		for(int j=0;j<copyArray.length;j++){
			copyArray[j]=sum.get(j);
		}
		
        for(int j=0;j<copyArray.length;j++)
            System.out.println(copyArray[j]);
    }
}