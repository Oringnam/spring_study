package chapter2.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;

import static org.junit.Assert.assertThat;

/**
 * @author Jin Won Park, oringnam
 * @since 2018-12-21
 */
public class JUnitTest {

    static JUnitTest testObject;

    @Test
    public void test1() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test2() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test3() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }
}
