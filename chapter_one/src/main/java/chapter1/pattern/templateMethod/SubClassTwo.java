package chapter1.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassTwo extends Super {
    @Override
    protected void hookMethod() {
        log.info("two - hook method !!");
    }

    public void abstractMethod() {
        log.info("two - abstract method !!");

    }
}
