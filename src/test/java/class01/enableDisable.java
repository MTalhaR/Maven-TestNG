package class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void Atest(){
        System.out.println("i am A test");
    }

    @Test
    public void Btest(){
        System.out.println("i am B test");
    }

    @Test(enabled = false)
    public void Ctest(){
        System.out.println("i am C test");
    }
}
