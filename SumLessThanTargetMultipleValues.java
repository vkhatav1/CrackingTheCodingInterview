import java.util.*;
public class HelloWorld{
     public static void main(String []args){
        HelloWorld ob = new HelloWorld(); 
        int ar1[] = {11, 4, 10, 7,20}; 
        int ar2[] = {10, 20, 19, 40,7}; 
        int m = ar1.length; 
        int n = ar2.length; 
        int x = 28; 
        ob.printClosest(ar1, ar2, m, n, x); 
    
     }
     
    void printClosest(int ar1[], int ar2[], int m, int n, int x){ 
        int max =0;
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++ ){
                int sum = ar1[i] + ar2[j];
                if(sum == x){
                    max = sum;
                   List<Integer> b = new  ArrayList();
                   b.add(i);
                   b.add(j);
                   l.add(b);
                }else if(sum < x){
                    if(sum > max){
                        max = sum;
                       List<Integer> n2 = new  ArrayList();
                       n2.add(i);
                       n2.add(j);
                       l1.removeAll(l1);
                       l1.add(n2);
                    }else if(sum == max){
                        max = sum;
                       List<Integer> n1 = new  ArrayList();
                       n1.add(i);
                       n1.add(j);
                       l1.add(n1);
                    }
                    
                }
            
            }
        }

                if(l.size() > 0){
                    for(List li: l){
                        System.out.println(li.get(0)+ " "+ li.get(1));
                    }
                }else{
                    for(List lis: l1){
                        System.out.println(lis.get(0)+ " "+ lis.get(1));
                    }
                }
      
    } 
}
