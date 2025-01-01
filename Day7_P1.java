import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		while (sc.hasNextLine()) {
		    String[] ss = sc.nextLine().split(":* ");
		    long x = Long.parseLong(ss[0]);
		    ArrayList<Long> arr = new ArrayList<>();
		    arr.add(x);
		    for (int i = ss.length - 1; i >= 1; i--) {
		        long j = Long.parseLong(ss[i]);
		        int k = arr.size();
		        while (k > 0) {
		            long z = arr.remove(0);
		            if (i == 1 && z - j == 0) {
		                ans += x;
		                break;
		            } else if (z - j > 0) {
		                arr.add(z - j);
		            }
		            if (i == 1 && z == j) {
		                ans += x;
		                break;
		            } else if (z % j == 0) {
		                arr.add(z / j);
		            }
		            k--;
		        }
		    }
		}
		System.out.println(ans);
	}
}
