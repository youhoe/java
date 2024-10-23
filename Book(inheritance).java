class Book {
    void display() {
        System.out.println("Name - The Complete Reference Java 2");
        System.out.println("Author - Herbert Schildt");
        System.out.println();
    }
}

class Reference_Book extends Book {
    @Override
    void display() {
        System.out.println("Name - Pure Java 2");
        System.out.println("Author - Kenneth L");
        System.out.println();
    }
}

class Magazine extends Book {
    @Override
    void display() {
        System.out.println("Name - Core Java");
        System.out.println("Author - Cay S");
        System.out.println();
    }
}

 class InheritanceDemo {  // Ensure the class is public
    public static void main(String[] args) {  // Correct main method signature
        Book b;

        b = new Book();             // Create Book object
        b.display();

        b = new Reference_Book();   // Create Reference_Book object
        b.display();

        b = new Magazine();         // Create Magazine object
        b.display();
    }
}
