package com.example.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fixeddeposit")
public class FixedDeposit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
    private int fid;

    @NotBlank(message = "Account Number Required")
    @Column(name="accountNo")
    private int accountNo;

    @NotBlank(message = "Interest Rate is Required")
    @Column(name = "interestrate")
    private double interestRate;

    @NotBlank(message = "Open Date Required")
    @Column(name = "openDate")
    private Date openDate;

    @NotBlank(message = "Duration Period Required")
    @Column(name = "duration")
    private Date duration;

    @NotBlank(message = "Balanace is Required")
    @Column(name="balance")
    private double balance;

    private Customer customer;

}
