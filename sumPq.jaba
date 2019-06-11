import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(); 
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int out = 0;
        for(int i=0; i< arr.length; i++){
            p.add(arr[i]);
        }
        int sum = p.remove();
        while(!p.isEmpty()){
            sum += p.remove();
            out += sum;
            p.add(sum);
            sum = p.remove();
            
        }
        System.out.println(out);
     }
}
