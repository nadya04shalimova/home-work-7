public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задание1
    public static void task1() {
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника — " + fullName);
        }
    }

    //Задание 2
    public static void task2() {
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            var result = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);
        }
    }

    //Задание 3
    public static void task3() {
        {
            var fullName = "Иванов Семён Семёнович";
            var result = fullName.replace("ё", "е");
            System.out.printf("Данные ФИО сотрудника — %s", result);
        }        }

    }
