package chainofresponsability;

public class SuporteTINivel2 extends Suporte {

    public SuporteTINivel2(Suporte suporteSuperior) {
        listaTickets.add(TipoProblemaLoginSistemaEmpresa.getTipoProblemaLoginSistemaEmpresa());
        setSuporteNivelSuperior(suporteSuperior);
    }
    
    public String getNivelSuporte() {
        return "Suporte nível 2";
    }

}
