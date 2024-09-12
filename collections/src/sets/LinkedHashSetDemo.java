package sets;
import java.util.*;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
	//set cannot be empty if empty it shows an error,it also contains unique elements like hash set,it allows multithreading,
	//It inherits HashSet class and implements Set interface.Java LinkedHashSet class provides all optional set operation and permits null elements.	

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("three");
		set.add("Four");
		set.add("Five");
		set.add(null);//allows null elements also
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}



	}

}
