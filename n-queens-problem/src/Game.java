import java.util.Stack;

public class Game {

	public Stack<Queen> disposicaoValida(int x, int y, int contador, Stack<Queen> queens) {
		if (contador == 0)
			return queens;
		Stack<Queen> queenCopia = queens;
		for (int xR = 0; xR < x; xR++) {
			for (int yR = 0; yR < y; yR++) {
				while (!queenCopia.isEmpty()) {
					Queen queen = queenCopia.pop();
					if(queen.equalsXorY(xR, yR)) {
						break;
					}
				}
			}
		}
		return null;
	}

}
