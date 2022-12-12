package Classes;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String phoneNumber;
    private String name;
    private List<String>messages = new ArrayList<>();

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
    public Contact(){

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "\n"+name+"( "+phoneNumber+" ) "+
                "\n chat: ";
    }
}
