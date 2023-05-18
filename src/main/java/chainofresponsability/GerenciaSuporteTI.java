package chainofresponsability;

public class GerenciaSuporteTI extends Suporte {

    public GerenciaSuporteTI(Suporte suporteSuperior) {
        listaTickets.add(TipoProblemaVazamentoDadosCorporativos.getTipoProblemaVazamentoDadosCorporativos());
        setSuporteNivelSuperior(suporteSuperior);
    }
    
    public String getNivelSuporte() {
        return "Gerência do suporte";
    }

}
