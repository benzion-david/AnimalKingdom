import java.awt.Color;

public class Bear extends Animal {

	boolean polar;

	public Bear(boolean polar) {
		if (Math.random() > 0.5) {
			this.polar = true;
		} else
			this.polar = false;
	}

	// public Bear(boolean polar) {

	// }

	public Action getMove(CritterInfo info) {
		if (info.frontThreat() == true) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return Action.LEFT;
		}

	}

	public Color getColor() {
		if (polar == true) {
			return Color.white;
		} else {
			return Color.black;
		}

	}

	@Override
	public String toString() {
		if (CritterModel.simulationCount % 2 == 0) {
			return "/";
		} else {
			return "\\";
		}

	}

}
