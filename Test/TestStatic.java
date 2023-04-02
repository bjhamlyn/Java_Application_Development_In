public class TestStatic {
    int nonStaticVariable;
    static int staticVariable;

    public void nonStaticMethod()//can access both static an dnon static
    {
        nonStaticVariable = 7;
        staticVariable =10;
    }

    public static void staticMethod()//can access both static an dnon static
    {
        // error nonStaticVariable = 7;
        staticVariable =10;
    }
}
