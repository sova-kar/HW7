public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - "+fullName);

        System.out.println("Задание 2");

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase() );

        System.out.println("Задание 3");

        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName2.replace( 'ё', 'е'));
    }
}
