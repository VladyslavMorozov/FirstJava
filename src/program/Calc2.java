package program;

    public class Calc2 {
        static int c;

        public static void Sum(int a, int b) {
            c = a + b;
            System.out.println(c);
        }

        public static void Diff(int a, int b) {
            c = a - b;
            System.out.println(c);
        }

        public static void mult(int a, int b) {
            c = a * b;
            System.out.println(c);
        }

        public static void div(int a, int b) {
            c = a / b;
            System.out.println(c);
        }


        public static void main(String[] args) {
            Sum(2, 4);
            Diff(4, 2);
            mult(2, 5);
            div(6, 3);
        }
    }
