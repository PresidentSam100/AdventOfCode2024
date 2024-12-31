import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> a1 = new ArrayList<>();
	    ArrayList<Integer> a2 = new ArrayList<>();
	    while (sc.hasNextInt()) {
	        a1.add(sc.nextInt());
	        a2.add(sc.nextInt());
	    }
	    Collections.sort(a1);
	    Collections.sort(a2);
	    int ans = 0;
	    for (int i = 0; i < a1.size(); i++) {
	        ans += Math.abs(a1.get(i) - a2.get(i));
	    }
	    System.out.println(ans);
	}
}
