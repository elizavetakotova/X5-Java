public class Phone {

int number;
 String model, name;
  double weight;

    public Phone(int number, String model, double weight) {

        this(987,"iphone100500"); //����� ������������ � ����� �����������
         this.number = number;
          this.model = model;
           this.weight = weight;

    }

    public Phone(int number, String model) {
        this.number = number;
         this.model = model;
    }

    public Phone() {
    }

    public static void receiveCall(String name) {
    System.out.println("������ " + name);
 }

 public static int getNumber(int number) {
   return number;
 }


}
