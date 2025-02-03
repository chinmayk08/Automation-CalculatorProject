package Project.tests;
import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends ExecutionDriver {
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        
        return new Object[][]
                {
                        {40,20,2},

                };
    }
    @Test(priority = 1,dataProvider ="Positivenumbersinputs" )
    public void intPositivemultiplyTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("multiply",inputs);
        add.takeScreenshotForAllure("intPositivemultiplyTest");
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
    public void intNagativemultiplyTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("multiply",inputs);
        add.takeScreenshotForAllure("intNagativemultiplyTest");
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
    public void ispositiveagativemultiplyTest(double expectedresult, double...inputs) {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        double actualresult= add.performOperation("multiply",inputs);
        add.takeScreenshotForAllure("ispositiveagativemultiplyTest");
        Assert.assertEquals(actualresult,expectedresult);
    }
}
