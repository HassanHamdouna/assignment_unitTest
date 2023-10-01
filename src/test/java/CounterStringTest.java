import org.example.CounterClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CounterStringTest {

    private final CounterClass counter = new CounterClass();

    @DataProvider(name = "stringData")
    public Object[][] provideStringData() {
        return new Object[][] {
                {"Hello", 5},
                {"", 0},
                {"1234567890", 10},
                {" ", 1},
                {null, 0}
        };
    }

    @Test(dataProvider = "stringData")
    public void testCounterString(String inputString, int expectedLength) {
        int result = counter.counterString(inputString);
        Assert.assertEquals(result, expectedLength, "String length test failed");
    }
}
