import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
        // Quelques déclarations préalables
        String s1 = "loic";
        String s2 = "loic";
        String s3 = new String("loic");
        String s4 = new String("loic");
        String s5 = s3;
        String s6 = null;
        
        assertTrue(s1 == s2);
        assertFalse(s1 == s3);
        assertFalse(s3==s4);
        assertTrue(s5==s3);
        
        assertTrue(s1.equals(s3));
        assertFalse(s1.equals(s6));
	}

}
