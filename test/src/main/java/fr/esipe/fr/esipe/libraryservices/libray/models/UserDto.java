package fr.esipe.fr.esipe.libraryservices.libray.models;


import lombok.Builder;

import java.util.ArrayList;

@Builder
public class UserDto {

    private String lastname;
    private String firstname;
    private ArrayList<ExemplaryDto> exemple;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public ArrayList<ExemplaryDto> getExemple() {
        return exemple;
    }

    public void setExemple(ArrayList<ExemplaryDto> exemple) {
        this.exemple = exemple;
    }
}