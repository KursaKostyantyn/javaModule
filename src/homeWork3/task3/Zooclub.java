package homeWork3.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
// В зооклубі створити методи, та застосувати їх


//         Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//         Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zooclub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    //         1) додати учасника в клуб;
    public void addPerson(Person person) {
        List<Pet> pets = new ArrayList<>();
        club.put(person, pets);
    }

    //         2) додати тваринку до учасника клубу.

    public void addPetToPerson(Person person, Pet pet) {
        club.get(person).add(pet);
    }
    //         3) видалити тваринку з власника.

    public void deletePetFromPerson(Person person, Pet pet) {
        club.get(person).remove(pet);
    }

    //         4) видалити учасника клубу.

    public void deletePerson(Person person) {
        club.remove(person);
    }

//         5) видалити конкретну тваринку з усіх власників.

    public void deletePetFormEveryPerson(Pet pet) {
        for (Map.Entry<Person, List<Pet>> personListEntry : club.entrySet()) {
            Person next = personListEntry.getKey();
            for (Pet p : club.get(next)) {
                if (p.equals(pet)) {

                    club.get(next).remove(pet);
                }
            }

        }
    }

    //         6) вивести на екран зооклуб.
    public void printZooclub() {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
