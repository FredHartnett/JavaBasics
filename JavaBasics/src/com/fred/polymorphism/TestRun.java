package com.fred.polymorphism;

public class TestRun {

	public static void main(String[] args) {
		
		Animal myAnimal1 = new Bird();
		Animal myAnimal2 = new Fish();
		Animal myAnimal3 = new Bird();
		
		//the myAnimal1 variable is reference type Animal with a Fish object put into it
		
		//these work because the super class and the subclasses have a move() method
		myAnimal1.move(); //invokes the Bird way of moving
		myAnimal2.move(); //invokes the Fish way of moving
		
		//now if class Fish had a method called stuff(), and I tried to run myAnimal2.stuff(), it would not work
		//because myAnimal2 is reference type Animal (which cannot see the stuff() method in Fish).
		//Which move() method gets called depends on the instance being referenced (in this case a Fish) not the type of the variable
		//in this case an Animal.
		//HOWEVER! - only Animal methods can be called - not any methods that may be specific to the individual subclasses
		//like a stuff() method in sub class Fish.
		
		Animal[] animals = { new Bird(), new Fish(), new Bird()	};		
		//Animal[] animals = { myAnimal1, myAnimal2, myAnimal3};
		
		for(Animal a : animals) {
			a.move();
		}
		
		//Animal a2 = new Fish();
		//Bird myBird = (Bird) a2; //doesn't work because a2 is a Fish object
	}
}
