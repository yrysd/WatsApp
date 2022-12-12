package Classes;

import enums.Status;

import java.util.Arrays;
import java.util.List;

public class Profile  {
   private List<String> messege;
   private String name;
   private String phoneNumber;

   public Profile(String name, String phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
   }

   public List<String> getMessege() {
      return messege;
   }

   public void setMessege(List<String> messege) {
      this.messege = messege;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @Override
   public String toString() {
      return "Profile{" +
              "messege=" + messege +
              ", name='" + name + '\'' +
              ", phoneNumber='" + phoneNumber + '\'' +
              '}';
   }
}
