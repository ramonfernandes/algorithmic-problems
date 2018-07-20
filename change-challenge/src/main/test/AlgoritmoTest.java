import com.ramonfernandes.Algoritmo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgoritmoTest {

    private Algoritmo algoritmo;

    @Before
    public void setup(){
        algoritmo = new Algoritmo();
    }

    @Test
    public void testSizeToValueThreeWithNotesOneAndTwo(){
        algoritmo.setNotasDisponiveis(new int[]{1, 2});
        Assert.assertEquals(2, algoritmo.getNumeroDeCombinacoesPossiveis(3));
    }
}
