package Debug.util;

public class Debug {
    public static int DEBUG_VALUE;

    public static void dprint(String message, int debug_level)
    {
      if(debug_level <= DEBUG_VALUE)
        System.out.println(message);
    }
}
