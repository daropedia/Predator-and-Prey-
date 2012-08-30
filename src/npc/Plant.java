package npc;
import java.util.Random;
import world.World;


public class Plant extends Entity {
	boolean hasSoil;
	boolean hasWater;
	boolean hasLight;
	
	byte maturity;
	
	
	public Plant(float startX, float startY, float startZ) {
		x = startX;
		y = startY;
		z = startZ;
		maturity = 0;
		isAlive = true;
		checkDependancies();
		id = numOfEnitities++;
		
	}
	
	private void checkDependancies(){
		hasSoil = true;
		hasWater = true;
		hasLight = true;
		
	}
	
	@Override
	public boolean Simulate(World wld) {
		if (isAlive = true) {
			
				
			if (maturity < 3) {
				maturity++;
			}
			else if (maturity >= 3 ) {
				this.spread(wld);
			}
			
			
			if (maturity > 6 ){
				isAlive = false;	
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		String string = "Plant " + id + " located at " + x + " X, " + y + " Y, " + z + " Z. %n";
		if (hasSoil) {
			string = string + "  Has soil, ";
		}
		else {
			string = string + "  Does not have soil, ";
		}
		if (hasWater) {
			string = string + "Has water, ";
		}
		else {
			string = string + "Does not have waterl, ";
		}
		if (hasLight) {
			string = string + "Has light, ";
		}
		else {
			string = string + "Does not have light, ";
		}
		string = string + "is age " + maturity + ", ";
		if (isAlive) {
			string = string + "and is alive.%n";
		}
		else {
			string = string + "and is not alive.%n";
		}
		return string;
	}
	
	public void spread(World wld){
		float newX, newY, newZ;
		newX = x;
		newY = y;
		newZ = z;
		Random rndGen = new Random();
		int direction = rndGen.nextInt(9) + 1;
		
		switch (direction) {
		case 1:		newX = x - 1;
					newZ = z - 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 2:		newX = x - 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 3:		newX = x - 1;
					newZ = z + 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 4:		newZ = z - 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 5:		break;
		case 6:		newZ = z + 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 7:		newX = x = 1;
					newZ = z - 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 8:		newX = x + 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;
		case 9:		newX = x + 1;
					newZ = z + 1;
					wld.EntityArray.add(new Plant(newX,newY,newZ));
					break;	
				
		
		}
		
	}

}
