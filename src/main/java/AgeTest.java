import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeTest {
    public Boolean ageTest(int age){
        if (age >= 0 || age <= 120){
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void test1(){
        boolean result = ageTest(119);
        Assert.assertEquals(result, true);
    }
}
