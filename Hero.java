public class Hero implements Comparable<Hero> {

    @Override 
    public int compareTo(Hero other){
        return name.compareTo(other.getName());
    }

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}







/* 

Modifie la classe Hero afin d'implémenter Comparable. 
L'ordre de tri par défaut sera sur l'attribut name, par ordre croissant.



*/