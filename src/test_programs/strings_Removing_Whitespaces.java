package test_programs;

public class strings_Removing_Whitespaces {
    public static void main(String[] args) {

        String s= " Geeks for Geeks ";
       String Output=s.replaceAll("\\s","");
        System.out.println("'"+Output +"'");


    }
}
