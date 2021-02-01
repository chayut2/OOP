package LAB6;

import java.util.StringTokenizer;

public class ex_StringToken {
    public static void main(String[] args) {

        String msg = "I work at RUTS, Nakornsithammarat, Thailand.";
        StringTokenizer token = new StringTokenizer(msg);

        //count word
        System.out.println("Word in message:"+token.countTokens());

        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
