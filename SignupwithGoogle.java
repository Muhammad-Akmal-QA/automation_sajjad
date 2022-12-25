import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupwithGoogle {
    WebDriver driver;
    allfunction fun;
    @Test
    public void SignupwithGoogle() {
        fun = new allfunction(driver);
        fun.startapp();
        fun.SigninwithGoogle();
        String text = allfunction.driver.findElement(By.xpath("//span[text()[normalize-space()='Account']]")).getText();
        Assert.assertEquals(text, "Account");
    }
}
