package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class validationTest {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void validate() {


        String actual = "A1";
        String expected = "B1";

        System.out.println("Start");

        try {
            Assert.assertEquals(expected, actual);
        } catch (Throwable e) { // catch (Exception e) -Donot use Exception because Assert cannot captured buy Exception,
            // So Use throwable to capture Assert exception - to achieve use Errorcollector junit class
            // and also contine jue to execute next stmt ( throwable)
            System.out.println("Something Wrong" + e.getMessage());
            errorCollector.addError(e);
        }
        try {
            Assert.assertTrue("Condition Wrong", 4 < 1);
        } catch (Throwable e) {
            System.out.println("Something Wrong " + e.getMessage());
            errorCollector.addError(e);
        }


        try {
            Assert.fail("Had to fail");
        } catch (Throwable e) {
            // first try with catch (Exception e)
            // This example Errorcollector is not getting added , it is gone because of using Exception
            //Second Check this catch (Throwable e) and errorCollector.addError(e); - >see the Difference
            System.out.println("New Wrong" + e.getMessage());
            errorCollector.addError(e);


        }

        System.out.println("End");
    }


}




