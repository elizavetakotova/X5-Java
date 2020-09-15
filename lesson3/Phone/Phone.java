public class Phone {

int number;
 String model, name;
  double weight;

    public static void main(String[] args) {}

    public Phone( int number, String model,double weight){
            this(987, "iphone100500"); //вызов конструктора с двумя параметрами
           this.number = number;
           this.model = model;
          this.weight = weight;

        }

    public Phone( int number, String model){
           this.number = number;
            this.model = model;
        }

    public Phone() {
        }

        public static void receiveCall (String name){
            System.out.println("Звонит " + name);
        }


    public static void receiveCall (String name, int number){  //Перегруженный метод
        System.out.println("Звонит " + name);
    }


        public static int getNumber ( int number){
            return number;
        }

    public static void sendMessage (int...number){

        System.out.println("Номера телефонов: ");
               for (int i : number){
        System.out.println(number);
               }
    }

}
