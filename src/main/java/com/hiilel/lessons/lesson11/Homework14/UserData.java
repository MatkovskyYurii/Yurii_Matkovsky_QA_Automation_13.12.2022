package com.hiilel.lessons.lesson11.Homework14;

public class UserData {
    final String name;
    final int bDay;
    final int bMonth;
    final int bYear;
    final String email;
    final String phoneNumber;
    String secondName;
    int weight;
    int pressure;
    int daySteps;

    public String getName() {
        return name;
    }

    public int getbDay() {
        return bDay;
    }

    public int getbMonth() {
        return bMonth;
    }

    public int getbYear() {
        return bYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getDaySteps() {
        return daySteps;
    }

    public UserData(String name, int bDay, int bMonth, int bYear, String email,
                    String phoneNumber, String secondName, int weight, int pressure, int daySteps) {
        this.name = name;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.secondName = secondName;
        this.weight = weight;
        this.pressure = pressure;
        this.daySteps = daySteps;
    }

    String printAccountInfo() {
        return "\nName: " + name + "\nSecond Name: " + secondName + "\nB-day date - " + bDay + ":" + bMonth + ":" + bYear + "\nEmail: " + email
                + "\nPhone Number: " + phoneNumber + "\nWeight: " + weight
                + "\nBlood pressure: " + pressure + "\nDay steps: " + daySteps + "\nUser age: " + getAge();
    }

    public int getAge() {
        return 2023 - bYear;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setDaySteps(int daySteps) {
        this.daySteps = daySteps;
    }
}
