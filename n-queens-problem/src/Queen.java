
public class Queen {

	private int x;
	private int y;
	
	public Queen(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean compareTo(int x, int y) {
		if(x == this.x && y == this.y)
			return true;
		return false;
	}
	
	public boolean equalsXorY(int x, int y) {
		if(x == this.x || y == this.y)
			return true;
		return false;
	}
}
