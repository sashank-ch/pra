package collections;

public class Student {
int sid,smarks;
String sname;
Student(int sid,String sname,int smarks){
	this.sid=sid;
	this.sname=sname;
	this.smarks=smarks;
}

public String toString() {
	return (sid+" "+sname+" "+smarks);
}

}
