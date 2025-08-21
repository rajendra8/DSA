import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sound.midi.Sequence;
import java.time.Duration;

public class Carrier {

/**
    AndroidDriver driver;
    Desiredcapabilities dc;

    @BeforeMethod
    public void beforeMethod(){
        dc=new Desirecabalities();
        dc.setCapabilty("appium:plateformName","Android");
        dc.setCapabilty("appium:platformVesion","15");
        dc.setCapabilty("appium:appPackage","com.app.");
        dc.setCapabilty("appium:appActivity","com.app.main");
        dc.setCapabilty("appium:automationName","UIAutomater2");
        dc.setCapabilty("appium:appPath","path of the app");


        driver=new AndroidDriver(new Url(http://127.0.0.1:4723)dc);

    }

    public void scrolling( ){
        Point Y_startingPoint= (driver.manage.window().getHeight)*0.2;
        Point X_startingPoint= (driver.manage.window().getWidth)/2;
        Point Y_EndPoint= (driver.manage.window().getWidth)*0.8;
        Point X_EndPoint= driver.manage.window().getWidth/2;
        PointerInput PI=new PointerInput(PointerInput.kind.Touch,"finger");
        sequence sequence=new Sequence(PI,0);
        sequence.addAction(sequence.MovePointerLeft(), Duration.ofNanos(10);
        sequence.addAction(sequence.MovePointerDown(), Duration.ofNanos(10),X_startingPoint,Y_startingPoint));
        sequence.addAction(sequence.MovePointerDown(), Duration.ofNanos(10),X_EndPoint,Y_EndPoint));
        sequence.addAction(sequence.MovePointerLeft(), Duration.ofNanos(10));


    }
**/
    @Test
    public void scrollingTest(){

    }
}
