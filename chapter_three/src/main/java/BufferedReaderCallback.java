import java.io.BufferedReader;
import java.io.IOException;

public interface BufferedReaderCallback {

  int doSomethingWithReader(BufferedReader bufferedReader) throws IOException;

}
