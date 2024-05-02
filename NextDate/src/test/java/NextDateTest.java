
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tuan3.nextdate.NextDate;


/**
 *
 * @author Admin
 */
public class NextDateTest {
    @Test
    public void test1() {
	NextDate test = new NextDate(30,1,2014) ;
	NextDate result = new NextDate(31,1,2014) ;
	assertEquals(result.toString(),test.nextDate().toString());
    }
    @Test
    public void test2() {
	NextDate test = new NextDate(31,1,2014) ;
	NextDate result = new NextDate(1,2,2014) ;
	assertEquals(result.toString(),test.nextDate().toString());
    }
    @Test
    public void test3() {
	NextDate test = new NextDate(28,2,2010) ;
	NextDate result = new NextDate(29,2,2010) ;
	assertEquals(result.toString(),test.nextDate().toString());
    }
    @Test
    public void test4() {
	NextDate test = new NextDate(28,2,2011) ;
	NextDate result = new NextDate(29,2,2011);
	assertEquals(result.toString(),test.nextDate().toString());
    }
    @Test
    public void test5() {
	NextDate test = new NextDate(30,4,2011) ;
	NextDate result = new NextDate(1,5,2011) ;
	assertEquals(result.toString(),test.nextDate().toString());
    }
}
