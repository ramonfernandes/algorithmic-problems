import java.util.Stack;

public class Game {

	public Stack<Queen> disposicaoValida(int x, int y, int contador, Stack<Queen> queens) {
		if (contador == 0)
			return queens;
		for (int xR = 0; xR < x; xR++) {
			for (int yR = 0; yR < y; yR++) {
				Stack<Queen> queenCopia = queens;
				while (!queenCopia.isEmpty()) {
					Queen queen = queenCopia.pop();
					if(queen.equalsXorY(xR, yR) || isDiagonal(queen.getX(), queen.getY(), xR, yR)) {
						queenCopia.push(queen);
						break;
					}
				}
				if(queenCopia.isEmpty())
					disposicaoValida(xR, yR, contador-1, addQueenIntoList(queens, new Queen(xR, yR)));
			}
		}
		return null;
	}

	public boolean isDiagonal(int x, int y, int xR, int yR){
		if(Math.abs(x - xR) == Math.abs(y - yR))
			return true;
		return false;
	}

	public Stack<Queen> addQueenIntoList(Stack<Queen> stack, Queen queen){
		stack.add(queen);
		return stack;
	}

}
