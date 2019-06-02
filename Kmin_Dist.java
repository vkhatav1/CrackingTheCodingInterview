import java.util.*;
public class distance {
	public static void main(String[] args) {
		SortedMap<Double, int[]> sm = new TreeMap<Double, int[]>(); 
        int arr[][] = {{-16,5},{-1,2},{4,3}, {10, -2}, {0, 3}, {-5, -9}};
        PriorityQueue<Double> ret = new PriorityQueue<>();
        int k = 3;
        int x = 0,y=0;
        for(int i=0;i<arr.length; i++){
            int z = ((x - arr[i][0]) * (x - arr[i][0]) + (y - arr[i][1]) * (y - arr[i][1]));
            sm.put(Math.sqrt(z), new int[] {arr[i][0],arr[i][1]});
        }
        
        Set s = sm.entrySet(); 
        Iterator i = s.iterator(); 
        while (i.hasNext() && k > 0) { 
            Map.Entry m = (Map.Entry)i.next(); 
            Double key = (Double)m.getKey(); 
            int[] value = (int[])m.getValue(); 
  
            System.out.println("Key : " + key + 
                            "  value : " + value[0] + " " + value[1]);
            k --;
        } 
		
	}
	 

}
