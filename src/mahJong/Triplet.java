package mahJong;

public class Triplet extends Meld{

	public Triplet(Tile firstTile, Tile secondTile, Tile thirdTile) {
		super(firstTile, secondTile, thirdTile);
		meldType = 2;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Triplet";
	}
}
