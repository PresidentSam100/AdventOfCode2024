import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		ArrayList<String> arr = new ArrayList<>();
		int R = 0;
		int C = 0;
		int startR = -1;
		int startC = -1;
		while (sc.hasNextLine()) {
		    String s = sc.nextLine();
		    if (C == 0) {
		        C = s.length();
		    }
		    if (s.contains("^")) {
		        startR = R;
		        startC = s.indexOf("^");
		    }
		    arr.add(s);
		    R++;
		}
		int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
		int i = 0;
		int r = startR;
		int c = startC;
		HashSet<String> v = new HashSet<>();
		while (r >= 0 && c >= 0 && r < R && c < C) {
		    v.add(r+","+c);
		    r += d[i][0];
		    c += d[i][1];
		    if (r < 0 || c < 0 || r >= R || c >= C) {
		        break;
		    }
		    if (arr.get(r).charAt(c) == '#') {
		        r -= d[i][0];
		        c -= d[i][1];
		        i = (i + 1) % 4;
		    }
		}
		for (String x : v) {
		    String[] rc = x.split(",");
		    int n = Integer.parseInt(rc[0]);
		    int m = Integer.parseInt(rc[1]);
		    arr.set(n, arr.get(n).substring(0, m) + "#" + arr.get(n).substring(m + 1));
		    i = 0;
		    r = startR;
		    c = startC;
		    HashSet<String> b = new HashSet<>();
		    while (r >= 0 && c >= 0 && r < R && c < C) {
		        b.add(r+","+c+","+i);
		        r += d[i][0];
		        c += d[i][1];
		        if (r < 0 || c < 0 || r >= R || c >= C) {
		            break;
		        }
		        if (arr.get(r).charAt(c) == '#') {
		            r -= d[i][0];
		            c -= d[i][1];
		            i = (i + 1) % 4;
		        } else if (b.contains(r+","+c+","+i)) {
		            ans++;
		            break;
		        }
		    }
		    arr.set(n, arr.get(n).substring(0, m) + "." + arr.get(n).substring(m + 1));
		}
		System.out.println(ans);
	}
}
