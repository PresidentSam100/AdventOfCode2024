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
		int r = -1;
		int c = -1;
		while (sc.hasNextLine()) {
		    String s = sc.nextLine();
		    if (C == 0) {
		        C = s.length();
		    }
		    if (s.contains("^")) {
		        r = R;
		        c = s.indexOf("^");
		    }
		    arr.add(s);
		    R++;
		}
		int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
		int i = 0;
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
		ans = (long)v.size();
		System.out.println(ans);
	}
}
