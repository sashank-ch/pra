package collections;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		Student s=new Student(1,"sai",50);
		Student s1=new Student(2,"balaji",70);
		Student s2=new Student(3,"surya",80);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
for(Student st:al) {
	System.out.println(st);
}
	}

}
