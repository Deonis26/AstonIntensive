package HomeWork.Lesson_4;

public class Main {
    public static void main(String[] args) {
        Person [] personArray = new Person[5];
        personArray[0] =new Person("Иванов Иван Иванович", "Певец", "ivanov@mail.com", "375-25-111-22-22", 55, 2000 );
        personArray[1] =new Person("Павлов Павел Павлович", "Инженер", "pavlov@mail.com", "375-25-222-33-33", 19, 800 );
        personArray[2] =new Person("Викторов Виктор Викторович", "Повар", "victorov@mail.com", "375-25-333-44-44", 42, 7500 );
        personArray[3] =new Person("Александров Александр Александрович", "Сантехник", "aleksandrov@mail.com", "375-25-444-55-55", 33, 1000 );
        personArray[4] =new Person("Петров Петр Петрович", "Продавец", "petrov@mail.com", "375-25-555-66-66", 25, 1500 );

        for (int i = 0; i <personArray.length; i++) {
            if (personArray[i].getAge()>=40){
                System.out.println(personArray[i].toString());
            }

        }
    }
}
