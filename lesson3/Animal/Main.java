public class Main {

    public static void main(String[] args) {

         Dog dog1 = new Dog();
          dog1.name = "Джек";
            dog1.type = "собака";
             dog1.age = 3;
              dog1.food = "мясо";
               dog1.location = "Москва";

          Cat cat1 = new Cat();
          cat1.name = "Мурка";
            cat1.type = "кошка";
             cat1.age = 5;
              cat1.food = "рыба";
               cat1.location = "Самара";

             Horse horse1 = new Horse();
              horse1.name = "Закат";
                horse1.type = "лошадь";
                 horse1.age = 7;
                  horse1.food = "трава";
                   horse1.location = "Владикавказ";


        Animal.makeNoise(dog1.name);
         Animal.eat(dog1.food);
          Animal.sleep(dog1.location);
           Veterinar.treatAnimal(horse1.location, horse1.food);

    }
}