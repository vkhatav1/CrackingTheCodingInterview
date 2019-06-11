import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int[] arr = {1,2,7,4,5,2,5};
        int tar = 10;
        Map<Integer, List<Integer>> m = new HashMap<Integer,List<Integer>>();
        int x=0;
        int y=0;
        int indexi=0;
        int indexy =0;
        for(int i=0; i<arr.length; i++){
            int sum = tar - arr[i];
            if(m.containsKey(arr[i])){
               if(Math.max(x,y) < Math.max(sum,arr[i])){
                    x = arr[i];
                    y = sum;
                    indexi = i;
                    indexy = m.get(arr[i]).get(1);
               }
            }else{
                List<Integer> l = new ArrayList();
                l.add(arr[i]);
                l.add(i);
                m.put(sum,l);
            }
            
        }
        System.out.println(indexi + "  " + indexy);
     }
}
