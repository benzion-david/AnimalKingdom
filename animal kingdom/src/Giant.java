import java.awt.Color;

public class Giant extends Animal {
	public Giant() {

	}

	@Override
	public Action getMove(CritterInfo info) {

		if (info.frontThreat()) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else
			return Action.RIGHT;
	}

	@Override
	public Color getColor() {
		return Color.GRAY;
	}

	@Override
	public String toString() {
		String[] s = { "fee", "fie", "foe", "fum" };
		int cycle = CritterModel.simulationCount % (24); // 0 to 23
		int idx = cycle / 6; // 0 to 3
		return s[idx];
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
