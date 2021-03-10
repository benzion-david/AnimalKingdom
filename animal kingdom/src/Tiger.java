import java.awt.Color;

public class Tiger extends Animal {

	public Tiger() {
	}

	@Override
	public Action getMove(CritterInfo info) {
		if (info.frontThreat()) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
			return Action.LEFT;
		} else if (info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		} else
			return Action.HOP;
	}

	Color color3;

	@Override
	public Color getColor() {
		Color[] c = { Color.RED, Color.GREEN, Color.BLUE };
		if (CritterModel.simulationCount % 3 == 0) {
			int i = (int) (Math.random() * c.length);
			this.color3 = c[i];
			return c[i];
		} else
			return this.color3;
	}

	@Override
	public String toString() {
		return "TGR";
	}

}
