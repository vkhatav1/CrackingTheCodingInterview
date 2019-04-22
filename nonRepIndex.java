import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int[] arr = new int[]{1,2,3,3,4,5,1};
        Map<Integer,ArrayList<Integer>> m = new LinkedHashMap<Integer,ArrayList<Integer>>();
        for(int i=0; i<arr.length; i++){
            if(m.containsKey(arr[i])){
                ArrayList<Integer> a = m.get(arr[i]);
                int element = m.get(arr[i]).get(0)+1;
                a.set(0,element);
                m.put(arr[i],a);
            }else{
                m.put(arr[i],new ArrayList<Integer>());
                m.get(arr[i]).add(1);
                m.get(arr[i]).add(i);
            }
            
            
        }    
        for (int x : m.keySet()){
            if(m.get(x).get(0) == 1){
                System.out.println(m.get(x).get(1));
                break;
            }
        }
     }
}
