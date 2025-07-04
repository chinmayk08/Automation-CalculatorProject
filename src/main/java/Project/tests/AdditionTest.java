package Project.tests;

import Project.Utility.RetryFailedTest;
import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import io.qameta.allure.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends ExecutionDriver {
    public static final Logger logger= LogManager.getLogger(AdditionTest.class);
    @DataProvider(name = "Positivenumbersinputs")
    public Object[][] dataforpositive() {
        return new Object[][]
                {
                        {3.2, 1.1, 2.0},
                };
    }

    @Test(priority = 1, dataProvider = "Positivenumbersinputs")
    @Severity(SeverityLevel.NORMAL)
    @Description("check int values test")
    public void intPositiveTest(double expectedresult, double... inputs) throws Exception {

            logger.info("Runing intPositiveTest Started..");
            ArithmaticOperations add = new ArithmaticOperations(driver);
            double actualresult = add.performOperation("Add", inputs);
            add.takeScreenshotForAllure("intPositiveTest");// allure attachment
            try{
                Assert.assertEquals(actualresult, expectedresult, "intPositiveTest validation failed");
                logger.info("intPositiveTest test case passed");
            } catch (AssertionError e) {
                logger.error("intPositiveTest(priority = 1) test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
    }


    //////////////===========================/////////////////////

    @DataProvider(name = "Nagativenumbersinputs")
    public Object[][] datafornagative() {
        return new Object[][]
                {
                        {-12, -4, -8},

                };
    }


    @Test(priority = 2, dataProvider = "Nagativenumbersinputs")
    public void intNagativeTest(double expectedresult, double... inputs)throws Exception {
            logger.info("Runing intNagativeTest Started..");
            ArithmaticOperations add = new ArithmaticOperations(driver);
            double actualresult = add.performOperation("Add", inputs);
            add.takeScreenshotForAllure("intNagativeTest");
            try{
                Assert.assertEquals(actualresult, expectedresult);
                logger.info("intNagativeTest test case passed");
            } catch (Exception e) {
                logger.error("intNagativeTest(priority = 2)test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
    }
    //////////////===========================/////////////////////

    @DataProvider(name = "PositiveNagativenumbersinputs")
    public Object[][] dataforpositivenagative() {
        return new Object[][]
                {
                        {-3, 5, -8},
                };
    }
    @Test(priority = 3, dataProvider = "PositiveNagativenumbersinputs")
    public void ispositiveagativeTest(double expectedresult, double... inputs)throws Exception{
            logger.info("Runing ispositiveagativeTest Started..");
            ArithmaticOperations add = new ArithmaticOperations(driver);
            double actualresult = add.performOperation("Add", inputs);
            add.takeScreenshotForAllure("ispositiveagativeTest");
            try{
                Assert.assertEquals(actualresult, expectedresult);
                logger.info("ispositiveagativeTest test case passed");
            } catch (Exception e) {
                logger.error("ispositiveagativeTest(priority = 3)test case failed expected: "+expectedresult+" and actual: "+actualresult);
                throw e;
            }
    }
}
