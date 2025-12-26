package ict301.solid.srp;
// Solution : Séparation des responsabilités
class Book {
    private String title;
    private String author;
    public Book(String t, String a) { this.title = t; this.author = a; }
    public String getTitle() { return title; }
}

class BookPrinter {
    public void print(Book book) {
        System.out.println("Affichage du livre : " + book.getTitle());
    }
}

class BookPersistence {
    public void save(Book book) {
        System.out.println("Sauvegarde BD du livre : " + book.getTitle());
    }
}