
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import save.project1.Utils;


/**
 *
 * @author Admin
 */
public class NtTestCase {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AFTER ALL");
    }
    
    @BeforeEach
    public  void beforeEach(){
        System.out.println("BEFORE EACH");
    }
    @AfterEach
    public  void afterEach(){
        System.out.println("After Each");
    }
    
    @Test 
    public void testNtChan(){
        int n = 2;
        boolean expected = true;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test 
    public void testNtLe(){
        int n = 5;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertTrue(actual);
    }
	
	@Test 
    public void testNtChan(){
        int n = 2;
        boolean expected = true;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test 
    public void testNtLe(){
        int n = 5;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertTrue(actual);
    }
    
    @Test 
    public void testNtAm(){
        int n = -3;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertFalse(actual);
    }

    @Test 
    public void testNtLonHon2(){
        int n = 9;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertTrue(actual);
    }

    @Test 
    public void testNtKhongPhaiSnt(){
        int n = 10;
        boolean actual = Utils.ktNt(n);
        
        Assertions.assertFalse(actual);
    }
    
}
