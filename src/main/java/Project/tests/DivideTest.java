package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTest extends ExecutionDriver {

    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        
        return new Object[][]
                {
                        {5,15,3},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveDivideTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("divide",inputs);
        add.takeScreenshot("intPositiveDivideTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
    //////////////===========================/////////////////////

    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative(){
        
        return new Object[][]
                {
                        {50,-100,-2},
                };
    }
    @Test(priority = 2,dataProvider = "Nagativenumbersinputs")
    public void intNagativeDivideTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("divide",inputs);
        add.takeScreenshot("intNagativeDivideTest");
        Assert.assertEquals(actualresult,expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative(){
        
        return new Object[][]
                {
                        {-10,20,-2},
                };
    }
    @Test(priority = 3,dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeDivideTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("divide",inputs);
        add.takeScreenshot("ispositiveagativeDivideTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
}
