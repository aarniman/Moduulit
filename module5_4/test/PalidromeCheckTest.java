import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalidromeCheckTest {

    @Test
    public void testIsPalidrome(){
        PalidromeCheck check = new PalidromeCheck();

        assertTrue(check.isPalidrome("radar"));
        assertTrue(check.isPalidrome("A man, a plan, a canal, Panama"));
        assertFalse(check.isPalidrome("hello"));
        assertFalse(check.isPalidrome("openai"));
    }

}
