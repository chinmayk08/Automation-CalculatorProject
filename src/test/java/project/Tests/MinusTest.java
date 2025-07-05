package project.Tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinusTest extends ExecutionDriver {
    public static final Logger logger= LogManager.getLogger(MinusTest.class);
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive() {
        
        return new Object[][]
                {
                        {5, 10, 5},

                };
    }
    @Test(priority = 1,dataProvider = "Positivenumbersinputs")
    public void intPositiveMinusTest(double expectedresult, double...inputs)throws Exception{
            logger.info("Runing intPositiveMinusTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("minus",inputs);
            add.takeScreenshotForAllure("intPositiveMinusTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intPositiveMinusTest test case passed");
            } catch (AssertionError e) {
                logger.error("intPositiveMinusTest(priority = 1) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
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
    public void intNagativeMinusTest(double expectedresult, double...inputs)throws Exception{
            logger.info("Runing intNagativeMinusTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("minus",inputs);
            add.takeScreenshotForAllure("intNagativeMinusTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("intNagativeMinusTest test case passed");
            } catch (AssertionError e) {
                logger.error("intNagativeMinusTest(priority = 2) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
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
    public void ispositiveagativeMinusTest(double expectedresult, double...inputs)throws Exception{
            logger.info("Runing ispositiveagativeMinusTest Started..");
            ArithmaticOperations add=new ArithmaticOperations(driver);
            double actualresult= add.performOperation("minus",inputs);
            add.takeScreenshotForAllure("ispositiveagativeTest");
            try{
                Assert.assertEquals(actualresult,expectedresult);
                logger.info("ispositiveagativeMinusTest test case passed");
            } catch (AssertionError e) {
                logger.error("ispositiveagativeMinusTest(priority = 3) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
    }
}
