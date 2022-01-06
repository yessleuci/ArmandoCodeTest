import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAC {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.armandocode.com/");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//div[@id='navbarsExample08']//a[@href='/register']")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("tester01");
        driver.findElement(By.id("inputEmail")).sendKeys("tester01@gmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("1234567");
        driver.findElement(By.id("inputConfirmPassword")).sendKeys("1234567");
        driver.findElement(By.xpath("//button[text()='Registrar']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
