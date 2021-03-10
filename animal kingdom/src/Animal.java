import java.awt.Color;

public class Animal extends Critter {

	public Action getMove(CritterInfo info) {
		return Action.INFECT;
	}

	public Color getColor() {
		return Color.GREEN;
	}

	public String toString() {
		return "F";
	}

}
