package maps;
import java.util.*;
import collections.Emp;
public class LinkedHashMapDemo {
//linked hash map follows insertion order
	public static void main(String[] args) {
		Emp e=new Emp(101,"Sruya",15000);
		Emp e1=new Emp(102,"Sunny",13000);
		Emp e2=new Emp(103,"Arjun",14000);
		LinkedHashMap<Integer,Emp> lm=new LinkedHashMap<Integer,Emp>();
		lm.put(null, e);
		lm.put(2, e2);
		lm.put(3, e);
		try {
			lm.put(null, e1);
		}
        catch(Exception s) {
        	System.out.println("It allows only one null key value");
        	System.out.println(s);
        }
		for(Map.Entry m:lm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
