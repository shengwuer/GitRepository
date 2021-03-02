package com.lypowernode.ba04;

public class School {
    private String name;

    public School() {
    }

    private String address;

    public School(String myname, String myaddress) {
        this.name = myname;
        this.address = myaddress;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
