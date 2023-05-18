package chainofresponsability;

public class TipoProblemaSalarioNaoApareceSistemaEmpresa implements TipoProblema {

    private static TipoProblemaSalarioNaoApareceSistemaEmpresa tipoProblemaSalarioNaoApareceSistemaEmpresa = new TipoProblemaSalarioNaoApareceSistemaEmpresa();

    private TipoProblemaSalarioNaoApareceSistemaEmpresa() {};
    
    public static TipoProblemaSalarioNaoApareceSistemaEmpresa getTipoProblemaSalarioNaoApareceSistemaEmpresa() {
        return tipoProblemaSalarioNaoApareceSistemaEmpresa;
    }

}
