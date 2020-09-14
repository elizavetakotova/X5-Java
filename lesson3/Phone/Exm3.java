public class Exm3 {

    public static void main(String[] args) {
        Phone phone3 = new Phone();
         phone3.number = 789;
          phone3.model = "Iphone8";
           phone3.weight = 189.9;
            phone3.name = "Серёжа";

        System.out.println("Номер телефона: " + phone3.number);
         System.out.println("Модель телефона: " + phone3.model);
          System.out.println("Вес телефона: " + phone3.weight);
           Phone.receiveCall(phone3.name);
            System.out.println("Получаем номер телефона: " + Phone.getNumber(phone3.number));
    }
}