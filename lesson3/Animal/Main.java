public class Main {

    public static void main(String[] args) {

         Dog dog1 = new Dog();
          dog1.name = "����";
            dog1.type = "������";
             dog1.age = 3;
              dog1.food = "����";
               dog1.location = "������";

          Cat cat1 = new Cat();
          cat1.name = "�����";
            cat1.type = "�����";
             cat1.age = 5;
              cat1.food = "����";
               cat1.location = "������";

             Horse horse1 = new Horse();
              horse1.name = "�����";
                horse1.type = "������";
                 horse1.age = 7;
                  horse1.food = "�����";
                   horse1.location = "�����������";


        Animal.makeNoise(dog1.name);
         Animal.eat(dog1.food);
          Animal.sleep(dog1.location);
           Veterinar.treatAnimal(horse1.location, horse1.food);

    }
}