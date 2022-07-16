package tests;

import models.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {

    @Test

    public void BoardCreation1() {
        int boardCountBeforeCreation = app.getBoard().getBoardCount();
        Board board = new Board().setTitle("testQa34");
        app.getBoard().initBoardCreationFormdHeader();
        app.getBoard().fillBoardCreationForm(board);
//    app.getBoard().scrollDounTheForm();
        app.getBoard().pausa(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pausa(2000);
        app.getBoard().returnToHomePAge();
        int boardCountAfterCreation = app.getBoard().getBoardCount();
        Assert.assertEquals(boardCountAfterCreation, boardCountBeforeCreation + 1);


    }
}
