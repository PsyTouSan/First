import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        TextEnter enter = new TextEnter();
        Scanner1 scan = new Scanner1();

        String[] ar = { "A", "B", "C" };
        for (int i = 0; i < 3; i++) {
            System.out.println(ar[i]);
        }
        enter.Text();
        scan.Scan();
        System.exit(0);

    }
}

class TextEnter {
    public void Text() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("EnterHere");
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Entered:" + str);
    }
}