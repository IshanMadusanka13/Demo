package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="savingsaccount")
public class SavingsAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "said")
    private int said;

    @NotBlank(message = "Account is Required")
    @Column(name = "accountno")
    private int accountNo;

    @NotBlank(message = "Interest Rate is Required")
    @Column(name = "interestrate")
    private double interstRate;

    @NotBlank(message = "Opening Date is Required")
    @Column(name = "opendate")
    private Date openDate;

    @NotBlank(message = "Balance is Required")
    @Column(name="balance")
    private double balance;

    @Column(name = "cid")
    private Customer customer;
}
