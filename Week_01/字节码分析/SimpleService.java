public class SimpleService {
    public static void main(String[] args) {
        int g = 3;
        int h = 6;
        int tmp1 = g + h;
        int tmp2 = h - g;
        int tmp3 = g * h;
        int tmp4 = h / g;

        if (tmp2 == 3) {
            System.out.println("运算:6 - 3 = 3");
        }

        int sum = 0;
        for(int i = 0; i <5; i++) {
            sum += i;
        }
    }
}
