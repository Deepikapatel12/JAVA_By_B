package com.example.bean;

import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private int rollNo;
    private String mobile;
    private int rank;
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && rank == student.rank && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, rollNo, mobile, rank);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo=" + rollNo +
                ", mobile='" + mobile + '\'' +
                ", rank=" + rank +
                '}';
    }
}
