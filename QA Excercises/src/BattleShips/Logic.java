package BattleShips;

public class Logic {

	int coordinates[][];
	
	public void updatePos(int y, int x) {
		
	}
	
	public void placeBoat(int x, int y) {
		coordinates[x][y] = 1;
		
	}
	
	public void hit(int y, int x) {
		if(coordinates[x][y]==1) {
			coordinates[x][y] = 2;
		}
		else {
			coordinates[x][y]=3;
		}
	}
	

}
