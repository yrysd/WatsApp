package service.Impl;

import Classes.Passport;
import Classes.Person;
import enums.Country;
import enums.Gender;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonImpl implements PersonService {

    private List<Passport>passports = new ArrayList<>();
    @Override
    public void getPassport(List<Passport> passports) {
        System.out.println("Full out a from");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int id= scanner.nextInt();
        System.out.println("First name: ");
        String firstName= scanner.next();
        System.out.println("Last name: ");
        String lastName= scanner.next();
        System.out.println("Birthday(yyy-mm-dd)");
        LocalDate localDate= LocalDate.parse(scanner.next());
        System.out.println("Place of birth: ");
        Country country=Country.valueOf(scanner.next());
        System.out.println("Gender: ");
        String gender=scanner.next();
        Gender gen=Gender.valueOf(gender);
        passports.add(new Passport(id,lastName,firstName,localDate,country,gen));
        passports.forEach(System.out::println);
    }

    @Override
    public void allPeoplePassports(List<Passport> personPassportMap) {
        for (Passport passport:personPassportMap) {
            System.out.println(passport);
        }


    }

    @Override
    public void getAllCountry() {
        Country[] country = Country.values();
        for (Country country1: country) {
            System.out.println(country1);
        }


    }

    @Override
    public void getAllGender(ArrayList<Gender> genders) {
        Gender[] gender = Gender.values();
        for (Gender gender1:gender) {
            System.out.println(gender1);
        }

    }

    @Override
    public void getPersonByFirstName(List<Person> personList) {

    }

    public List<Passport> getPassports() {
        return passports;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }
}
