package id.ac.ui.cs.mobileProgramming.helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainActivityTest {
    MainActivity mainActivity = new MainActivity();
    @Test
    public void testEncryptVigenereCipher() {
        String encrypted = VigenereCipher.encrypt("darell", "helloworld");
        assertEquals("kecpzh",encrypted);
    }
    @Test
    public void testDecryptVigenereCipher() {
        String decrypted = VigenereCipher.decrypt("kecpzh", "helloworld");
        assertEquals("darell",decrypted);
    }
}