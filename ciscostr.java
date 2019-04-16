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
/*--------------------------------using Linked HashMap-------------------------------------*/

import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String str = "abcabcefefaaaaaaaaaaaaaaaaaaaaaad";
        Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++){
          if(m.containsKey(str.charAt(i))){
             m.put(str.charAt(i) , m.get(str.charAt(i))+1);
              
          }else{
               m.put(str.charAt(i),1);
          }
        }
        
        
        for(Character x : m.keySet()){
            if(m.get(x) == 1){
                System.out.println(x);
                return;
            }
        }
     }
}
