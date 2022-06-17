package com.example.demo.Model;

import com.example.demo.Enumset.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.demo.Custom.mobileValidate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Integer customerid;

    @Column(name = "name")
    @NotBlank(message = "Name Required")
    private String name;

    @Column(name = "nic")
    @NotBlank(message = "NIC Required")
    private String nic;

    @Column(name = "gender",columnDefinition = "char")
    @Enumerated
    private Gender gender;

    @NotBlank(message = "Date of Birth Required")
    @Column(name = "dob")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dob;

    @Column(name = "address")
    @NotBlank(message = "Address Required")
    private String address;

    @NotBlank(message = "Mobile Required")
    @Column(name = "mobile")
    private String mobile;

    @NotBlank(message = "Email Required")
    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "occupation")
    @NotBlank(message = "Occupation Required")
    private String occupation;
}
