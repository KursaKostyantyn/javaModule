package homeWork1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cinderella> cinderellas = new ArrayList<>();
        Prince prince= new Prince("Ben", 29,37);
        for (int i=0; i<10;i++){
            cinderellas.add(new Cinderella("Katy"+i,19+i,35+i));
        }
        Cinderella findCinderella = new Cinderella();
        for(Cinderella cinderella : cinderellas){
            if(cinderella.getSize()==prince.getSize()){
                findCinderella =cinderella;
            }
        }
        System.out.println(findCinderella);
    }
}
