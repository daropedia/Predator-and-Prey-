package world;

import npc.Sheep;
import npc.Wolf;
import npc.Entity;
import npc.Plant;
import java.util.Random;
import java.util.ArrayList;



public class World {

	
	// private  byte maxEntity = 6;
	private byte i;
	// private int rndInt;
	// Random rndGen = new Random();
	
	public ArrayList<Entity> EntityArray = new ArrayList<Entity>();
	
	
	
	public World(){
		
		for (i=0; i<2; i++){
			EntityArray.add(new Sheep(0,0,0));
		}
		for (i=2; i<5; i++){
			EntityArray.add(new Wolf(0,0,0));
			
		}
		EntityArray.add(new Plant(0,0,0));
		
		
		
		
	}
	
	public boolean SimulateWorld(){
		for (Entity a : EntityArray){
			
			a.Simulate(this);
			System.out.format(a.toString());
			if (a.isAlive = false){
				EntityArray.remove(a);
			}
	
		}

		
		return true;
	}
}

