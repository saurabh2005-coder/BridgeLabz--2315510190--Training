package LibraryManagement;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String getItemDetails() {
        return title + " by " + author + " (" + itemId + ")";
    }

    public abstract int getLoanDuration(); // in days
}
