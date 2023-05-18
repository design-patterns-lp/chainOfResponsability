package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProblemaTest {

    GerenciaSuporteTI gerenciaSuporteTI;
    SuporteTINivel3 suporteNivel3;
    SuporteTINivel2 suporteNivel2;
    SuporteTINivel1 suporteNivel1;

    @BeforeEach
    void setUp(){
        gerenciaSuporteTI = new GerenciaSuporteTI(null);
        suporteNivel3 = new SuporteTINivel3(gerenciaSuporteTI);
        suporteNivel2 = new SuporteTINivel2(suporteNivel3);
        suporteNivel1 = new SuporteTINivel1(suporteNivel2);
    }

    @Test
    void deveRetornarSuporteNivel1ParaResolverProblemaConectarWifi(){
        assertEquals("Suporte nível 1", suporteNivel1.resolverChamado(new Problema(TipoProblemaConectarWiFi.getTipoProblemaConectarWiFi())));
    }

    @Test
    void deveRetornarSuporteNivel2ParaResolverProblemaLoginSistemaEmpresa(){
        assertEquals("Suporte nível 2", suporteNivel1.resolverChamado(new Problema(TipoProblemaLoginSistemaEmpresa.getTipoProblemaLoginSistemaEmpresa())));
    }

    @Test
    void deveRetornarSuporteNivel3ParaResolverProblemaConfiguracaoFirewall(){
        assertEquals("Suporte nível 3", suporteNivel1.resolverChamado(new Problema(TipoProblemaConfiguracaoFirewall.getTipoProblemaConfiguracaoFirewall())));
    }

    @Test
    void deveRetornarGerenciaSuporteTIParaResolverProblemaVazamentoDadosCorporativos(){
        assertEquals("Gerência do suporte", suporteNivel1.resolverChamado(new Problema(TipoProblemaVazamentoDadosCorporativos.getTipoProblemaVazamentoDadosCorporativos())));
    }

    @Test
    void deveRetornarProblemaNaoPertenceSuporteParaSalarioNaoApareceSistemaEmpresa(){
        assertEquals("Este problema não diz respeito ao suporte", suporteNivel1.resolverChamado(new Problema(TipoProblemaSalarioNaoApareceSistemaEmpresa.getTipoProblemaSalarioNaoApareceSistemaEmpresa())));
    }
}
