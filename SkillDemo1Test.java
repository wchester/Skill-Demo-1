import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test{
    @Test
    public void returnTest(){
        assertEquals("Hello", SkillDemo1File.returnSomething());
    }
}