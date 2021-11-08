import java.util.ArrayList;

public class TestDemo01 {

    byte[] a = new byte[1024 * 100];

    public static void main(String[] args) throws InterruptedException {

        ArrayList<TestDemo01> testList = new ArrayList<>();
                while(true){
                    testList.add(new TestDemo01());
                    Thread.sleep(10);
                    System.out.println("dev")
                }
    }
}
