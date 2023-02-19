package com.example.UserManagement.usermanagement.model;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.UserManagement.usermanagement.validation.UserValid;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userld;

    @NotNull(message = "Username cannot be null")
    @Column(name = "User_Name")
    private String username;

    @NotNull(message = "Date of birth cannot be null")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth must be in the format yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Date_Of_Birth")
    private String dateOfBirth;

    @NotNull(message = "Email cannot be null")
    @Column(name = "E-mail")
    @Email(message = "Please provide a valid email address")
    private String email;


    @NotNull(message = "Phone number cannot be null")
    @Column(name = "Phone_Number")
    @Pattern(regexp = "^[0-9]{2}[0-9]{10}$", message = "Phone number must be 12 digits with first 2 digits as country code")
    private String phoneNumber;

    @Column(name = "Date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

//    {
//        "username":"Arpit",
//            "dateOfBirth":"2000-09-14",
//            "email":"arpitpjain47@gmail.com",
//            "phoneNumber":"7349277536"
//    }
    @Column(name = "Time")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    public User() {
    }

    public User(long userld, String username, String dateOfBirth, String email, String phoneNumber, LocalDate date, LocalTime time) {
        this.userld = userld;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
    }

    public long getUserld() {
        return userld;
    }

    public void setUserld(long userld) {
        this.userld = userld;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "userld=" + userld +
                ", username='" + username + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
