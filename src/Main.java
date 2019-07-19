public class Main {
    static {
        System.loadLibrary("CppLib");
    }

    public static void main(String[] args) {
        saySomething();
    }

    private static native void saySomething();
}
