package chainofresponsability;

public class SuporteTINivel1 extends Suporte {
    
    public SuporteTINivel1(Suporte suporteSuperior) {
        listaTickets.add(TipoProblemaConectarWiFi.getTipoProblemaConectarWiFi());
        setSuporteNivelSuperior(suporteSuperior);
    }
    
    public String getNivelSuporte() {
        return "Suporte nível 1";
    }

}
