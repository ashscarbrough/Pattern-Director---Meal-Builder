/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 6
 */

public class MealDirector
{
	
	public Meal createMeal(MealBuilder builder)
	{
		// Build items based on MealBuilder Type (Adult/Kid)
		builder.buildDrink();	
		builder.buildMain();
		builder.buildDessert();
		
		// returns builder meal with specified options
		return builder.getMeal();
	}
}