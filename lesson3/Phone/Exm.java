public class Exm {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
         phone1.number = 123;
          phone1.model = "Iphone6";
           phone1.weight = 185.5;
            phone1.name = "����";

          System.out.println("����� ��������: " + phone1.number);
           System.out.println("������ ��������: " + phone1.model);
            System.out.println("��� ��������: " + phone1.weight);
              Phone.receiveCall(phone1.name);
                System.out.println("�������� ����� ��������: " + Phone.getNumber(phone1.number));
    }
}