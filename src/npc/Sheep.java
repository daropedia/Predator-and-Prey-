package npc;
import world.World;

public class Sheep extends NPC {
	
	
	static final byte[] diet = {
		2,3,6,7
	};
	
	public Sheep(float startX, float startY, float startZ) {
		super(startX,startY,startZ);
		id = numOfEnitities++;
		
	}
	@Override
	public String toString(){
		String string = "Sheep " + id + " located at " + x + " X, " + y + " Y, " + z + " Z. %n";
		string = string + "Hunger " + hunger + ", Thirst " + thirst + ", Fear " + fear + ", Rest " + rest + " Direction " + direction + ", ";
		if (isAlive) {
			string = string + "and is alive. %n";
		}
		else {
			string = string + "and is not alive. %n";
		}
		return string;
	}
	
	@Override
	public boolean Simulate(World wld) {
		if (isAlive = true){
			Wander();
			return true;
		}
		return false;
	}
}
