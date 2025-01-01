import java.util.regex.*;
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long ans = 0;
	    String pattern = "mul\\(\\d+,\\d+\\)";
	    while (sc.hasNextLine()) {
    	        String s = sc.nextLine();
    	        Pattern compiled = Pattern.compile(pattern);
    	        Matcher matcher = compiled.matcher(s);
    	        while (matcher.find()) {
    	            String mul = matcher.group();
    	            String[] ss = mul.substring(4, mul.length() - 1).split(",");
    	            ans += Long.parseLong(ss[0]) * Long.parseLong(ss[1]);
    	        }
	    }
	    System.out.println(ans);
	}
}
