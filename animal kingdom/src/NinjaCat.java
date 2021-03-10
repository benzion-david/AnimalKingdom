import java.awt.Color;

public class NinjaCat extends Animal {

	@Override
	public Action getMove(CritterInfo info) {
		Action[] a = Action.values(); // I know it is a redundant variable, give me a break friends!
		int idx = (int) (Math.random() * a.length);
		return Action.values()[idx];
	}

	@Override
	public Color getColor() {
		Color[] c = { Color.RED, Color.BLACK, Color.MAGENTA, Color.ORANGE, Color.GREEN, Color.BLUE, Color.PINK };
		// int idx = CritterModel.simulationCount % c.length;
		// round robin colors... (no randomness
		// ...so all NinjaCats came out the same colour...
		int idx = (int) (Math.random() * c.length); // random... more fun this way.
		return c[idx];
	}

	@Override
	public String toString() {
		// round robin string... (Study group: Bentzi, Moti, Doron, Bar, Sigal)
		String[] s = { "BAR", "MOTTI", "DORON", "BENTZI", "SIGAL" };
		// int idx = CritterModel.simulationCount % s.length; // round robin
		int idx = (int) (Math.random() * s.length); // random... more fun this way.
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
