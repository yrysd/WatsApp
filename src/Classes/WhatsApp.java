package Classes;

import enums.Status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhatsApp  {
    private int id;
    private String phoneNumber;
    private String password;
    private String userName;
    private Status status= Status.NA_RABOTE;
    private List<Messege>messege;
    private List<Contact>contacts;
    public void addContact(Contact contact){
        if(contacts == null){
            contacts = new ArrayList<>();
        }
        contacts.add(contact);

    }






    public WhatsApp(int id, String phoneNumber, String password, String userName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
    }

    public WhatsApp() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public List<Messege> getMessege() {
        return messege;
    }

    public void setMessege(List<Messege> messege) {
        this.messege = messege;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +"\n"+
                ", phoneNumber='" + phoneNumber + "\n" +
                ", password='" + password +"\b" +
                ", userName='" + userName +"\n"+
                "  Status: "+status+"\n"+
                "~~~~~~~~~~~~~~~~~~~~~~~";
    }
    public String ToString(){
        return "User name: "+userName+"\n"+
                "Status: "+status;
    }
}
