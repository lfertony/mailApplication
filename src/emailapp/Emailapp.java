package emailapp;

public class Emailapp {
    public static void main(final String[] args) {
        Email em1 = new Email("Lucas", "Fertony");

        // em1.setAlternativeEmail("lucas@gmail.com");
        // System.out.println("Your Alternative email: " + em1.getAlternativeEmail());

        System.out.println(em1.showInfo());
    }
}