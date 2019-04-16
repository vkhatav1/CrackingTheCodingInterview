public class HelloWorld{

     public static void main(String []args){
        String str = "abababcddee";
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'a'] += 1;
        }
        
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i) - 'a']== 1){
                System.out.println(str.charAt(i));
            }
        }
     }
}
