package chapter1.dao2.etc.pattern;

/**
 * jvm 의 class loader의 매커니즘과 class의 load 시점을 이용하여 내부 class를 생성시킴으로 thread 간의 동기화 문제를 해결한다.
 */
public class InitializationOnDemandHolder {

  private InitializationOnDemandHolder() {}
  private static class Singleton {
    private static final InitializationOnDemandHolder instance = new InitializationOnDemandHolder();
  }

  public static InitializationOnDemandHolder getInstance () {
    System.out.println("create instance");
    return Singleton.instance;
  }
}
