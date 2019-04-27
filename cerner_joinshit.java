import java.util.*;
import java.lang.*;
public class cerner_rev {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		str.append(String.join("",sc.nextLine().replace('\n',' ').split(" ")));
		System.out.println(str.reverse());
		
	}
}
