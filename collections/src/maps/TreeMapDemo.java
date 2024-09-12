package maps;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, null);
		map.put(2, "Sasi");
		map.put(3, "harsha");
		map.put(4,"sai");
		System.out.println("headSet is:"+" "+map.headMap(4,false));
		System.out.println("headSet is:"+" "+map.tailMap(1,true));
		System.out.println("headSet is:"+" "+map.subMap(1,false,4,true));
      
	}

}
