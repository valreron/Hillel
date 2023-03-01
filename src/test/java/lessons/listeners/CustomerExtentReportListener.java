package lessons.listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import utils.DriverHolder;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class CustomerExtentReportListener extends ExtentITestListenerClassAdapter {

    private File getScreenShot(ITestResult iTestResult){
        File fileForCopy = new File(iTestResult.getName() + ".jpg");
        File screenshotFile = ((TakesScreenshot) DriverHolder.getDriver()).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshotFile, fileForCopy);
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return fileForCopy;
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        ExtentTest test = ExtentTestManager.getTest(result);
        try{
            File file = getScreenShot(result);
            test.addScreenCaptureFromBase64String(
                    Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file)), "Failed test");
                    file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        super.onTestSkipped(result);
        ExtentTest test = ExtentTestManager.getTest(result);
        try{
            File file = getScreenShot(result);
            test.addScreenCaptureFromBase64String(
                    Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file)), "Failed test");
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
