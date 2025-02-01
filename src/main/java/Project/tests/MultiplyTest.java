package Project.tests;
import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends ExecutionDriver {
    /*@DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        
        return new Object[][]
                {
                        {40,20,2},

                };
    }
    @Test(priority = 1,dataProvider ="Positivenumbersinputs" )
    public void intPositivemultiplyTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }

    //////////////===========================/////////////////////


    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative(){
        
        return new Object[][]
                {
                        {40,-20,-2},
                };
    }
    @Test(priority = 2,dataProvider ="Nagativenumbersinputs" )
    public void intNagativemultiplyTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }

    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative(){
        
        return new Object[][]
                {
                        {-40,20,-2},
                };
    }
    @Test(priority = 3,dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativemultiplyTest(int expectedresult, int...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",inputs);
        Assert.assertEquals(actualresult,expectedresult);
    }*/
}
