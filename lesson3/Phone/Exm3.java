public class Exm3 {

    public static void main(String[] args) {
        Phone phone3 = new Phone();
         phone3.number = 789;
          phone3.model = "Iphone8";
           phone3.weight = 189.9;
            phone3.name = "�����";

        System.out.println("����� ��������: " + phone3.number);
         System.out.println("������ ��������: " + phone3.model);
          System.out.println("��� ��������: " + phone3.weight);
           Phone.receiveCall(phone3.name);
            System.out.println("�������� ����� ��������: " + Phone.getNumber(phone3.number));
    }
}