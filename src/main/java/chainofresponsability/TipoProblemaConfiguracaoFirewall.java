package chainofresponsability;

public class TipoProblemaConfiguracaoFirewall implements TipoProblema {

    private static TipoProblemaConfiguracaoFirewall tipoProblemaConfiguracaoFirewall = new TipoProblemaConfiguracaoFirewall();

    private TipoProblemaConfiguracaoFirewall() {};
    
    public static TipoProblemaConfiguracaoFirewall getTipoProblemaConfiguracaoFirewall() {
        return tipoProblemaConfiguracaoFirewall;
    }

}
