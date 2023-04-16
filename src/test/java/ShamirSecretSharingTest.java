import org.junit.Test;
import static org.junit.Assert.*;

public class ShamirSecretSharingTest	{

    @Test
    public void	verifyNoExceptionThrown() {
        ShamirSecretSharing.main(new String[]{});
    }

    @Test
    public void testShamirMain() {
        ShamirSecretSharing s = new ShamirSecretSharing();

        String result = s.print();

        assertEquals("Shamir", result);
    }

    @Test
    public void testEquals() {
        String a = "this";
        String b = "this";
        assertEquals(a, b);
    }

    @Test
    public void testNotEquals() {
        String a = "this";
        String b = "that";
        assertNotEquals(a, b);
    }

}