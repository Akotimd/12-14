public class Pain {

    public static void main(String[] args) {
        String nameJohn = "John";
        int age = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);
        Person john = new Person("John", 13);
        System.out.println("sarah.name = " + john.name);
        System.out.println("sarah.age = " + john.age);
    }
}