package com.netcracker;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString(){
        String resultString = "com.netcracker.Author[name="+name+
                             ",email="+email+
                             ",gender="+gender+"]";
        return resultString;
    }

    @Override
    public int hashCode(){
        int hashCode = 59;
        hashCode = 31* hashCode+ name.hashCode();
        hashCode = 31 * hashCode + email.hashCode();
        hashCode = 31* hashCode + (int)gender;
        return hashCode;
    }

    @Override
    public boolean equals(Object object){
            if (this == object) return true;
            if (object == null || !(object instanceof Author)) return false;
            return Objects.equals(this.email,((Author) object).email) && Objects.equals(this.name,((Author) object).name) &&
                    this.gender == ((Author) object).gender;

    }
}
