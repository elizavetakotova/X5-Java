public class Metodsm {
    public static void main(String[] args) {

        Phone phone5 = new Phone();
         phone5.number = 000;

        Phone phone6 = new Phone();
         phone6.number = 111;

        Phone phone7 = new Phone();
         phone7.number = 222;

        Phone.sendMessage(phone5.number, phone6.number, phone7.number); //גûחמג לועמהא

    }
}