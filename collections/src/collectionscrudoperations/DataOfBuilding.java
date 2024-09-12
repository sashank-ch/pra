package collectionscrudoperations;

public class DataOfBuilding {
int bid;
String bname;
int brent;
DataOfBuilding(int bid,String bname,int brent){
	this.bid=bid;
	this.bname=bname;
	this.brent=brent;
}
public void setbid(int bid) {
	this.bid=bid;
}
public void setbname(String bname) {
	this.bname=bname;
}
public void setbrent(int brent) {
	this.brent=brent;
}
public int getbid() {
	return bid;
}
public String bname() {
	return bname;
}
public int getbrent() {
	return brent;
}
public String toString() {
	return(bid+" "+bname+" "+brent);
}
}
