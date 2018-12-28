import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewCalculator {

  public int calcSum(String filePath) throws IOException {
    BufferedReaderCallback bufferedReaderCallback = new BufferedReaderCallback() {
      @Override
      public int doSomethingWithReader(BufferedReader bufferedReader) throws IOException {
        int sum = 0;
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
          sum += Integer.valueOf(line);
        }
        return sum;
      }
    };
    return fileReadTemplate(filePath, bufferedReaderCallback);
  }

  public int fileReadTemplate(String filePath, BufferedReaderCallback bufferedReaderCallback) throws IOException {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(filePath));
      int sum = bufferedReaderCallback.doSomethingWithReader(br);
      return sum;

    } catch (IOException e) {
      e.printStackTrace();
      throw e;
    }
    finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
