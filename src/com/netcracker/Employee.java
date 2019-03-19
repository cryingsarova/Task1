package com.netcracker;

import java.util.Objects;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        int newSalary = (int)(salary+(salary*percent/100));
        setSalary(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "com.netcracker.Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }

    @Override
    public int hashCode(){
        int hashCode = 59;
        hashCode = 31 * hashCode + id;
        hashCode = 31 * hashCode + firstName.hashCode();
        hashCode = 31 * hashCode + lastName.hashCode();
        hashCode = 31 * hashCode + salary;
        return hashCode;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        else if (object == null || !(object instanceof Employee)) return  false;
        return this.id == ((Employee) object).id && this.salary == ((Employee) object).salary &&
                Objects.equals(this.firstName,((Employee) object).firstName) && Objects.equals(this.lastName,((Employee) object).lastName);
    }
}
