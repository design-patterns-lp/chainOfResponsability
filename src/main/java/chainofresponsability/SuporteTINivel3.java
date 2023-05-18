package chainofresponsability;

public class SuporteTINivel3 extends Suporte {

    public SuporteTINivel3(Suporte suporteSuperior) {
        listaTickets.add(TipoProblemaConfiguracaoFirewall.getTipoProblemaConfiguracaoFirewall());
        setSuporteNivelSuperior(suporteSuperior);
    }
    
    public String getNivelSuporte() {
        return "Suporte nível 3";
    }

}
