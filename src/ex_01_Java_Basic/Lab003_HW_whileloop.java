package ex_01_Java_Basic;

public class Lab003_HW_whileloop {
    public static void main(String[] args){
        int a=9;
        int b= 1;
        while(true){

            System.out.printf("%n%d * %d =%d", a, b, a * b);
            b++;
            if (b > a) {
                break;

            }
        }
    }
}
