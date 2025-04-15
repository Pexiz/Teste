import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TesteClienteTest {
    
    String name ;
    @Test
    public void testeClasseCliente()
    {
        
        TesteCliente cli = new TesteCliente();
        cli.mudarNome("Pedro");
        Assert.assertEquals("Pedro", cli.getName());
        
    }
}
