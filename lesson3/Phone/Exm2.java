public class Exm2 {

    public static void main(String[] args) {
        Phone phone2 = new Phone();
         phone2.number = 456;
          phone2.model = "Iphone7";
           phone2.weight = 187.7;
            phone2.name = "���";

        System.out.println("����� ��������: " + phone2.number);
         System.out.println("������ ��������: " + phone2.model);
          System.out.println("��� ��������: " + phone2.weight);
           Phone.receiveCall(phone2.name);
            System.out.println("�������� ����� ��������: " + Phone.getNumber(phone2.number));
    }
}