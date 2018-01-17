package AbstractFactory;

public abstract class SportsStore {

	public Brands orderProduct(String category)
	{
		Brands brand=getAvailableBrands(category);
		return brand;
	}
	public abstract Brands getAvailableBrands(String category);
}
