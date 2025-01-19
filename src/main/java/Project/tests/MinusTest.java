package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinusTest extends ExecutionDriver {
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {5,10,5},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }
    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {-90,-100,-10},
                };
    }
    @Test(priority = 2,dataProvider = "Nagativenumbersinputs")
    public void intNagativeTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }
    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {22,20,-2},
                };
    }
    @Test(priority = 3,dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }
}
