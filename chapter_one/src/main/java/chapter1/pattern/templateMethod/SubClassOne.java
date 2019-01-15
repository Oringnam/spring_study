package chapter1.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassOne extends Super {
    public void abstractMethod() {
      log.info("one - abstract method !!");
    }
}
