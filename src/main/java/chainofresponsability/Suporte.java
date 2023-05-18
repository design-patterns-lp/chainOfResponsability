package chainofresponsability;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList listaTickets = new ArrayList();
    private Suporte suporteNivelSuperior;

    public Suporte getSuporteNivelSuperior() {
        return suporteNivelSuperior;
    }

    public void setSuporteNivelSuperior(Suporte suporteNivelSuperior) {
        this.suporteNivelSuperior = suporteNivelSuperior;
    }
    
    public abstract String getNivelSuporte();
    
    public String resolverChamado(Problema problema) {
        if (listaTickets.contains(problema.getTipoProblema())) {
            return getNivelSuporte();
        }
        else {
            if (suporteNivelSuperior != null) {
                return suporteNivelSuperior.resolverChamado(problema);
            }
            else 
            {
                return "Este problema não diz respeito ao suporte";
            }
        }        
    }
}
