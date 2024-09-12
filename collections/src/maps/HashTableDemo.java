package maps;
import java.util.*;
public class HashTableDemo {
//hash table does not follows the insertion order it stores and prints in the form of hashing and it does not allows multithreading
	//and it allows unique elements only,The initial default capacity of Hashtable class is 11.
	//hashtable insert with the keys only
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(100,"amit");
		ht.put(200, "ravi");
		try {
		ht.put(null, null);
		}
		catch(Exception e) {
			System.out.println("null values are not allowed");
		}
		ht.put(101, "vijay");
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
