package homeWork3.task3;






public class Main {
    public static void main(String[] args) {
        Zooclub zooclub = new Zooclub();
        System.out.println(zooclub);
        Person person1 = new Person(1, "Kolya");
        Person person2 = new Person(2, "Vasyz");
        Person person3 = new Person(3, "Olya");

        //1) додати учасника в клуб;
        zooclub.addPerson(person1);
        System.out.println(zooclub);

        //        2) додати тваринку до учасника клубу.
        Pet pet1 = new Pet(1, "dog");
        Pet pet2 = new Pet(2, "cat");
        Pet pet3 = new Pet(3, "pig");



        zooclub.addPetToPerson(person1, pet1);
        zooclub.printZooclub();

        //        3) видалити тваринку з власника.
        zooclub.deletePetFromPerson(person1,pet1);
        zooclub.printZooclub();

        //        4) видалити учасника клубу.
        zooclub.deletePerson(person1);
        zooclub.printZooclub();


        zooclub.addPerson(person1);
        zooclub.addPetToPerson(person1,pet1);
        zooclub.addPerson(person2);
        zooclub.addPetToPerson(person2,pet2);
        zooclub.addPetToPerson(person2,pet3);

        zooclub.addPerson(person3);
        zooclub.addPetToPerson(person3,pet1);
        zooclub.addPetToPerson(person3,pet2);
        zooclub.addPetToPerson(person3,pet3);

        zooclub.printZooclub();
        System.out.println("-----------");
        //        5) видалити конкретну тваринку з усіх власників.
        zooclub.deletePetFormEveryPerson(pet2);

        //        6) вивести на екран зооклуб.
        zooclub.printZooclub();


    }
}
