public class ContratoService implements IContratoDao {
    
    
    private final IContratoDao contratoDao;
    
    
    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }
    
    
    @Override
    public String salvar() {
        return contratoDao.salvar();
    }

    
    public String buscar() {
        contratoDao.buscar();
        return null;
    }

    
    public String excluir() {
        contratoDao.excluir();
        return null;
    }

    
    public void atualizar() {
        contratoDao.atualizar();
    }

}
