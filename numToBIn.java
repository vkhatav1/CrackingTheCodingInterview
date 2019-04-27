public class HelloWorld{
  
     public static void main(String []args){
        int n = 10;
        int bit = 0;
        StringBuilder out = new StringBuilder();
        while(n>0){
            bit = n%2;
            out.append(bit); 
            n = n/2;
        }
        System.out.println(out.reverse());
     }    
}
