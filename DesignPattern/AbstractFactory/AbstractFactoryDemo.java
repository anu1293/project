package AbstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SportsStore sportsStore=new BangloreSportsStore();
		SportsStore sportsStore2=new MumbaiSportsStore();
		
		
		System.out.println(sportsStore.getAvailableBrands("shoes").getNames());
		System.out.println(sportsStore2.getAvailableBrands("shoes").getNames());
		
	}

}
