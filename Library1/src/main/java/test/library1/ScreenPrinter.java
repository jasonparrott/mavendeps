package test.library1;

public class ScreenPrinter {

    public static void printIt(Object o) {
        if ( o == null ) return;

        System.out.println(o.toString());
    }
}
