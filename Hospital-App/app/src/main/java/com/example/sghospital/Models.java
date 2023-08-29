package com.example.sghospital;

public class Models {
    String Name;
    String Age;
    String Address;
    String Phone;
    String Email;
    String Date;
    public Models(String name, String age, String address, String phone, String email,String date) {
        Name = name;
        Age = age;
        Address = address;
        Phone = phone;
        Email = email;
        Date = date;
    }

    @Override
    public String toString() {
        return "Models{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
}

