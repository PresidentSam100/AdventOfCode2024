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
		    HashSet<Long> ol = new HashSet<>();
		    ol.add(Long.parseLong(ss[1]));
		    boolean work = false;
		    for (int i = 2; i < ss.length; i++) {
		        long j = Long.parseLong(ss[i]);
		        HashSet<Long> op = new HashSet<>();
		        for (long z : ol) {
		            if (i == ss.length - 1 && z + j == x) {
		                work = true;
		                break;
		            } else if (z + j <= x) {
		                op.add(z + j);
		            }
		            if (i == ss.length - 1 && z * j == x) {
		                work = true;
		                break;
		            } else if (z * j <= x) {
		                op.add(z * j);
		            }
		            if (i == ss.length - 1 && Long.parseLong("" + z + j) == x) {
		                work = true;
		                break;
		            } else if (Long.parseLong("" + z + j) <= x) {
		                op.add(Long.parseLong("" + z + j));
		            }
		        }
		        if (work) {
		            ans += x;
		            break;
		        }
		        ol = op;
		    }
		}
		System.out.println(ans);
	}
}
