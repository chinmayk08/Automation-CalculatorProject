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
        try {
            logger.info("Runing intPositiveDivideTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("divide",inputs);
            add.takeScreenshotForAllure("intPositiveDivideTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intPositiveDivideTest test case passed");
            } catch (AssertionError e) {
                logger.error("intPositiveDivideTest(priority = 1) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
        }
        catch(Exception e){
            logger.error("Exception occurred during intPositiveDivideTest test case: "+e);
        }
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
    public void intNagativeDivideTest(double expectedresult, double...inputs){
        try {
            logger.info("Runing intNagativeDivideTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("divide",inputs);
            add.takeScreenshotForAllure("intNagativeDivideTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intNagativeDivideTest test case passed");
            } catch (AssertionError e) {
                logger.error("intNagativeDivideTest(priority = 2) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
        }
        catch(Exception e){
            logger.error("Exception occurred during intNagativeDivideTest test case: "+e);
        }
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
        try {
            logger.info("Runing ispositiveagativeDivideTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("divide",inputs);
            add.takeScreenshotForAllure("ispositiveagativeDivideTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("ispositiveagativeDivideTest test case passed");
            } catch (AssertionError e) {
                logger.error("ispositiveagativeDivideTest(priority = 3) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
        }
        catch(Exception e){
            logger.error("Exception occurred during ispositiveagativeDivideTest test case: "+e);
        }
    }
}
