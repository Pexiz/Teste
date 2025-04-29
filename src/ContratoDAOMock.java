public class ContratoDAOMock implements IContratoDao {
    @Override
    public String salvar() {
        return "Sucesso";
    }
    
    @Override
    public String buscar() {
        return "Buscando...";
    }
    
    @Override
    public String excluir() {
        return "Excluindo...";
    }
    
    @Override
    public void atualizar() {
        System.out.println("Atualizando...");
    }

}
