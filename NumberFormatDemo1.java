public class NumberFormatDemo1 {
    public static void main(String[] x) {
        try {
            String s = "1235";
            int a = Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException ex) {
            System.out.println("Error is " + ex);
        }
    }
}
