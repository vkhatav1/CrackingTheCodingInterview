import java.util.*;
public class direction {
	public static void main(String[] args){
		int x = 1;
		int x1= 9;
		int y = 0;
		int y1= 0;
		StringBuilder str = new StringBuilder(); 
		if(x == x1 && y == y1) {
			System.out.println("same point");
			return;
		}
		if(y != y1) {
			if(y1 > y) {
				str.append('N');
			}else {
				str.append('S');
			}
		}
		
		if(x != x1) {
			if(x1 > x){
				str.append('E');
			}else {
				str.append('W');
			}
		}
				 
		System.out.println(str);
		
	}
}
