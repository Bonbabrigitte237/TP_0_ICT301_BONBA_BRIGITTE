package ict301.solid.isp;
// Violation : Interface trop "grasse"
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() { /* travaille */ }
    public void eat() { /* Erreur : Un robot ne mange pas ! */ }
}