public class Peregrm {
    public static void main(String[] args) {

        Phone phone4 = new Phone();
         phone4.name = "Лёша";

        Phone.receiveCall(phone4.name); //вызов перегруженного метода

    }
}