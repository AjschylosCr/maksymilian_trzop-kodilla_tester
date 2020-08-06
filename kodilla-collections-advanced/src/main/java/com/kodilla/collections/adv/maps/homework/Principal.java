package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Objects;

public class Principal {
    private String principalName;
    private String schoolName;

    public Principal (String principalName, String schoolName){
        this.principalName = principalName;
        this.schoolName = schoolName;
    }
    @Override public String equals(Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName) && Objects.equals(
                schoolName, principal.schoolName);
    }
}
