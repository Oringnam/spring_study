package chapter1.dao2.etc.pattern;

/**
 * https://blog.seotory.com/post/2016/03/java-singleton-pattern
 * 3번째 라인의 new EagerInitialization();으로 인해 클래스가 load 되는 시점에 인스턴스를 생성시키는데 이마저도 부담스러울 수가 있다.
 * 또한 이 소스는 EagerInitialization 클래스가 인스턴스화 되는 시점에 어떠한 에러처리도 할 수가 없다.
 */
public class EagerInitialization {
  // private static 로 선언.
  private static EagerInitialization instance = new EagerInitialization();
  // 생성자
  private EagerInitialization () {
    System.out.println( "call EagerInitialization constructor." );
  }
  // 조회 method
  public static EagerInitialization getInstance () {
    return instance;
  }

  public void print () {
    System.out.println("It's print() method in EagerInitialization instance.");
    System.out.println("instance hashCode > " + instance.hashCode());
  }
}
