import java.util.*;
public class direction {
	public static void main(String[] args){
		 int[] arr = new int[] {1,-2,-1,-3,0,-1,-3,1,3,2};
		 int count =0;
		 int sum = 0;
		 int flag = 0;
		 Map<Integer,Integer>  m = new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++){
			 for(int j=i+1; j<arr.length;j++){
				 for(int k=j+1; k<arr.length;k++) {
					 if(m.containsKey(arr[k])){
						 if(flag == 0) {
							 count += 1; 
						 }						 
					 }else {	
						 sum = arr[i]+arr[j]+arr[k];
						 m.put(sum*-1, arr[k]);
					 }
					 if(k == arr.length - 1) {
						 flag = 1;
					 }
					
				 }
			 }
		 }
	}
}
