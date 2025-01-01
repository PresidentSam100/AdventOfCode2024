import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> a = new ArrayList<>();
	    HashMap<Integer, Integer> m = new HashMap<>();
	    while (sc.hasNextInt()) {
	        a.add(sc.nextInt());
	        int k = sc.nextInt();
	        if (m.containsKey(k)) {
	            m.put(k, m.get(k) + 1);
	        } else {
	            m.put(k, 1);
	        }
	    }
	    long ans = 0;
	    for (int i = 0; i < a.size(); i++) {
	        int k = a.get(i);
	        if (m.containsKey(k)) {
	            ans += k * m.get(k);
	        }
	    }
	    System.out.println(ans);
	}
}
