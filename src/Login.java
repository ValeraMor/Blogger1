import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void Login1(){
        System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8084/blogger");
        WebElement Loginbutton = driver.findElement(By.linkText("Log In"));
        Loginbutton.click();
        WebElement Usernameinput = driver.findElement(By.id("j_username"));
        Usernameinput.clear();
        Usernameinput.sendKeys("admin");
        WebElement Passwordinput = driver.findElement(By.id("j_password"));
        Passwordinput.clear();
        Passwordinput.sendKeys("admin");
        WebElement verifylogin = driver.findElement(By.className("ui-button-text"));
        String text = verifylogin.getText();
        System.out.println(text);

            verifylogin.click();

      //driver.close();

    }

}
