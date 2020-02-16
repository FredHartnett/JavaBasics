package com.fred.polymorphism;

public class AnimalsWithSongBird {

	public static void main(String[] args) {
		
		Animal myAnimal = new SongBird();
		myAnimal.move(); //calls the move() method found in class Bird
		//myAnimal.sing(); //will not work because sing() is not defined for type Animal
		((SongBird) myAnimal).sing(); //casting works however
		
		Animal myAnimal2 = new SongBird();
		SongBird mySongBird = (SongBird) myAnimal2;
		mySongBird.sing();
		

	}

}
