import java.util.*;
public class direction {
	public static void main(String[] args){
		 int[] arr = new int[] {1, 0, -1, 0, -2, 2};
		 int count =0;
		 int sum = 0;
		 int flag = 0;
		 Map<Integer,Integer>  m = new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++){
			 for(int j=i+1; j<arr.length;j++){
				 for(int k=j+1; k<arr.length;k++) {
					 for(int l=k+1; l<arr.length; l++) {
						 if(arr[i]+arr[j]+arr[k]+arr[l] == 0) {
							 count += 1;
						 }
					 }
				 }
			 }
		 }
		 System.out.println(count);
	}
}
