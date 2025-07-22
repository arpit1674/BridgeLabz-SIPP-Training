package week04_day1_SubmissionOfJavaGenerics;

interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    Meal(T mealType) {
        this.setMealType(mealType);
    }

    public String generatePlan() {
        return "Your personalized meal plan: " + getMealType().getType();
    }

	public T getMealType() {
		return mealType;
	}

	public void setMealType(T mealType) {
		this.mealType = mealType;
	}
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void validateAndGenerate(T meal) {
        System.out.println("Valid meal type: " + meal.getType());
    }

    public static void main(String[] args) {
        Meal<VeganMeal> meal = new Meal<>(new VeganMeal());
        validateAndGenerate(meal.getMealType());
        System.out.println(meal.generatePlan());
    }
}
