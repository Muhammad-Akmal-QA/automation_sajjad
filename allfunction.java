import ConfigUtils.utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.Properties;

public class allfunction {
    static WebDriver driver;
    Properties mprop = utilities.getProps("data");

    By AccClk = new By.ByXPath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a");
    By Email = new By.ByXPath("//span[text()='Sign Up']/following::input");
    By Password = new By.ByXPath("//div[1]/input[@name='password']");
    By btn = new By.ById("sign-in");
    By entermail = new By.ByXPath("(//input[@name='email'])[2]");
    By Sgclick = new By.ByXPath("//span[text()='Sign Up']");
    By enterpas = new By.ByXPath("(//input[@name='password'])[2]");
    By fullname = new By.ByXPath("//input[@placeholder='Full name']");
    By putdataclk = new By.ByXPath("(//button[@type='submit'])[2]");
    By fbclick = new By.ByXPath("//div[@class='socialLogin']/a[@class='fb_login ']");
    By fbmail = new By.ByXPath("//input[@id='email']");
    By fbpass = new By.ByXPath("//input[@type='password']");
    By fbclck = new By.ByXPath("//button[@value='1']");
    By googleclc = new By.ByXPath("//a[@title='Sign In with Google']");
    By googlemail = new By.ByXPath("//*[@id=\"identifierId\"]");
    By btnnext = new By.ByXPath("//*[@id=\"identifierNext\"]/div/button/span");
    By enterpassword = new By.ByXPath("//div[@class='Xb9hP']/input[@type='password']");
    By btnextpas = new By.ByXPath("//*[text()='Next']");

    public allfunction(WebDriver driver) {
        this.driver = driver;
    }
    
    public void login() throws InterruptedException {
        //      driver.findElement(AccClk).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']/following::input")));

        driver.findElement(Email).sendKeys("memas98632@cadolls.com");
        driver.findElement(Password).sendKeys("123123123");
        driver.findElement(btn).click();
        Thread.sleep(3000);
    }

    public void signup() throws InterruptedException {
        driver.findElement(AccClk).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#']//span")));
        driver.findElement(By.xpath("//a[@href='#']//span")).click();
        driver.findElement(entermail).sendKeys("345f3@uad45345fa.com");
        driver.findElement(enterpas).sendKeys("123123123");
        driver.findElement(fullname).sendKeys("Tester tester");
        driver.findElement(putdataclk).click();
        Thread.sleep(10000);
    }

    public void facebook() throws InterruptedException {
        driver.findElement(AccClk).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(fbclick));
        driver.findElement(fbclick).click();
        driver.findElement(fbmail).sendKeys("gahin45469@aregods.com");
        driver.findElement(fbpass).sendKeys("cartlow1122A");
        driver.findElement(fbclck).click();
      //  Thread.sleep(4000);
    }

    public static void startapp() {
        System.setProperty("webdriver.chrome.driver",
                "/home/cartlow-qa-akmal/Selenium Jars/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        Properties mprop = utilities.getProps("data");
        driver.manage().window().maximize();
        driver.get(mprop.getProperty("URL"));
    //    System.out.println("starting application");
    }

    public void SigninwithGoogle() {
        driver.findElement(AccClk).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(googleclc));
        driver.findElement(googleclc).click();
        driver.findElement(googlemail).sendKeys("muhammad.akmal@cartlow.com");
        driver.findElement(btnnext).click();
        driver.findElement(enterpassword).sendKeys("123123123");
        driver.findElement(btnextpas).click();
    }

    public void searchplp() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("August Steiner Mens Quartz Watch, Analog Display and Leather Strap");
        driver.findElement(By.xpath("html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/span[1]")).click();
        Thread.sleep(3000);
        WebElement product = driver.findElement(By.partialLinkText("August Steiner Womens Quartz Watch"));
        product.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='cart-updater']//a")).click();
        driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[3]")).click();
       /* String text = driver.findElement(By.xpath("//h2[text()='Shopping Cart']")).getText();
        Assert.assertEquals("Shopping Cart", text);*/
    }
    public void addtocard() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@data-min='1'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='card']//a[1]")).click();
    }
    public void checkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Change']")));
        driver.findElement(By.xpath("//span[text()='Change']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add new address']")));
        driver.findElement(By.xpath("//span[text()='Add new address']")).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[1]/div[1]/div/span/span[1]/span/span[1]")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[1]/div[1]/div/span/span[1]/span/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/span/span/span[2]/ul/li[3]")).click();
        Thread.sleep(2000);
       /* WebElement element = driver.findElement(By.name("city"));
        Select select = new Select(element);
        select.selectByIndex(5);
        element.click();*/

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[1]/div[2]/div/span/span[1]/span/span[1]")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[1]/div[2]/div/span/span[1]/span/span[1]")).click();
        Thread.sleep(2000);
        WebElement from = driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/span/span/span[1]/input"));
        from.sendKeys("Al");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[1]/div[3]/input")).sendKeys("street no.5, Lahore");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[3]/div[1]/input")).sendKeys("malakand");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[3]/div[2]/input")).sendKeys("test test");
        //      driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div/div[3]/div[2]/div/div/div/form/div/div/div[3]/div[3]/div/input")).sendKeys("0501234567");
        //submit address click
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[4]/button/span")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[4]/div[2]/button")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[4]/div[2]/button")).click();
        //Payment (By Card)
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[1]/input")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[1]/input")).sendKeys("4242424242424242");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[2]/input")).sendKeys("Hailey Dawson");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[1]/div/div/input[1]")).sendKeys("05");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[1]/div/div/input[2]")).sendKeys("24");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[2]/div/input")).sendKeys("100");
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[4]/button")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[4]/button")).click();

}
/*

    public void Payment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[1]/input")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[1]/input")).sendKeys("4242424242424242");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[1]/div[2]/input")).sendKeys("Hailey Dawson");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[1]/div/div/input[1]")).sendKeys("05");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[1]/div/div/input[2]")).sendKeys("24");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[3]/div[1]/div[2]/div/input")).sendKeys("100");
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[4]/button")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[2]/div/form/div[2]/div[4]/button")).click();
    }
*/

    public void authentiction() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // Thread.sleep(4000);
        driver.switchTo().frame("cko-3ds2-iframe");
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Hint: Checkout1!']")));
        WebElement auth = driver.findElement(By.xpath("//input[@placeholder='Hint: Checkout1!']"));
        auth.sendKeys("Checkout1!");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }
}
