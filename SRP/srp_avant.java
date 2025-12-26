package ict301.solid.srp;
// Violation : La classe Book a trop de responsabilités
public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() { return title; }

    // Responsabilité d'affichage (devrait être à part)
    public void printToScreen() {
        System.out.println("Titre: " + title + " par " + author);
    }

    // Responsabilité de persistance (devrait être à part)
    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre dans la BD...");
    }
}