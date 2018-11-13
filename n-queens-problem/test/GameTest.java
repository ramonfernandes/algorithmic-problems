import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private int[][] matrizTeste = new int[5][5];
    private Game game = new Game();

    @Before
    public void populaMatriz() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matrizTeste[i][j] = 0;
        matrizTeste[0][0] = 1;
        matrizTeste[1][1] = 1;
        matrizTeste[2][2] = 1;
        matrizTeste[3][3] = 1;
        matrizTeste[4][4] = 1;
        matrizTeste[4][0] = 1;
        matrizTeste[3][1] = 1;
        matrizTeste[1][3] = 1;
        matrizTeste[0][4] = 1;
    }

    @Test
    public void isDiagonalTest() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrizTeste[i][j] == 1)
                    assert (game.isDiagonal(2, 2, i, j));
                else
                    Assert.assertFalse(game.isDiagonal(2, 2, i, j));
            }
        }
    }
}
