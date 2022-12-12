package service;

import Classes.Contact;
import Classes.Passport;
import Classes.Person;
import Classes.Profile;
import enums.Status;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface WhatsApp {
    void whatsAppAccount(List<Classes.WhatsApp> whatsAppList, List<Passport>passports, List<Profile>profiles);
    void messageSend(String send);
    String whatsAppTransfer(String transfer);
    String addContact(List<Classes.WhatsApp>whatsAppList, Classes.WhatsApp myUsers);
    void changeStatus(LinkedList<Status>statuses,List<Classes.WhatsApp> whatsApps);
    void getAllWatsAppStatus();
    void  getAllWatsApp(List<Classes.WhatsApp>whatsAppList);
   void  getMessage(List<Classes.WhatsApp>whatsAppList);
   void Contact(List<Contact>contacts);

}
