/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 6
 */

class KidsMealBuilder implements MealBuilder
{
	private Meal meal;
	
	public KidsMealBuilder ()	// Constructor to instantiate concrete meal with empty data members
	{
		meal = new Meal();
	}
	
	public void buildDrink()	// Sets meal drink to kid's "Juice"
	{
		meal.setDrink("Juice");
	}
	
	public void buildMain()		// Sets meal main item to kid's "Hot Dog"
	{
		meal.setMain("Hot Dog");
	}
	
	public void buildDessert()	// Sets meal dessert to kid's "Ice Cream"
	{
		meal.setDessert("Ice Cream");
	}
	
	public Meal getMeal()	// Returns kid's meal
	{
		return meal;
	}

}