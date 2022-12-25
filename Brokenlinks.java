import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Brokenlinks {
    HttpURLConnection huc = null;
    int respCode = 200;

    /*List<WebElement> links;*/
    @BeforeTest
    public void localderiver() throws InterruptedException {
        allfunction.startapp();
    }

    @Test(priority = 1)
    public void brokenlinks() throws IOException, InterruptedException {
        List<WebElement> links = allfunction.driver.findElements(By.tagName("a"));
        System.out.println(links.size() + " = Totall link that present on this pagr");
        Iterator<WebElement> it = links.iterator();

        while (it.hasNext()) {

            String url = it.next().getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            System.out.println(url);

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (MalformedURLException e) {

                System.out.println("javascript:void(0) is present");
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        allfunction.driver.quit();
    }
}

