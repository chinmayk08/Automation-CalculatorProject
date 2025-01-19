package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends ExecutionDriver {

    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {13,5,8},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {-13,-5,-8},
                };
    }
    @Test(priority = 2, dataProvider = "Nagativenumbersinputs")
    public void intNagativeTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {-3,5,-8},
                };
    }
    @Test(priority = 3, dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }
}
