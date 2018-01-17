package AbstractFactory;

public class MumbaiSportsStore extends SportsStore {
	@Override
	public Brands getAvailableBrands(String category) {
		// TODO Auto-generated method stub
		Brands brands=null;
		if(category.equalsIgnoreCase("shoes"))
			brands=new Mumbai_ShoesBrands();
		else if(category.equalsIgnoreCase("shirts"))
			brands=new Mumbai_shirtsBrands();
		else if(category.equalsIgnoreCase("football"))
			brands=new Mumbai_footballBrands();
		return brands;
	}
	
}
