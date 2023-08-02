public class SubStr {
    public static void main(String[] args) {
        String str="This is my Mercedes Benz M Class";

        int a=str.indexOf("m");
        System.out.println(a);

        int b=str.indexOf("M");
        System.out.println(b);

        int c=str.lastIndexOf("M");
        System.out.println(c);

    }
}
