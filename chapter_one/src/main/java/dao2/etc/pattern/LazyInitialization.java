package dao2.etc.pattern;

/**
 * https://blog.seotory.com/post/2016/03/java-singleton-pattern
 * 최초 사용시점에만 인스턴스화 시키기 때문에 프로그램이 메모리에 적재되는 시점에 부담이 많이 줄게된다.
 * 하지만 여전히 문제는 남아있다. 만약 프로그램이 muilti thread 방식이라면 위와 같은 singleton pattern은 안전하지 않다.
 */
public class LazyInitialization {

  private static LazyInitialization instance;
  private LazyInitialization () {}

  public static LazyInitialization getInstance () {
    if ( instance == null )
      instance = new LazyInitialization();
    return instance;
  }

  public void print () {
    System.out.println("It's print() method in LazyInitialization instance.");
    System.out.println("instance hashCode > " + instance.hashCode());
  }
}