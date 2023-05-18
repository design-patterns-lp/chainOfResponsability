package chainofresponsability;

public class TipoProblemaLoginSistemaEmpresa implements TipoProblema {

    private static TipoProblemaLoginSistemaEmpresa tipoProblemaLoginSistemaEmpresa = new TipoProblemaLoginSistemaEmpresa();

    private TipoProblemaLoginSistemaEmpresa() {};
    
    public static TipoProblemaLoginSistemaEmpresa getTipoProblemaLoginSistemaEmpresa() {
        return tipoProblemaLoginSistemaEmpresa;
    }

}
