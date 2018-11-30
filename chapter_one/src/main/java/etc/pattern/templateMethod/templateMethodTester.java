package etc.pattern.templateMethod;

import org.junit.Test;

public class templateMethodTester {

    @Test
    public void templateMethodTest() {
        SubClassOne subClassOne = new SubClassOne();
        subClassOne.templateMethod();

        System.out.println("-----------------------------------\n\n");


        SubClassTwo subClassTwo = new SubClassTwo();
        subClassTwo.templateMethod();
    }
}
