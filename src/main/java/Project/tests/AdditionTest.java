package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends ExecutionDriver {

    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive() {
        return new Object[][]
                {
                        {3.1, 1.1, 2.0},
                };
    }

    @Test(priority = 1, dataProvider = "Positivenumbersinputs")
    public void intPositiveTest(double expectedresult, double... inputs) {
        ArithmaticOperations add = new ArithmaticOperations(driver);
        double actualresult = add.performOperation("Add", inputs);
        Assert.assertEquals(actualresult, expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative() {
        return new Object[][]
                {
                        {-13, -5, -8},
                };
    }
    @Test(priority = 2, dataProvider = "Nagativenumbersinputs")
    public void intNagativeTest(double expectedresult, double... inputs) {
        ArithmaticOperations add = new ArithmaticOperations(driver);
        double actualresult = add.performOperation("Add", inputs);
        Assert.assertEquals(actualresult, expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative() {
        return new Object[][]
                {
                        {-3, 5, -8},
                };
    }
    @Test(priority = 3, dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeTest(double expectedresult, double... inputs) {
        ArithmaticOperations add = new ArithmaticOperations(driver);
        double actualresult = add.performOperation("Add", inputs);
        Assert.assertEquals(actualresult, expectedresult);
    }
}
