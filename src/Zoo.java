public class Zoo {

    private Animal[] animals;
    private  String name, city;
    private final int nbrCages = 25;

    private int nbrAnimals;


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
        {
            System.out.println("donner un nom");
        }
        else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
//        this.nbrCages = nbrCages;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
//        if (nbrAnimals == nbrCages)
       //     return false;
        if (isZooFull()==false) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        }
            else {
            System.out.println("the Zoo is full");
        }
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
        }
            this.nbrAnimals--;

        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
    public boolean isZooFull(){
       if(nbrAnimals < nbrCages)
            return false;
       else
        return true;


       // return (nbrAnimals == nbrCages);
    }

    public  Zoo comparerZoo(Zoo z1 , Zoo z2){
        if(z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        else if(z2.nbrAnimals > z1.nbrAnimals)
            return z2;
        else {
            System.out.println("Z1 est égal à Z2");
            return z1;
        }
    }


}
