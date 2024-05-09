package tests;
//jose arenas venegas
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({
    MediaNotasTest.class,
    MedianaNotasTest.class,
    MaximaNotaTest.class,
    MinimaNotaTest.class
})
public class SuitePruebasPractica {
  
}
