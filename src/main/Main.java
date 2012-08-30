package main;


import world.World;

public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		World wld1 = new World();
		int count = 0;
		
		do {
			wld1.SimulateWorld();
			count++;
		} while (count < 10);
		
		
		
			
	}

	

}
