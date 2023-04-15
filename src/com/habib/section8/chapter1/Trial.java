package com.habib.section8.chapter1;

@SuppressWarnings("unused")
public class Trial {
	
	public static void main(String[] args) {

//		part 1:
//		--------
		var a = 20;
		var b = 20.5F;		
		var c = 20.5;
		var d = false;
//		var e; // Not possible without the initialization
		
		
//		part 2:
//      --------
		int var = 56; // This is valid
	    var m = -var;  // Also Valid    
	    
	    
//	    part 3:
//	    --------
	    var x = new int[]{10, 20, 30};
//	    var y = {10, 20, 30}; // Does not work
	    
	    
	    
//	    part 4:
//	    --------
	    Movie movie = new Movie("Habib");
	    var obj = movie;	// obj is of type Movie because reference is of type Movie 
//	    obj.watchAdventure(); // Not possible
	    
	    movie = new Adventure("Habib");
	    var obj1 = movie;// obj1 is of type Movie because reference is of type Movie, irrespective of the object type.
//	    obj1.watchAdventure(); // Not possible
	}
}