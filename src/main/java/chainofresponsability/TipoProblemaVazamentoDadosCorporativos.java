package chainofresponsability;

public class TipoProblemaVazamentoDadosCorporativos implements TipoProblema {

    private static TipoProblemaVazamentoDadosCorporativos tipoProblemaVazamentoDadosCorporativos = new TipoProblemaVazamentoDadosCorporativos();

    private TipoProblemaVazamentoDadosCorporativos() {};
    
    public static TipoProblemaVazamentoDadosCorporativos getTipoProblemaVazamentoDadosCorporativos() {
        return tipoProblemaVazamentoDadosCorporativos;
    }

}
