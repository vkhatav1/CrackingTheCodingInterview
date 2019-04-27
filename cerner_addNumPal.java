import java.util.Scanner;
public class palindrome {
	 static boolean flag = true;
     public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int in = Integer.parseInt(sc.nextLine());
       int count = 0;
        int reverse = 0;
        while(!pal(in)){
            int x = in;
            while(x != 0){
                reverse = reverse * 10;
                reverse += x%10;
                x = x/10;
            }
            count += 1;
            in = in+reverse;
        }
         System.out.println(count);  
        
     }

    public static boolean pal(int x){
        String str = Integer.toString(x);
        for(int i=0, j= str.length()-1; i<j; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
