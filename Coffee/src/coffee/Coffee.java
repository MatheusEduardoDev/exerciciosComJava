package coffee;

public class Coffee {
	
	private int m = 0;
	
	
	public String mug = "Mug Empty";
	
	public int fillMug (int fill) {
	
		
		if(fill == 350) {
			
			this.mug = "Mug Full of Coffee";
			return 0;
		}
		
		return fillMug(fill + 1);
	}
	
	public void drinkCoffee() {

		this.mug = "Mug Empty";
	}
		

}
