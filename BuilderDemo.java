
public class BuilderDemo
{
	public static void main(String[] args)
	{
		MealDirector director = new MealDirector();
		MealBuilder builder;
		Meal meal;
		
		boolean isKid = true;
		System.out.println("Test 1, building meal for kid:");

		if (isKid) builder = new KidsMealBuilder();
		else
		{
			builder = new AdultMealBuilder();
		} 
		
		meal = director.createMeal(builder);
		System.out.println("Drink: " + meal.showDrink());
		System.out.println("Main: " + meal.showMain());
		System.out.println("Dessert: " + meal.showDessert());
		
		isKid = false;
		System.out.println("\nTest 2, building meal for adult:");

		if (isKid) builder = new KidsMealBuilder();
		else
		{
			builder = new AdultMealBuilder();
		} 
		
		meal = director.createMeal(builder);
		System.out.println("Drink: " + meal.showDrink());
		System.out.println("Main: " + meal.showMain());
		System.out.println("Dessert: " + meal.showDessert());
	}
}