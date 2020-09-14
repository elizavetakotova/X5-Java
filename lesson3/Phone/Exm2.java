public class Exm2 {

    public static void main(String[] args) {
        Phone phone2 = new Phone();
         phone2.number = 456;
          phone2.model = "Iphone7";
           phone2.weight = 187.7;
            phone2.name = "Аня";

        System.out.println("Номер телефона: " + phone2.number);
         System.out.println("Модель телефона: " + phone2.model);
          System.out.println("Вес телефона: " + phone2.weight);
           Phone.receiveCall(phone2.name);
            System.out.println("Получаем номер телефона: " + Phone.getNumber(phone2.number));
    }
}