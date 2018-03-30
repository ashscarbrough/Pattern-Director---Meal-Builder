class Meal
{
	String Drink;
	String Main;
	String Dessert;
	
	void setDrink(String drink)
	{
		this.Drink = drink;
	}
	
	void setMain(String main)
	{
		this.Main = main;
	}
	
	void setDessert(String dessert)
	{
		this.Dessert = dessert;
	}
	
	String showDrink()
	{
		return Drink;
	}
	
	String showMain()
	{
		return Main;
	}
	
	String showDessert()
	{
		return Dessert;
	}
}