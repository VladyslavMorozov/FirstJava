package program;

//Это класс - шаблон описание нашего обьекта
public class FirstProgram {
    /**
     * это метод - действие для обьекта. Главный метод приложения, для запуска программы.
     * public - модификатор доступа к переменной/методу.
     * static - это определение свойств которые обрабатывает наш метод или свойство значения переменной.
     * void - обозначает что метод при вычислении не возвращает вычесляемое значение
     * main -
     * */
    public static void sayHello(){
        System.out.println("Hello Java");
    }
    public static double calc(double a, double b){
        double c;
        c = a / b;
        System.out.println(c);
        return c;
    }
    // & - и, | - или
    public static void rec(int age) {

        if (age <= 15 | age > 55){
            System.out.println("Вы нам не подходите");}
        else if (age >=16 | age <=17){
            System.out.println("Неполный рабочий день");}
        else if (age >= 18 | age <= 55){
            System.out.println("Добро пожаловать на борт!");
        }else {
            System.out.println("Укажите ваш возраст");
        }
    }

    public static void newRec(int group) {
        switch (group){
            case 1:
                System.out.println("Вы нам не подходите");
                break;
            case 2:
                System.out.println("Неполный рабочий день");
                break;
            case 3:
                System.out.println("Добро пожаловать на борт!");
                break;
            case 4:
                System.out.println("Укажите ваш возраст");
                break;
        }
    }

    public static void main(String[] args) {
    }
}
