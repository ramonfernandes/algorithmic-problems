import com.ramonfernandes.Algoritmo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgoritmoTest {

    private Algoritmo algoritmo;
    private long tempo;

    @Before
    public void setup(){
        algoritmo = new Algoritmo();
        tempo = System.currentTimeMillis();
    }

    @Test
    public void testSizeToValueThreeWithNotesOneAndTwo(){
        algoritmo.setNotasDisponiveis(new int[]{1, 2});
        Assert.assertEquals(2, algoritmo.getNumeroDeCombinacoesPossiveis(3));
    }

    @Test
    public void testSizeToValueThreeWithNotesOne(){
        algoritmo.setNotasDisponiveis(new int[]{1});
        Assert.assertEquals(1, algoritmo.getNumeroDeCombinacoesPossiveis(3));
    }

    @Test
    public void testSizeToValueFiftyWithNotesOneTenAndTwentyFive(){
        algoritmo.setNotasDisponiveis(new int[]{1, 10, 25});
        Assert.assertEquals(10, algoritmo.getNumeroDeCombinacoesPossiveis(50));
    }

    @Test
    public void testSizeToValueFiftyWithNotesOneTwoTenAndTwentyFive(){
        algoritmo.setNotasDisponiveis(new int[]{1, 2, 10, 25});
        Assert.assertEquals(106, algoritmo.getNumeroDeCombinacoesPossiveis(50));
    }

    @After
    public void relatorios(){
        algoritmo.printCaminhos();
        System.out.println("Tempo de execução em milissegundos: " + (System.currentTimeMillis() - tempo));
        System.out.println("Numero de Recusões: " + algoritmo.getnRecursoes());
        System.out.println("---");
    }

}
