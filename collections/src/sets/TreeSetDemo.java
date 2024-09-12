package sets;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Surya");
		ts.add("hello");
		ts.add("how");
		ts.add("are");
		try {
		ts.add(null);
		}
		catch(Exception e) {
			System.out.println("In tree set null values are not allowed");
		}
		finally {
			System.out.println("It is tree set");
		}
		for(String s:ts) {
			System.out.println(s);
		}
		System.out.println(ts.headSet("how"));
		System.out.println(ts.tailSet("hello"));
		try {
		System.out.println(ts.subSet("surya","how"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
