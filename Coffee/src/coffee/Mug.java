package coffee;

public class Mug {

	public static void main(String[] args) {

		Coffee coffee = new Coffee();

		if (coffee.mug == "Mug Empty") {
			coffee.fillMug(0);
			System.out.println("Mug Full !!!");
		}
		if (coffee.mug == "Mug Full of Coffee") {
			coffee.drinkCoffee();
			System.out.println("Mug Empty !!!");
		}
	}
}