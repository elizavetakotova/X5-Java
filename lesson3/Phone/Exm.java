public class Exm {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
         phone1.number = 123;
          phone1.model = "Iphone6";
           phone1.weight = 185.5;
            phone1.name = "Лиза";

          System.out.println("Номер телефона: " + phone1.number);
           System.out.println("Модель телефона: " + phone1.model);
            System.out.println("Вес телефона: " + phone1.weight);
              Phone.receiveCall(phone1.name);
                System.out.println("Получаем номер телефона: " + Phone.getNumber(phone1.number));
    }
}