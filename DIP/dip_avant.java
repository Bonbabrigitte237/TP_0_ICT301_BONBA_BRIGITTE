package ict301.solid.dip;
// Violation : Le processeur dépend d'une classe concrète MySQL
class MySQLDatabase {
    public void save(String data) { System.out.println("Sauvé dans MySQL"); }
}

class OrderProcessor {
    private MySQLDatabase db = new MySQLDatabase();
    public void process(String order) { db.save(order); }
}