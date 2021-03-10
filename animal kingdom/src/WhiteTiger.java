import java.awt.Color;

public class WhiteTiger extends Animal {
	private boolean hasInfected = false;

	public WhiteTiger() {
	}

	@Override
	public Action getMove(CritterInfo info) {
		if (info.frontThreat()) {
			this.hasInfected = true;
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
			return Action.LEFT;
		} else if (info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		} else
			return Action.HOP;
	}

	@Override
	public Color getColor() {
		return Color.WHITE;
	}

	@Override
	public String toString() {
		if (this.hasInfected) {
			return "TGR";
		} else
			return "tgr";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
