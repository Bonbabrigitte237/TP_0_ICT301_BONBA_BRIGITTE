package ict301.solid.isp;
// Solution : Séparation des interfaces
interface Workable { void work(); }
interface Eatable { void eat(); }

class Human implements Workable, Eatable {
    public void work() { System.out.println("L'humain travaille"); }
    public void eat() { System.out.println("L'humain mange"); }
}

class Robot implements Workable {
    public void work() { System.out.println("Le robot travaille"); }
}