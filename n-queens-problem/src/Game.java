import java.util.ArrayList;
import java.util.Stack;

public class Game {

	private ArrayList<Stack<Queen>> stacks = new ArrayList<>();

	public Stack<Queen> disposicaoValida(int x, int y, int contador, Stack<Queen> queens, int xRi, int yRi) {
		if (queens.size() == contador) {
			Stack<Queen> queenResult = new Stack<>();
			queens.forEach(queen -> queenResult.push(queen));
			stacks.add(queenResult);
			return null;
		}
		for (int xR = xRi; xR < x; xR++) {
			for (int yR = yRi; yR < y; yR++) {
				Stack<Queen> queenCopia = new Stack<>();
				queens.forEach(queen -> queenCopia.push(queen));
				while (!queenCopia.isEmpty()) {
					Queen queen = queenCopia.pop();
					if(queen.equalsXorY(xR, yR) || isDiagonal(queen.getX(), queen.getY(), xR, yR)) {
						queenCopia.push(queen);
						break;
					}
				}
				if(queenCopia.isEmpty()){
					Stack<Queen> queenResult =
							disposicaoValida(x, y, contador, addQueenIntoList(queens, new Queen(xR, yR)), xR, yR);
					if(queenResult != null)
						return queenResult;
					else
						queens.pop();
				}
			}
			yRi = 0;
		}
		return null;
	}

	public boolean isDiagonal(int x, int y, int xR, int yR){
		if(Math.abs(x - xR) == Math.abs(y - yR))
			return true;
		return false;
	}

	public Stack<Queen> addQueenIntoList(Stack<Queen> stack, Queen queen){
		stack.push(queen);
		return stack;
	}

	public ArrayList<Stack<Queen>> getStacks() {
		return stacks;
	}
}
