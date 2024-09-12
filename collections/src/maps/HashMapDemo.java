package maps;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"sunny");
		hm.put(2, null);
		hm.put(3, null);//the key must be unique and value can be same
		hm.put(4, "Arya");
		hm.remove(3);//it removes the 3 key and what ever the values is it will be removed
		hm.remove(1,"Arya");//it checks the key 1 and the value is arya only it will be removed
		hm.putIfAbsent(3, "nani");//it checks weather 3 key is present or not if it is not present it will inserts in the key 3
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
