/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 6
 */

class AdultMealBuilder implements MealBuilder
{
	private Meal meal;
	
	public AdultMealBuilder()	// Constructor to instantiate concrete meal with empty data members
	{
		meal = new Meal();
	}
	
	public void buildDrink()	// Sets meal drink to adult's "Soda"
	{
		meal.setDrink("Soda");
	}
	
	public void buildMain()		// Sets meal main item to adult's "Burger"
	{
		meal.setMain("Burger");
	}
	
	public void buildDessert()	// Sets meal dessert to adult's "Cake"
	{
		meal.setDessert("Cake");	
	}
	
	public Meal getMeal()	// Returns adult's meal
	{
		return meal;
	}

}