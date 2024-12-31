import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int ans = 0;
	    while (sc.hasNextLine()) {
	        String[] ss = sc.nextLine().split(" ");
	        int[] s = new int[ss.length];
	        for (int i = 0; i < s.length; i++) {
	            s[i] = Integer.parseInt(ss[i]);
	        }
	        int negate = (s[0] < s[1]) ? -1 : 1;
	        boolean safe = true;
	        for (int i = 1; i < s.length; i++) {
	            int diff = (s[i - 1] - s[i]) * negate;
	            if (!(1 <= diff && diff <= 3)) {
	                safe = false;
	                break;
	            }
	        }
	        if (safe) {
	            ans++;
	        } else {
	            for (int k = 0; k < s.length; k++) {
	                ArrayList<Integer> x = new ArrayList<>();
	                for (int j = 0; j < s.length; j++) {
	                    if (k != j) {
	                        x.add(j);
	                    }
	                }
	                negate = (s[x.get(0)] < s[x.get(1)]) ? -1 : 1;
        	        safe = true;
        	        for (int i = 1; i < x.size(); i++) {
        	            int diff = (s[x.get(i - 1)] - s[x.get(i)]) * negate;
        	            if (!(1 <= diff && diff <= 3)) {
        	                safe = false;
        	                break;
	                    }
	                }
	                if (safe) {
	                    ans++;
	                    break;
	                }
	            }
	        }
	    }
	    System.out.println(ans);
	}
}
