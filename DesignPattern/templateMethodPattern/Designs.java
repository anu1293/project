package templateMethodPattern;

public class Designs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("designing indian homes\n");
		IndianHomeDesigner indianDesigner=new IndianHomeDesigner();
		indianDesigner.designHome();
		System.out.println("designing japanese homes\n");
		JapaneseHomeDesign japaneseDesigner=new JapaneseHomeDesign();
		japaneseDesigner.designHome();
		
	}

}
