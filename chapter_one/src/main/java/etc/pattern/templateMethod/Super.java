package etc.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Super {
    public void templateMethod() {
        hookMethod();
        abstractMethod();
    }

    /**
     * 선택적으로 오버라이드 가능한 훅 메소드
     */
    protected void hookMethod() {
        log.info("original hook method !!");
    }

    /**
     * 필수로 구현해야 하는 추상 메소드
     */
    public abstract void abstractMethod();
}

