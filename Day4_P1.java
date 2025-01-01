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
	    for (int r = 0; r < R; r++) {
	        for (int c = 0; c < C - 3; c++) {
	            StringBuilder sb = new StringBuilder();
	            sb.append(grid.get(r).charAt(c));
	            sb.append(grid.get(r).charAt(c + 1));
	            sb.append(grid.get(r).charAt(c + 2));
	            sb.append(grid.get(r).charAt(c + 3));
	            if (sb.toString().equals("XMAS") || sb.reverse().toString().equals("XMAS")) {
	                ans++;
	            }
	        }
	    }
	    for (int r = 0; r < R - 3; r++) {
	        for (int c = 0; c < C; c++) {
	            StringBuilder sb = new StringBuilder();
	            sb.append(grid.get(r).charAt(c));
	            sb.append(grid.get(r + 1).charAt(c));
	            sb.append(grid.get(r + 2).charAt(c));
	            sb.append(grid.get(r + 3).charAt(c));
	            if (sb.toString().equals("XMAS") || sb.reverse().toString().equals("XMAS")) {
	                ans++;
	            }
	        }
	    }
	    for (int r = 0; r < R - 3; r++) {
	        for (int c = 0; c < C - 3; c++) {
	            StringBuilder sb = new StringBuilder();
	            sb.append(grid.get(r).charAt(c));
	            sb.append(grid.get(r + 1).charAt(c + 1));
	            sb.append(grid.get(r + 2).charAt(c + 2));
	            sb.append(grid.get(r + 3).charAt(c + 3));
	            if (sb.toString().equals("XMAS") || sb.reverse().toString().equals("XMAS")) {
	                ans++;
	            }
	            sb = new StringBuilder();
	            sb.append(grid.get(r).charAt(c + 3));
	            sb.append(grid.get(r + 1).charAt(c + 2));
	            sb.append(grid.get(r + 2).charAt(c + 1));
	            sb.append(grid.get(r + 3).charAt(c));
	            if (sb.toString().equals("XMAS") || sb.reverse().toString().equals("XMAS")) {
	                ans++;
	            }
	        }
	    }
	    System.out.println(ans);
	}
}
