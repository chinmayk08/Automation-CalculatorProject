package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTest extends ExecutionDriver {

    /*@DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        
        return new Object[][]
                {
                        {5,15,3},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveDivideTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",inputs);
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
    public void intNagativeDivideTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",inputs);
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
    public void ispositiveagativeDivideTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }*/
}
