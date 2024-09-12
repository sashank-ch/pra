package collectionscrudoperations;
import java.util.*;
public class CollectionsCrud {
	public static void main(String[] args) {
		ArrayList<DataOfBuilding> al=new ArrayList<DataOfBuilding>();
		Scanner sc=new Scanner(System.in);
		int ch;
		do 
		{
			System.out.println("1)create");
			System.out.println("2)retrive");
			System.out.println("3)update");
			System.out.println("4)delete");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("create a bid,bname,brent");
				int bid=sc.nextInt();
				String bname=sc.next();
				int brent=sc.nextInt();
				al.add(new DataOfBuilding(bid,bname,brent));//anonymous obj
				System.out.println("Building details added");
				break;
			case 2:
				System.out.println("retrive the details of building");
				Iterator<DataOfBuilding> it=al.iterator();
				while(it.hasNext()){
					DataOfBuilding db=it.next();
					System.out.println(db);
				}
				System.out.println("-------------------------");
				break;
			case 3:
				System.out.println("Update the value of building");
				int biid=sc.nextInt();
				boolean b=false;
				ListIterator<DataOfBuilding> ls= al.listIterator();
				while(ls.hasNext()) {
					DataOfBuilding db=ls.next();
					if(db.getbid()==biid) {
						b=true;
						System.out.println("enter new bname,brent");
						String biname=sc.next();
						int birent=sc.nextInt();
						ls.set(new DataOfBuilding(biid, biname,birent));
						System.out.println("records has benn updated");
					}
					if(b=false) {
						System.out.println("Invalid bid");
						break;
					}	
				}
			case 4:
				System.out.println("Enter the value to delete");
				int r=sc.nextInt();
				boolean b1=false;
				Iterator<DataOfBuilding> it2=al.iterator();
				while(it2.hasNext()) {
					DataOfBuilding db1=it2.next();
					if(db1.getbid()==r) {
						b1=true;
						al.remove(db1);
						System.out.println("Building details deleted");
						break;
					}
				}
				if(b1==false) {
					System.out.println("Bid not found");
				}
				default:
					System.out.println("Invalid chioce");
			}
		}while(ch!=0);
	}
}
