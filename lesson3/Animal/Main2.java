public class Main2 {

    public static void main(String[] args) {

        Animal[] A = new Animal[]{new Dog("дом", "мясо"), new Cat("лежанка", "рыба"), new Horse("конюшня", "трава")};
        int n = A.length;

        System.out.println("Животные, пришедшие на прием: ");

        for (int i = 0; i < n; i++) {
            Veterinar.treatAnimal(A[i]);
        }
    }
}
