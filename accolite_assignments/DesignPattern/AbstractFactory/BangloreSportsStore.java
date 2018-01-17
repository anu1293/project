package AbstractFactory;

public class BangloreSportsStore extends SportsStore {

	@Override
	public Brands getAvailableBrands(String category) {
		// TODO Auto-generated method stub
		Brands brands=null;
		if(category.equalsIgnoreCase("shoes"))
			brands=new BSS_ShoesBrands();
		else if(category.equalsIgnoreCase("shirts"))
			brands=new BSS_shirtsBrands();
		else if(category.equalsIgnoreCase("football"))
			brands=new BSS_footballBrands();
		return brands;
	}
	

}
