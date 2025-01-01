import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long ans = 0;
	    ArrayList<String> grid = new ArrayList<>();
	    while (sc.hasNextLine()) {
	        grid.add(sc.nextLine());
	    }
	    int R = grid.size();
	    int C = grid.get(0).length();
	    for (int r = 0; r < R - 2; r++) {
	        for (int c = 0; c < C - 2; c++) {
	            StringBuilder sb1 = new StringBuilder();
	            sb1.append(grid.get(r).charAt(c));
	            sb1.append(grid.get(r + 2).charAt(c + 2));
	            StringBuilder sb2 = new StringBuilder();
	            sb2.append(grid.get(r).charAt(c + 2));
	            sb2.append(grid.get(r + 2).charAt(c));
	            if ((sb1.toString().equals("MS") || sb1.reverse().toString().equals("MS"))
	             && (sb2.toString().equals("MS") || sb2.reverse().toString().equals("MS"))
	             && grid.get(r + 1).charAt(c + 1) == 'A') {
	                ans++;
	            }
	        }
	    }
	    System.out.println(ans);
	}
}
