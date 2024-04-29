package ex_11042024;

public class Lab002 {
    public static void main(String[] args) {
        //will be printed on new line because of ln
        System.out.println("1. Hello World (with println command)");
        System.out.println("2. Hello Harshada (with println command)");

        // will be printed on same line as earlier ->
        System.out.print("3. Hello Harshada");
        System.out.print(" 4. Hello World (with print command)");

        //add new line specifically without println -> use \n
        System.out.print("\n5. Hello Harshada\n");
        System.out.print("6. Hello World (with specific line break command in print)\n");

        //to add tab in the string use \t
        System.out.print("7. Hello Harshada\t");
        System.out.print(" 8. Hello World (with specific add tab command in print)");

    }
}
