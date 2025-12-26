package ict301.solid.dip;
// Solution : Dépendance vers une abstraction (Interface)
interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) { System.out.println("Sauvé dans MySQL"); }
}

class OrderProcessor {
    private Database db;
    public OrderProcessor(Database db) { this.db = db; }
    public void process(String order) { db.save(order); }
}