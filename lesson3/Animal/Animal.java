public class Animal {

        String food, location;

    public static void main (String[] args){}

    public static void makeNoise (String name){
        System.out.println(name + " ������ ����");
    }

    public static void eat (String food){
        System.out.println("����� ������ " + food);
    }

    public static void sleep (String location){
        System.out.println("���������������: " + location);
    }


}

    class Dog extends Animal {
     String name, type, location, food;
       int age;

        public Dog(String location, String food) { //�������� ������������ ��� ������ � �������� � ���������� ���������� location, food
            this.location = location;
            this.food = food;
        }
    }

    class Cat extends Animal {
      String name, type, location, food;
        int age;

        public Cat(String location, String food) { //�������� ������������ ��� ������ � �������� � ���������� ���������� location, food
            this.location = location;
            this.food = food;
        }
    }

    class Horse extends Animal {
      String name, type, location, food;
       int age;

        public Horse(String location, String food) { //�������� ������������ ��� ������ � �������� � ���������� ���������� location, food
            this.location = location;
            this.food = food;
        }
    }

 class Veterinar extends Animal {
    public static void treatAnimal(String location, String food){
        System.out.println("����� ����������: " + location + ". " + "�������: " + food);
    }
}