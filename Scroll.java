import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {

    FirefoxDriver firefoxDriver;
    WebDriverWait wait;

    public Scroll (FirefoxDriver firefoxDriver){

        this.firefoxDriver = firefoxDriver;
        wait = new WebDriverWait(firefoxDriver, 30);
        PageFactory.initElements(firefoxDriver, this);

    }

    public void down() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)firefoxDriver;
        jse.executeScript("window.scrollBy(0, 350)", "");
        Thread.sleep(2000);

    }

    public void up() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)firefoxDriver;
        jse.executeScript("window.scrollBy(350, 0)", "");
        Thread.sleep(2000);

    }
}
