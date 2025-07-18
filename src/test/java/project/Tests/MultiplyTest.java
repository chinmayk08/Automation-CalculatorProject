package project.Tests;
import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends ExecutionDriver {
    public static final Logger logger= LogManager.getLogger(MultiplyTest.class);
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive(){
        
        return new Object[][]
                {
                        {40,20,2},

                };
    }
    @Test(priority = 1,dataProvider ="Positivenumbersinputs" )
    public void intPositivemultiplyTest(double expectedresult, double...inputs)throws Exception{
            logger.info("Runing intPositivemultiplyTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("multiply",inputs);
            add.takeScreenshotForAllure("intPositivemultiplyTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intPositivemultiplyTest test case passed");
            } catch (AssertionError e) {
                logger.error("intPositivemultiplyTest(priority = 1) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
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
    public void intNagativemultiplyTest(double expectedresult, double...inputs)throws Exception {
            logger.info("Runing intNagativemultiplyTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("multiply",inputs);
            add.takeScreenshotForAllure("intNagativemultiplyTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intNagativemultiplyTest test case passed");
            } catch (AssertionError e) {
                logger.error("intNagativemultiplyTest(priority = 2) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
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
    public void ispositiveagativemultiplyTest(double expectedresult, double...inputs)throws Exception{
            logger.info("Runing ispositiveagativemultiplyTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("multiply",inputs);
            add.takeScreenshotForAllure("ispositiveagativemultiplyTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("ispositiveagativemultiplyTest test case passed");
            } catch (AssertionError e) {
                logger.error("ispositiveagativemultiplyTest(priority = 3) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
    }
}
