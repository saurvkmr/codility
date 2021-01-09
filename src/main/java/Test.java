public class Test {

    public static void main(String[] args) {
        String s = "%% ad %%";
        System.out.println(s =  s.replaceFirst("%%", null));
        System.out.println(s.replaceFirst("%%", null));
    }
}
