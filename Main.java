import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws FindFailed, InterruptedException {

        Screen screen = new Screen();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        Scroll scroll = new Scroll(firefoxDriver);
        Pattern ffBrowser = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\ff.jpg");
        Pattern minimize = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\minimize.jpg");
        Pattern newTab = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\NewTab.jpg");
        Pattern afterEffectsBar = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\AfterEffectsBar.jpg");
        Pattern searchField = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\SearchPond5.jpg");
        Pattern dynamicUpbeat = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\DynamicPromoUpbeat.jpg");
        Pattern solver = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\solver.jpg");
        Pattern video1 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video1.jpg");
        Pattern video2 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video2.jpg");
        Pattern video3 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video3.jpg");
        Pattern video4 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video4.jpg");
        Pattern video5 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video5.jpg");
        Pattern video6 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video6.jpg");
        Pattern video7 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video7.jpg");
        Pattern video8 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video8.jpg");
        Pattern video9 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video9.jpg");
        Pattern video10 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video10.jpg");
        Pattern video11 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video11.jpg");
        Pattern video12 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video12.jpg");
        Pattern video13 = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\video13.jpg");
        Pattern back = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\return.jpg");
        Pattern down = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\scrollDown.jpg");
        Pattern exit = new Pattern("C:\\Users\\Administrator\\Desktop\\Sikulix\\pond5pics\\exit.jpg");




        screen.wait(ffBrowser,3).click();
        Thread.sleep(2500);

        screen.find(newTab).click();

        screen.type("pond5.com");
        screen.keyDown(KeyEvent.VK_ENTER);
        screen.keyUp(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        screen.find(afterEffectsBar).click();
        Thread.sleep(2000);
        screen.find(searchField).click();

        screen.type("dynamic  upbeat");
        screen.keyDown(KeyEvent.VK_ENTER);
        screen.keyUp(KeyEvent.VK_ENTER);
        Thread.sleep(1500);

        screen.find(dynamicUpbeat).click();

        Thread.sleep(randInt(30000,55000));

        screen.find(solver).click();
        Thread.sleep(randInt(3000,4500));

        screen.find(down).click();
        Thread.sleep(750);
        screen.find(down).click();
        Thread.sleep(750);
        screen.find(down).click();
        Thread.sleep(750);
        screen.find(down).click();
        Thread.sleep(750);
        screen.find(down).click();

        Thread.sleep(1000);

        screen.find(video1).click();
        Thread.sleep(randInt(20000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video2).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video3).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video4).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video5).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video6).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video7).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video8).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video9).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video10).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video11).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video12).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(video13).click();
        Thread.sleep(randInt(25000,50000));
        screen.find(back).click();
        Thread.sleep(1500);

        screen.find(exit).click();


    }

    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
