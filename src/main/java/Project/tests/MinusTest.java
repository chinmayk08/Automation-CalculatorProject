package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinusTest extends ExecutionDriver {
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive() {
        
        return new Object[][]
                {
                        {5, 10, 5},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("minus",inputs);
        add.takeScreenshotForAllure("intPositiveTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
    //////////////===========================/////////////////////

    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative(){
        
        return new Object[][]
                {
                        {-90,-100,-10},
                };
    }
    @Test(priority = 2,dataProvider = "Nagativenumbersinputs")
    public void intNagativeTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("minus",inputs);
        add.takeScreenshotForAllure("intNagativeTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative(){
        
        return new Object[][]
                {
                        {22,20,-2},
                };
    }
    @Test(priority = 3,dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("minus",inputs);
        add.takeScreenshotForAllure("ispositiveagativeTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
}
