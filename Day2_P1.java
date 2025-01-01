import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long ans = 0;
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
	        }
	    }
	    System.out.println(ans);
	}
}
