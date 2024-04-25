public class PhoneBook {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.add("Ivan", 123321);
        contact.add("Ivan", 123341);
        contact.add("Igor", 123342);
        contact.add("Egor", 222333);
        contact.add("Egor", 222334);
        contact.add("Egor", 222335);


        System.out.println(Contact.getPhoneBook());
        System.out.println();
    }
}
