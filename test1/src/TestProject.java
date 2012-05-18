import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-5-15
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */



public class TestProject {
    @Test
    public void test1(){
        Calculate cal = new Calculate();
       assertEquals(0,cal.price(""));
       assertEquals(50,cal.price("A"));
        assertEquals( 80, cal.price("AB"));
        assertEquals(115, cal.price("CDBA"));
        assertEquals(100, cal.price("AA"));
        assertEquals(130, cal.price("AAA"));
        assertEquals(180, cal.price("AAAA"));
        assertEquals(230, cal.price("AAAAA"));
        assertEquals(260, cal.price("AAAAAA"));
        assertEquals(160, cal.price("AAAB"));
        assertEquals(175, cal.price("AAABB"));
        assertEquals(190, cal.price("AAABBD"));
        assertEquals(190, cal.price("DABABA"));
   }
}
