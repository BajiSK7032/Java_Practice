package Java_Pract;

public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f, third=3.30f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        System.out.println("third number = " + third);

        // Value of first is assigned to temporary
        float temporary = first;
        


        // Value of second is assigned to first
        first = second;
        second=third;

        // Value of temporary (which contains the initial value of first) is assigned to second
        third = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        System.out.println("third number = " + third);
    }
}

