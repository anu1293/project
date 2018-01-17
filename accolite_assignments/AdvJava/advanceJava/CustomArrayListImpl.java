package advanceJava;

public class CustomArrayListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(23));
        arrayList.add(new Integer(14));
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        arrayList.add(new Integer(29));
        System.out.println("Element at Index 5:"+arrayList.get(5));
        System.out.println("List size: "+arrayList.size());
        System.out.println("Removing element at index 2: "+arrayList.remove(2));
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
	}

}
