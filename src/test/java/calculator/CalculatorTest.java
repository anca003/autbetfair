package calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator c;

    @BeforeClass
    public static void setUp() {
        System.out.println("Set up Testing variables");
        c = new Calculator();
    }

    @Before
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }


    @Test
    public void myTestMethod2() {
        System.out.println("Hello world from Testing");
    }

    @Test
    @Ignore
    public void verifyUnsupportedOperation() {
        try {
            c.compute(2, 5.4, "+");
            System.out.println("Method do not return exception as expected");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        } catch (Exception e) {
            System.out.println("We are expected to received IllegalArgumentException");
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperation2() {
        c.compute(2, 5.4, "test");
    }

    @Test
    public void verifyAdditionComputeTest() {
        System.out.println("Verify addition works accordingly");
        Assert.assertEquals(5, c.compute(2, 3, "+"), 3);
        Assert.assertEquals(1, c.compute(-2, 3, "+"), 3);
    }

    //HOMEWORK

    @Test
    public void verifySubtractionComputeTest() {
        System.out.println("Verify subtraction works accordingly");
        Assert.assertEquals(10, c.compute(20, 10, "-"), 3);
        Assert.assertEquals(45, c.compute(15, -30, "-"), 3);
        Assert.assertEquals(15, c.compute(-15, -30, "-"), 3);
        Assert.assertEquals(-6, c.compute(-12, -6, "-"), 3);
    }

    @Test
    public void verifyMultiplicationComputeTest() {
        System.out.println("Verify multiplication works accordingly");
        Assert.assertEquals(10, c.compute(2, 5, "*"), 3);
        Assert.assertEquals(-25, c.compute(5, -5, "*"), 3);
        Assert.assertEquals(15, c.compute(-5, -3, "*"), 3);
        Assert.assertEquals(-6, c.compute(-1, 6, "*"), 3);
        Assert.assertEquals(0, c.compute(10, 0, "*"), 3);
    }

    @Test
    public void verifyDivisionComputeTest() {
        System.out.println("Verify division works accordingly");
        Assert.assertEquals(10, c.compute(100, 10, "/"), 3);
        Assert.assertEquals(-2, c.compute(4, -2, "/"), 3);
        Assert.assertEquals(5, c.compute(-25, -5, "/"), 3);
        Assert.assertEquals(-6, c.compute(-18, 3, "/"), 3);
        Assert.assertEquals(0, c.compute(0, 3, "/"), 3);
        try
        {
        c.compute(18, 0, "/");
        } catch (IllegalArgumentException e){
            Assert.assertTrue(e.getMessage().contains("Divide by ZERO"));
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void verifySQRTComputeTest() {
        System.out.println("Verify SQRT works accordingly");
        Assert.assertEquals(10, c.compute(100, 0, "SQRT"), 3);
        Assert.assertTrue(String.valueOf(c.compute(-25, 0, "SQRT")).contains("NaN"));
    }

    @After
    public void afterMethod() {
        System.out.println("This method run after each test");
    }

    @AfterClass
    public static void cleanUp() {
        System.out.println("Clean up Testing variables");
        c = null;
    }

}