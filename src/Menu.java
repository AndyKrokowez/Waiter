import java.util.Scanner;

import Menu.Dessert;
import Menu.Drink;
import Menu.MainCourse;
import Menu.MenuItem;

public class Menu {
	

	Dessert[] dessertMenu;
	MainCourse[] mainCourseMenu;
	Drink[] drinkMenu;
	Scanner sc = new Scanner(System.in);
	
	
	public Menu() {
		
		createMenus();
		
		askingWaiter();
		
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
		
		drinkMenu = new Drink[4];
		drinkMenu[0] = new Drink("sparkling wine", 25, true);
		drinkMenu[1] = new Drink("Red Wine", 25.50, true);
		drinkMenu[2] = new Drink("Guinness", 15, true);
		drinkMenu[3] = new Drink("soft drink", 25, false);
		
		
	}

	public void displayMenu(MenuItem[] menu) {
		
		for(int i = 0; i < menu.length; i++) {
			
			System.out.println(menu[i]);
			
		}
		
	}
	
	public void askingWaiter() {
		
		System.out.println("What do you need? 1- MC  2- Dessert  3- Drinks");
		int choice = sc.nextInt();
		
		if (choice == 1){
			displayMenu(mainCourseMenu);
		} 
		
		else if (choice == 2){
			displayMenu(dessertMenu);
			
		}
		
		else if (choice == 3){
			displayMenu(drinkMenu);
			
		} else {
			
			System.out.println("Not valid option");
		}
		
	}
	
}
