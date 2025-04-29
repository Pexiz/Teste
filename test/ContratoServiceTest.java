import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDAOMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
        
    }
    
    @Test
    public void buscarTest() {
        // Mockando a interface
        IContratoDao dao = new ContratoDAOMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        service.buscar();
        Assert.assertEquals("Buscando...",retorno);
    
        
    }
    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDAOMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        service.excluir();
        Assert.assertEquals("Excluindo...", retorno);
    }
    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDAOMock();
        ContratoService service = new ContratoService(dao);
        service.atualizar(); // nesse caso por ser Void so olharia o console ja que nao estou utilziando mockito nem nada
        
        Assert.assertTrue(true);
    }
    
}
    