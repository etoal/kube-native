import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.docker.demo.model.Product; 
import static org.junit.Assert.fail;

class apiUnitTests {
 
    @Test
    void justAnExample() {
    	Product testProd = new Product((long)9999, "testWidget", 19.95);
        assertEquals(testProd.getProductId(), 9999);
        assertEquals(9, 4 + 5);
        fail("ET - making the test fail");
    }
}
