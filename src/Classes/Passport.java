package Classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Passport {
    private static final Scanner scanner = new Scanner(System.in);
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private Country country;
    private Gender gender;

    public Passport(int id, String lastName, String firstName, LocalDate dateOfBirth, Country country, Gender gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public Passport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Image" +
                "⠟⠛⠉⠉⠉⠉⠉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠻⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢻⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⢀⣀⣀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⢻⣿⣿⣿\n" +
                "⠄⠄⠄⠉⠉⠉⠄⣀⣀⣀⡈⠉⠛⠛⠛⠉⠉⠲⠄⠄⠄⣿⣿⣿\n" +
                "⠠⠤⠤⠔⠒⠋⠉⠄⠄⠄⠈⠉⠒⠒⠒⠒⠒⠂⠄⠄⠄⢻⣿⣿\n" +
                "⠄⠄⢀⠤⠐⠒⠒⠒⠒⠂⠄⠄⠄⠄⠄⠐⠒⠒⠒⢄⠄⠄⢿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠆⠄⠄⠄⠄⢰⠄⠄⠄⠄⠄⠄⢸⣿\n" +
                "⠄⠄⠄⢠⡖⢲⣶⣶⣤⡀⠄⠄⠄⠄⠄⠈⢀⣤⣤⣤⡀⠄⢸⣿\n" +
                "⠄⠄⠄⠈⠙⠚⠛⠛⠓⠃⠄⠄⠄⠄⠄⠄⠧⠤⢿⣿⡇⠄⢸⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢰⡆⠄⠄⠄⠄⠄⠄⠄⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠳⡀⠄⠄⠄⠄⠄⠄⢸\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⡤⠤⠄⠄⠄⠄⠄⢘⡆⠄⠄⠄⠄⢠⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠻⣤⠄⠴⠆⠠⣄⡞⠄⠄⠄⠄⢀⣾⣿\n" +
                "⣆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣾⣿⣿\n" +
                "⠈⠳⣄⠄⠄⠄⠄⠄⠖⠒⠶⠤⠤⠤⠤⠤⢤⠄⠄⢀⣿⣿⣿⣿\n" +
                "⠄⠄⠈⠑⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠙⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠈⠓⠲⠤⠤⠤⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠣⡀⠄⠄⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠉⠉⠉⠉⠉⠛⠛\n" +
                "⠄⠄⠈⠉⠑⢆⣀⡔⠈⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "| \nID: " + id + "\n" +
                "|   First name: " + firstName + "\n" +
                "|   Last name: " + lastName + "\n" +
                "|   Date of birth: " + dateOfBirth + "\n" +
                "|   Country: " + country + "\n" +
                "|   Gender: " + gender + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    public void getAllPassport(List<Passport> getAllPassport) {
        for (Passport passport:getAllPassport) {
            if(passport.getFirstName() != null){
                System.out.println(passport);
            }else {

                System.out.println("Bazada passport jok ");
            }

        }

    }
    public void getPersonPassort(List<Passport>passportLIst){
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        for (Passport passport:passportLIst) {
            if(firstName.equals(passport.getFirstName())){
                System.out.println(passport);
            }else if(!(passport.getFirstName().equalsIgnoreCase(firstName)) || passport.getFirstName().equalsIgnoreCase(null)){
                System.out.println("Mynday at menen passport jok!");
            }
        }

    }

}
