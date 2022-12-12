package service.Impl;

import Classes.*;
import enums.Status;
import service.WhatsApp;

import java.util.*;

public class WhatsAppImpl implements WhatsApp {
    private static final Scanner scanner = new Scanner (System.in);
    private static final Scanner getScanner = new Scanner(System.in);
    @Override
    public void whatsAppAccount(List<Classes.WhatsApp> whatsAppList, List<Passport>passports,List<Profile> profiles) {
        System.out.println("ID: ");
        int id = getScanner.nextInt();
        System.out.println("Phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Create a password: ");
        String password = scanner.nextLine();
        System.out.println("User name: ");
        String userName = scanner.nextLine();

        for (Passport passport:passports) {


                if (id == passport.getId()) {
                    whatsAppList.add(new Classes.WhatsApp(id, phoneNumber, password, userName));
                    System.out.println(whatsAppList);

                } else {
                    System.out.println("Mynday ID jok bolgonduktan akkount jarata albaisyz!");
                }

        }





    }

    @Override
    public void messageSend(String send) {

    }

    @Override
    public String whatsAppTransfer(String transfer) {
        return null;
    }

    @Override
    public String  addContact(List<Classes.WhatsApp>whatsApps, Classes.WhatsApp myUser) {

        System.out.println("Write your password whatsApp: ");
        String password = scanner.nextLine();
        for (Classes.WhatsApp whatsApp : whatsApps) {
            if (password.equals(whatsApp.getPassword())) {

                System.out.println("Write number: ");
                String number = scanner.nextLine();
                if (number.trim().equals(whatsApp.getPhoneNumber())) {
                    System.out.println("Contact naiden : " + whatsApp.getUserName());
                    whatsApp.addContact(new Contact(whatsApp.getPhoneNumber(), whatsApp.getUserName()));

                    System.out.println("successfully added contact - > " + whatsApp.getUserName());

                }
            }
        }
        return  "";

    }

    @Override
    public void changeStatus(LinkedList<Status>statuses,List<Classes.WhatsApp> whatsApps) {
        statuses.add(Status.NA_RABOTE);

        System.out.println("Write password:");
        String password = scanner.nextLine();
        for (Classes.WhatsApp user : whatsApps) {
            if (password.equals(user.getPassword())) {
                System.out.println("Current status: " + user.getStatus());
            }


            System.out.println("""
                        ~~~~~~~~~~~ * ВЫБРАТЬ СТАТУС * ~~~~~~~~~~~~
                        1: NA_SVYIAZI,
                        2: ZANYIAT_A,
                        3: V_SHKOLE,
                        4: V_KINO
                        5:  NIZKIY_UREVEN_ZARIADA,
                      
                    """);
            int num = getScanner.nextInt();

            switch (num) {
                case 1:
                    user.setStatus(Status.NA_SVYIAZI);
                    break;
                case 2:
                    user.setStatus( Status.ZANYIAT_A);
                    break;
                case 3:
                    user.setStatus( Status.V_SHKOLE);
                    break;
                case 4:
                    user.setStatus( Status.V_KINO);
                    break;
                case 5:
                    user.setStatus( Status.NIZKIY_UREVEN_ZARIADA);
                    break;
            }

        }
    }

    @Override
    public void  getAllWatsAppStatus() {

    }

    @Override
    public void  getAllWatsApp(List<Classes.WhatsApp>whatsApps) {
        for (Classes.WhatsApp whatsApp:whatsApps) {
            System.out.println(whatsApp);
        }

    }

    @Override
    public void getMessage(List<Classes.WhatsApp>whatsApps) {

        System.out.println("Write password watsApp:");
        String passwrod = scanner.nextLine();
        for (Classes.WhatsApp whatsApp:whatsApps) {
            if(passwrod.equals(whatsApp.getPassword())){
                System.out.println(" ~~~~~~~~~~~~ * Account - > "+whatsApp.getUserName());
                whatsApp.getContacts().forEach(System.out::println);
                System.out.println("Write name contact:");
                String name = scanner.nextLine();
                for (Contact contact : whatsApp.getContacts()) {
                    if (name.equals(contact.getName())){
                        System.out.println("Write messege: ");
                        String messege = contact.getName() + ": " + scanner.nextLine();
                        System.out.println("Вы хатите отправитль сообщение?");
                        System.out.println("yes/no");
                        int yesAndNo = getScanner.nextInt();
                        if (yesAndNo == 1) {
                           contact.getMessages().add(messege);
                           
                        }
                    }
                }
            }
        }
    }

    @Override
    public void Contact(List<Contact> contacts) {


    }
}
