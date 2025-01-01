import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		ArrayList<String> arr = new ArrayList<>();
		while (sc.hasNextLine()) {
		    String s = sc.nextLine();
		    if (s.trim().isEmpty()) {
		        break;
		    }
		    arr.add(s);
		}
		while (sc.hasNextLine()) {
		    String[] s = sc.nextLine().split(",");
		    boolean work = true;
		    for (int i = 0; i < s.length - 1; i++) {
		        for (int j = i + 1; j < s.length; j++) {
		            if (arr.contains(s[j] + "|" + s[i])) {
		                work = false;
		                break;
		            }
		        }
		        if (!work) {
		            break;
		        }
		    }
		    if (!work) {
		        Arrays.sort(s, new Comparator<String>() {
		            @Override
		            public int compare(String s1, String s2) {
		                if (arr.contains(s1 + "|" + s2)) {
		                    return -1;
		                } else if (arr.contains(s2 + "|" + s1)) {
		                    return 1;
		                } else {
		                    return 0;
		                }
		            }
		        });
		        ans += Long.parseLong(s[s.length / 2]);
		    }
		}
		System.out.println(ans);
	}
}
