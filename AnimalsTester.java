import org.junit.*;

import static org.junit.Assert.*;

public class AnimalsTester {
    public Animals lion;

    @Before
    public void setUp() {
        this.lion = new Animals(4, 1, "Mufasa"); 
    }

    @Test
    public void testSetLegs() {
        this.lion.setLegs(6);
        assertEquals(6, this.lion.getLegs());
    }

    
}
