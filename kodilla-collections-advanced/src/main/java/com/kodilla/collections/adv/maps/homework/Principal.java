package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalName;


    public Principal (String principalName){
        this.principalName = principalName;

    }
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName);
    }

    public String getPrincipalName(){
        return principalName;
    }
}
