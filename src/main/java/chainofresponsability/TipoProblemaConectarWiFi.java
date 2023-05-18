package chainofresponsability;

public class TipoProblemaConectarWiFi implements TipoProblema {

    private static TipoProblemaConectarWiFi tipoProblemaConectarWiFi = new TipoProblemaConectarWiFi();

    private TipoProblemaConectarWiFi() {};
    
    public static TipoProblemaConectarWiFi getTipoProblemaConectarWiFi() {
        return tipoProblemaConectarWiFi;
    }

}
