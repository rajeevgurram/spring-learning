package NonSpring;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MathTest {
    Math math = new Math();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass runs only once per test class. For DB Connections");
    }

    @Before
    public void before() {
        System.out.println("Before every test runs");
    }

    @After
    public void after() {
        System.out.println("After every test runs");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass runs only once per test class. For Closing DB Connections");
    }

    @Test
    public void testSumWithThreeNumbers() {
        int result = math.sum(new int[] {1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void testSumWithOneNumber() {
        int result = math.sum(new int[] {3});
        assertEquals(3, result);
    }
}
