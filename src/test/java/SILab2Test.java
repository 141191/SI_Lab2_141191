
import org.junit.Test;

import static org.junit.Assert.*;

public class SILab2Test {
    @Test
    public void test1() {
        SILab2 siLab2 = new SILab2();
        assertFalse(siLab2.checkPrime(5));
        assertTrue(siLab2.checkPrime(6));
    }
}
