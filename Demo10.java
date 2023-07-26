public class Demo10 {
    public static void main(String[] args) {
        String someString ="This\tis a String"; //put the tab space between this and is
        System.out.println(someString);

        String someString2="This is an\b String";
        System.out.println(someString2);

        String someString3="Thissrilanka\r is a\n String";
        System.out.println(someString3);

        String someString4="This is an \\ String"; //we want to print one back slash, we must put two backslashes
        System.out.println(someString4);

        String someString5="This is an \" String"; //if we want to put the " double quot, we must use a escape charactor
        System.out.println(someString5);

    }
}
