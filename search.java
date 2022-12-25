
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class search {
    WebDriver driver;
    allfunction fun;
    @Test()
    public void searchplp() throws InterruptedException {
        fun = new allfunction(driver);
  //      fun.startapp();
        fun.searchplp();
        String text = driver.findElement(By.xpath("//h2[text()='Shopping Cart']")).getText();
        Assert.assertEquals("Shopping Cart", text);
        fun.login();
 /*       fun.Payment();*/
      /*  fun.Authentiction();*/
    }
}
