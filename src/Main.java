import Classes.Contact;
import Classes.Passport;
import Classes.Profile;
import Classes.WhatsApp;
import enums.Country;
import enums.Status;
import service.Impl.PersonImpl;
import service.Impl.WhatsAppImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static List<Passport> passport = new ArrayList<>();

    public static void main(String[] args) {

//        1.бардык паспортту алуу
//        2.аты менен паспорт алуу
//        3. WhatsAppтын баарын алыңыз
//        4.профилиңизге өтүңүз
//        5. бүт шаарды алуу
//        6.Whatsapp статусун алуу
//        7.паспортту түзүү
//        8.Whatsapp орнотуу
//        9.chnge статусу
//        10.контакт кошуу
//        11.билдирүү жөнөтүү
//        12. статусту караңыз

        ArrayList<Passport> passports = new ArrayList<>();


//        person.getPassport(passports);
//        person.allPeoplePassports(passports);

        person();

    }

    public static void person() {
        LinkedList<Status>statuses = new LinkedList<>();
        WhatsAppImpl whatsApp = new WhatsAppImpl();
        WhatsAppImpl whatsApp3 = new WhatsAppImpl();
        WhatsApp whatsApp12 = new WhatsApp();

        List<WhatsApp>whatsAppList = new ArrayList<>();
        Passport passport = new Passport();
        List<Passport> passports = new ArrayList<>();
        List<Profile>profiles = new ArrayList<>();
        PersonImpl person = new PersonImpl();
        while (true) {
            commands();
            System.out.println();
            System.out.print("Write command: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    passport.getAllPassport(passports);
                    break;
                case 2:
                    passport.getPersonPassort(passports);
                    break;
                case 3:
                    whatsApp3.getAllWatsApp(whatsAppList);
                    break;

                case 4:
                    System.out.println("parol jazynyz: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String password = scanner1.nextLine();
                    for (WhatsApp whatsApp1:whatsAppList) {
                        if(password.equals(whatsApp1.getPassword())){
                            System.out.println(whatsApp1);

                        }
                    }
                    break;
                case 5:
                    Country[] country = Country.values();
                    for (Country country1 :country) {
                        System.out.println(country1);
                    }

                    break;
                case 6:
                    Status[] status = Status.values();
                    for (Status status1:status) {
                        System.out.println(status1);
                    }
                    break;

                case 7:
                    person.getPassport(passports);
                    break;
                case 8:
                    whatsApp.whatsAppAccount(whatsAppList,passports,profiles);
                    break;


                case 9:
                    whatsApp3.changeStatus(statuses,whatsAppList);
                    break;
                case 10:
                    whatsAppList.forEach(System.out::println);
                    break;
                case 11:

                    whatsApp3.getMessage(whatsAppList);
                    break;

                case 12:
                    whatsApp3.addContact(whatsAppList,whatsApp12);
                    break;
                case 13:
                    Contact contact = new Contact();
                    System.out.println(contact);
            }
        }


    }


    public static void commands() {
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~ * COMMANDS * ~~~~~~~~~~~~~~~~~~~~~~
                1.бардык паспортту алуу
                2.аты менен паспорт алуу
                3. WhatsAppтын баарын алыңыз
                4.профилиңизге өтүңүз
                5. бүт шаарды алуу
                6.  Whatsapp статусун алуу
                7.  паспортту түзүү
                8.  Whatsapp орнотуу
                9.  chnge статусу
                10. статусту караңыз
                11. билдирүү жөнөтүү
                12. контакт кошуу
                13. контактарды коруу
                """);
    }
    public static void profileCommands(){
        int  profile = scanner.nextInt();
        comanda();
        switch (profile){
            case 1:


        }
    }
    public static void comanda(){
        System.out.println("""
                1.Contacts  
                """);
    }
}
