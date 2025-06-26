package test_programs;

public class stringsPractice {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World"); //before assigning
        System.out.println(str);
        str=str.concat(" World"); //After assigning
        System.out.println(str);


    }
}
