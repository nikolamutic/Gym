public class Meals {
    private int mealsOnDay;
    private String breakfast;
    private String brunch;
    private String elevenses;
    private String lunch;
    private String supper;
    private String dinner;
    private String day;

    public Meals(int mealsOnDay, String breakfast, String brunch, String elevenses, String lunch, String supper, String dinner,String day) {
        this.mealsOnDay = mealsOnDay;
        this.breakfast = breakfast;
        this.brunch = brunch;
        this.elevenses = elevenses;
        this.lunch = lunch;
        this.supper = supper;
        this.dinner = dinner;
        this.day=day;
    }

    public int getMealsOnDay() {
        return mealsOnDay;
    }

    public void setMealsOnDay(int mealsOnDay) {
        this.mealsOnDay = mealsOnDay;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getBrunch() {
        return brunch;
    }

    public void setBrunch(String brunch) {
        this.brunch = brunch;
    }

    public String getElevenses() {
        return elevenses;
    }

    public void setElevenses(String elevenses) {
        this.elevenses = elevenses;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Breakfast: "+"["+breakfast+"]"+"\n"+"Brunch: "+"["+brunch+"]"+"\n"+"Elevenses: "+"["+elevenses+"]"+"\n"+"Lunch: "+"["+lunch+"]"+"\n"+"Supper: "+"["+supper+"]"+"\n"+"Dinner: "+"["+dinner+"]";
    }
}
