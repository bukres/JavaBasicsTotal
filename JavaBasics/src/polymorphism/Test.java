package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		Features basicModel = new BasicVariant();
		Features middleModel = new MiddleVariant();
		Features topModel = new TopEndVariant();
		
		/*basicModel.airbags();
		basicModel.powerWindows();
		basicModel.sunroof();
		System.out.println();*/
		
		middleModel.airbags();
		middleModel.powerWindows();
		middleModel.sunroof();
		
		CommercialUse middleVariant = new MiddleVariant();
		middleVariant.commercialUse();
		
		/*System.out.println();
		topModel.airbags();
		topModel.powerWindows();
		topModel.sunroof();*/
		
		
	}

}
