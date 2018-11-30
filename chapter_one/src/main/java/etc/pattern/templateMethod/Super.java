package etc.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * TemplateMethodPattern
 * 기본적인 골격을 잡아두고 필요한 부분만 유연하게 변경하여 사용할 수 있는 패턴
 */
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

