package npc;
import world.World;

public abstract class Entity {
	int id;
	float x;
	float y;
	float z;
	public boolean isAlive;
	static int numOfEnitities = 0;
	
	
	
	
	public boolean Simulate(World wld){
		//This is overridden by subclasses
		return false;
	}
	
	@Override
	public String toString(){
		String string = "Entity " + id + " located at " + x + " X, " + y + " Y, " + z + " Z.";
		return string;
	}
	

}
