package CoreJava;

public class CustomLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LHMapImpl impl=new LHMapImpl();
impl.add(2, 10);
impl.add(22,12);
impl.add(42,16);
System.out.println(impl.get(2));
impl.delete(2);
System.out.println(impl.get(2));
System.out.println(impl.get(22));
	}

}
