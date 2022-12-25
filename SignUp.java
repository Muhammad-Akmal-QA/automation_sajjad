import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUp {
    WebDriver driver;
    allfunction fun;
    @Test
    public void Signup() throws InterruptedException {
        fun= new allfunction(driver);
        fun.startapp();
        fun.signup();
        String text=allfunction.driver.findElement(By.xpath("//span[text()[normalize-space()='Account']]")).getText();
        Assert.assertEquals(text,"Account");
    }
}

