package npc;
import java.util.Random;

public class NPC extends Entity {

	
	byte hunger;
	byte thirst;
	byte fear;
	byte rest;
	int direction;
	int id;
	
	public NPC() {
		// TODO Auto-generated constructor stub
		isAlive = true;
		id = numOfEnitities++;
	}
	
	public NPC(float startX, float startY, float startZ) {
		x = startX;
		y = startY;
		z = startZ;
		isAlive = true;
		id = numOfEnitities++;
		
	}
	
	@Override
	public String toString(){
		String string = "NPC " + id + " located at " + x + " X, " + y + " Y, " + z + " Z. %n";
		string = string + "Hunger " + hunger + ", Thirst " + thirst + ", Fear " + fear + ", Rest " + rest + " Direction " + direction + ", ";
		if (isAlive) {
			string = string + "and is alive.";
		}
		else {
			string = string + "and is not alive.";
		}
		return string;
	}
	
	public void Wander() { 
		Random rndGen = new Random();
		direction = rndGen.nextInt(9) + 1;
		
		switch (direction) {
		case 1:		x--;
					z--;
					break;
		case 2:		x--;
					break;
		case 3:		x--;
					z++;
					break;
		case 4:		z--;
					break;
		case 5:		break;
		case 6:		z++;
					break;
		case 7:		x++;
					z--;
					break;
		case 8:		x++;
					break;
		case 9:		x++;
					z++;
					break;
		}
	}
}

