package chat.aim.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WaitingForElements extends PageObject {
    public void waitUntilElementToBeInvisible(int waitSec, String xpath) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
//
//        int counter = 0;
//        while ((findBy(xpath).isVisible()) && (counter <= 20)) {
//            waitABit(waitSec);
//            counter++;
//        }
    }


    public void waitUntilElementToBeVisible(int waitSec, String xpath) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
//        waitABit(250);
//        int counter = 0;
//        while (!(findBy(xpath).isVisible()) && (counter < 5)) {
//            waitABit(waitSec);
//            counter++;
//        }
    }
    public String getAbsolutePathOfFile(String fileName) throws URISyntaxException {
        URL resource = this.getClass().getResource("/Files/" + fileName);
        return new File(resource.toURI()).getAbsolutePath();
    }
}

