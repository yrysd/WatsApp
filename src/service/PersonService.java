package service;

import Classes.Passport;
import Classes.Person;
import enums.Country;
import enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface PersonService {


    void getPassport(List<Passport>passports);
    void allPeoplePassports(List< Passport> personPassportMap);
    void getAllCountry();
    void getAllGender(ArrayList<Gender> genders);


    void getPersonByFirstName(List<Person> personList);


}
