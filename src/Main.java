import Menu.Dessert;
import Menu.Drink;
import Menu.MainCourse;

public class Main {
	
	Dessert[] dessertMenu;
	MainCourse[] mainCourseMenu;
	Drink[] drink;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();

	}
	
	public Main() {
		
		
		
	}
	
	public void createMenus() {
		
		dessertMenu = new Dessert[4];
		dessertMenu[0] = new Dessert ("Tiramissu", 6 , false);
		dessertMenu[1] = new Dessert ("Gelato", 6 , false);
		dessertMenu[2] = new Dessert ("Sorbet", 6 , true);
		dessertMenu[3] = new Dessert ("Bread and Butter Pudding", 6 , false);
		
		mainCourseMenu = new MainCourse[4];
		mainCourseMenu[0] = new MainCourse("Pizza", 15);
		mainCourseMenu[1] = new MainCourse("Baked Potato", 10.50);
		mainCourseMenu[2] = new MainCourse("Noodles", 12.45);
		mainCourseMenu[3] = new MainCourse("Braised Salmon", 20);
		
		drink = new Drink[4];
		drink[0] = new Drink("sparkling wine", 25, true);
		drink[1] = new Drink("Red Wine", 25.50, true);
		drink[2] = new Drink("Guinness", 15, true);
		drink[3] = new Drink("soft drink", 25, false);
		
		
	}
	
	
	

}
