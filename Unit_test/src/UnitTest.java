
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UnitTest {

    int x;
    int y;
    //Before - выполняться перед каждым тестируемым методом
    @Before
    public void setUp(){
        x=32;
        y=27;
    }
    //@Test определяет, что метод является тестовым
    @Test
    public void testAdd(){
        int result = 60;
        Assert.assertEquals("Правильный ответ 59, но ввели 60",result, Calc.sum(x,y));
        //  assertEquals - выдает сообщение  при несоответствии фактического и ожидаемого результата.
    }
    @Test
    public void testSub(){
        int result = 5;
        Assert.assertEquals("Ввели правильный ответ 5",result, Calc.min(x,y));
    }

}
