public class Main2 {

    public static void main(String[] args) {

        Animal[] A = new Animal[]{new Dog("���", "����"), new Cat("�������", "����"), new Horse("�������", "�����")};
        int n = A.length;

        System.out.println("��������, ��������� �� �����: ");

        for (int i = 0; i < n; i++) {
            Veterinar.treatAnimal(A[i]);
        }
    }
}
