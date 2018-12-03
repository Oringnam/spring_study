package dao2.etc.pattern;

/**
 * https://blog.seotory.com/post/2016/03/java-singleton-pattern
 * 수 많은 thread 들이 getInstance() method 를 호출하게 되면 높은 cost 비용으로 인해 프로그램 전반에 성능저하가 일어난다.
 */
public class ThreadSafeInitalization {

  private static ThreadSafeInitalization instance;
  private ThreadSafeInitalization () {}

  public static synchronized ThreadSafeInitalization getInstance () {
    if (instance == null)
      instance = new ThreadSafeInitalization();
    return instance;
  }

  public void print () {
    System.out.println("It's print() method in ThreadSafeInitalization instance.");
    System.out.println("instance hashCode > " + instance.hashCode());
  }

}