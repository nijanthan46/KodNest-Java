public class nested {
    public static void main(String[] args) {
        boolean ticket_Present = true;
        int age = 18;
        if (ticket_Present == true && age>=15) {
            if (age>=18) {
                System.out.println("Watch movie");
            } else {
                System.out.println("Too young");
            }
        }
        else {
            System.out.println("Buy tickets");
        }

    }
}