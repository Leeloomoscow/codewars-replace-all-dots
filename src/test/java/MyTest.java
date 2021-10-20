import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
    @Test
    public void testSomeDots() {
        assertTrue("one-two-three".equals(Dinglemouse.replaceDots("one.two.three")), "Sorry, try again :-(");
    }

    private static class Dinglemouse {
        static String replaceDots(final String str) {
            return str.replace(".", "-");
        }
    }
    }