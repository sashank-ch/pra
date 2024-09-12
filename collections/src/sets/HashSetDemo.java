package sets;
import java.util.*;
import collections.Emp;
public class HashSetDemo {

	public static void main(String[] args) {
		Emp e=new Emp(101,"surya",15000);
	HashSet<String>	hs=new HashSet<String>();
	hs.add("Hello");//hash set allows null values also and it allows multithreading
	hs.add("Surya");//values can be stored in the form of hashing
	hs.add("how");
	hs.add("are");
	hs.add("you");
	hs.add("you");//duplicate elements are not allowed in ths sets 
	HashSet<Emp> hs1=new HashSet<Emp>();
	hs1.add(e);
	System.out.println(e);
	Iterator<String> i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}


	}

}
