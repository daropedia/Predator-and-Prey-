/**
 * 
 */
package npc;
import world.World;

/**
 * @author dbell
 *
 */
public class Wolf extends NPC {

	/**
	 * 
	 */
	
	public Wolf(float startX, float startY, float startZ) {
		x = startX;
		y = startY;
		z = startZ;
		id = numOfEnitities++;
		
	}
	
	@Override
	public String toString(){
		String string = "Wolf " + id + " located at " + x + " X, " + y + " Y, " + z + " Z. %n";
		string = string + "Hunger " + hunger + ", Thirst " + thirst + ", Fear " + fear + ", Rest " + rest + " Direction " + direction + ", ";
		if (isAlive) {
			string = string + "and is alive.%n";
		}
		else {
			string = string + "and is not alive.%n";
		}
		return string;
	}
	
	@Override
	public boolean Simulate(World wld) {
		if (isAlive = true){
			Wander();
			isAlive = false;
			return true;
		}
		return false;
	}
}
