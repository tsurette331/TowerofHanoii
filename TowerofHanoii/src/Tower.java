
public class Tower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveDisks(3, "start", "hold", "final");
	}

	public static void moveDisks(int disk, String mainPeg, String holdingPeg, String finalPeg) {
		if (disk == 1 ) {
			System.out.println("Move from " + mainPeg + " to " + finalPeg);
		} else {
			moveDisks(disk-1, mainPeg, finalPeg, holdingPeg);
			System.out.println("Move from " +  mainPeg + " to " + finalPeg);
			moveDisks(disk-1, holdingPeg, mainPeg, finalPeg);
		}
	}

	
}
