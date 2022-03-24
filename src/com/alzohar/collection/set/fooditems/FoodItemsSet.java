package com.alzohar.collection.set.fooditems;

import java.util.HashSet;
import java.util.Set;

public class FoodItemsSet {

	public static void main(String[] args) {

		Food food1 = new Food(101, "Chicken Chilli", 180.44, "Hot Gravy");
		Food food2 = new Food(102, "Chicken Lolipop", 280.44, "Crispy");
		Food food3 = new Food(103, "Junglee Paneer", 150.44, "Gravy");
		Food food4 = new Food(104, "Kofta", 380.44, "Gravy");

		Set<Food> foodList = new HashSet<Food>();

		foodList.add(food3);
		foodList.add(food4);
		foodList.add(food1);
		foodList.add(food2);

		for (Food food : foodList) {
			System.out.println(food.id);
			System.out.println(food.name);
			System.out.println(food.price);
			System.out.println(food.desc);
			System.out.println("-------------");
		}

	}

}
