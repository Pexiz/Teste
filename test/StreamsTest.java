import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StreamsTest {
@Test
    public void TesteStream() {
    Streams streams = new Streams();
    
    List<String> entrada = List.of("Maria,Feminino","Pedro,Masculino","Eduarda,Feminino");
    List<String> resultado = streams.filtrarMulheres(entrada);
    List<String> esperado = List.of("Maria","Eduarda");
    
    Assert.assertEquals(resultado,esperado);
    }

}
