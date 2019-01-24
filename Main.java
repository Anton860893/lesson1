class Main {
    public static void main(String[] args)
    {
        byte num1 = 0;
        short num2 = 300;
        int num3 = -17;
        long num4 = -71;

        float num5 = 13.46f;
        double num6 = 9.9;

        char sym1 = 'S';

        boolean boo1 = true;

        String str1 = "I'm fine!";
        String str2 = "Today i";
        String str3 = "a good day.";
        System.out.println(str2 + sym1 + " " + str3 + " " + str1);

        int a = 1;
        int b = 3;
        int c = 4;
        int d = 2;

        int result1 = func(a, b, c, d);
        System.out.println("Function = " + result1);

        boolean result2 = sum(a, b);
        System.out.println(result2);

        znak(num3);

        boolean result3 = otr(num4);
        System.out.println(result3);

        String name = "Anton";
        hello(name);

        int year = 2020;
        leap(year);
    }

    public static int func(int a, int b, int c, int d) {
        return a*(b+(c/d));
    }

    public static boolean sum(int a, int b) {
        return (a+b>=10) && (a+b<=20) ? true : false;
    }

    public static void znak(int a) {
        if (a>=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean otr(long a) {
        if (a<0) {
            return true;
        } else {
            return false;
        }
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void leap(int year) {
        if ((year%4 == 0) || (!(year%100 == 0) && (year%400 == 0))) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year."  );
        }
    }
}