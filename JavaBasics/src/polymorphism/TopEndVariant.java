package polymorphism;

public class TopEndVariant extends Features implements CommercialUse{
		
		public void powerWindows() {
	       System.out.println("Power windows present");		
		}

		
		public void sunroof() {
	       System.out.println("Sonroof present");	

}


		@Override
		public void commercialUse() {
System.out.println("Extra registration fees = $2500");			
		}

}
