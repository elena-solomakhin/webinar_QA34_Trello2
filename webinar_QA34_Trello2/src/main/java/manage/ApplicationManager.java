package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
BoardHelper board;
    UserHelper user;//1
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    user= new UserHelper(wd);//2
        board = new BoardHelper(wd);
    }

    public void stop() {
        wd.close();
        wd.quit();
    }
//3
    //generate getter


    public UserHelper getUser() {
        return user;
    }

    public BoardHelper getBoard() {
        return board;
    }
}

