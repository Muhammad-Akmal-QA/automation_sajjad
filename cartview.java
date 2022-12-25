import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cartview{

    WebDriver driver;
    allfunction fun;
    By AccClk= new By.ByXPath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a/span[2]");
    @Test
    public void login() throws InterruptedException {
         fun= new allfunction(driver);
        fun.startapp();
        allfunction.driver.findElement(AccClk).click();
        fun.login();
        String text=allfunction.driver.findElement(By.xpath("//span[text()[normalize-space()='Account']]")).getText();
        Assert.assertEquals(text,"Account");
    }

}
