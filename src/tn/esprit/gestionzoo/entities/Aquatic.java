package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Aquatic aquatic){
            return getName().equals(aquatic.getName()) && getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
        }

        return false;
    }

}
