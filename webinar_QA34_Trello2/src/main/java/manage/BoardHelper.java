package manage;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BoardHelper extends HelperBase {
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void initBoardCreationFormdHeader() {
    click(By.cssSelector("[data-test-id='header-create-menu-button']"));
    click(By.cssSelector("[aria-label='BoardIcon']"));// may be will not finf element
    }

    public void fillBoardCreationForm(Board board) {
   type(By.cssSelector("[data-test-id='create-board-title-input']"),board.getTitle());
    }

    public void submitBoardCreation() {
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    }

    public void returnToHomePAge() {
        click(By.cssSelector("//a[@aria-label='Back to home']"));
    }

    public int getBoardCount() {
        return wd.findElements(By.cssSelector(".boards-page-board-section-list-item")).size()-1-recentlyViewedBoards();
    }
    public int recentlyViewedBoards(){
        return  wd.findElements(By.xpath("//*[contains(@class,'icon-clock')]/../../..//li")).size();

    }


//    public void scrollDounTheForm() {
//        Actions action= new Actions(wd);
//        WebElement container = wd.findElement(By.cssSelector("[data-test-id='header-create-menu-popover']"));
//        Rectangle rect= container.getRect();
//        int x=rect.getX()+20;
//        int y=rect.getY()+ rect.getHeight()/2;
//        action.moveByOffset(x,y).click().perform();
//    }

}

