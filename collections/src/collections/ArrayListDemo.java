package collections;
import java.util.*;
//collection is a framework that provides an architecture to store and maniplate the group of objects
public class ArrayListDemo {//dynamic size array is fixed size

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//<string> it is generic type it can be any datatype
		al.add("Surya");
		al.add("nani");
		al.add("guna bhai");
		al.add("surya");
		al.add(null);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("mango");
		al2.add("apple");
		al2.add("grapes");
		al.addAll(al2);
		//al.remove("guna bhai");
		//		al.removeAll(al2);
		//		al.containsAll(al2);
		//al.clear();
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println(al.size());
	}

}
