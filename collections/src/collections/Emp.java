package collections;
import java.util.*;
public class Emp {
public int empid;
 public String ename;
 public double sal;
 public Emp(int empid,String ename,double sal){
	this.empid=empid;
	this.ename=ename;
	this.sal=sal;
}
public String toString() {
	return(empid+" "+ename+" "+sal);
}
}
