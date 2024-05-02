import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tuan3.triangtype.TriangType;
/**
 *
 * @author Admin
 */
public class TriangleTypeTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangType.classifyTriangle(6, 6, 6));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangType.classifyTriangle(5, 5, 7));
        assertEquals("Isosceles", TriangType.classifyTriangle(7, 5, 5));
        assertEquals("Isosceles", TriangType.classifyTriangle(5, 7, 5));
    }
    @Test
    public void testRightTriangle() {
        assertEquals("Right triangle", TriangType.classifyTriangle(3, 4, 5));
        assertEquals("Right triangle", TriangType.classifyTriangle(5, 12, 13));
        assertEquals("Right triangle", TriangType.classifyTriangle(7, 24, 25));
    }
    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangType.classifyTriangle(4, 5, 6));
        assertEquals("Scalene", TriangType.classifyTriangle(10, 20, 30));
        assertEquals("Scalene", TriangType.classifyTriangle(11, 13, 17));
    }
    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangType.classifyTriangle(1, 1, 2));
        assertEquals("NotATriangle", TriangType.classifyTriangle(2, 1, 3));
        assertEquals("NotATriangle", TriangType.classifyTriangle(3, 2, 1));
    }
    
}
