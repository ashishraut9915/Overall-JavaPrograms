class Book extends LibraryItem11 {
    private String genre;
    private int numberOfPages;

    public Book(String title, String author ,String location, String genre, int numberOfPages) {
        super(title, author, location);
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
