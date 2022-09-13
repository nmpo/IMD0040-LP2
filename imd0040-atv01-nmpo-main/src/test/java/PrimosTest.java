import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @Test
    void primosZero() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Primos.main(new String[]{"0"});
        assertEquals("", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    void primosOne() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Primos.main(new String[]{"1"});
        assertEquals("2\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    void primosFive() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Primos.main(new String[]{"5"});
        assertEquals("2\n3\n5\n7\n11\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    void primosDez() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Primos.main(new String[]{"10"});
        assertEquals("2\n3\n5\n7\n11\n13\n17\n19\n23\n29\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    void primosVinte() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Primos.main(new String[]{"20"});
        assertEquals("2\n3\n5\n7\n11\n13\n17\n19\n23\n29\n31\n37\n41\n43\n47\n53\n59\n61\n67\n71\n", bos.toString());
        System.setOut(originalOut);
    }

}