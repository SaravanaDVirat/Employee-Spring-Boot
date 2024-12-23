package com.example.employeedetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "emp")
public class emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eid")
    public Long eid;
    @Column(name = "ename")
    public String ename;
    @Column(name = "salary")
    public Long salary;
    @Column(name = "HRA")
    public Long HRA;
    @Column(name = "DA")
    public Long DA;
    @Column(name = "TA")
    public Long TA;
    @Column(name = "PF")
    public Long PF;
    @Column(name = "gross_pay")
    public Long GrossPay;
    @Column(name = "net_pay")
    public Long NetPay;

    public Long getEid()
    {
        return eid;
    }

    public void setEid(Long eid)
    {
        this.eid=eid;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname()
    {
        return ename;
    }
    public Long getSalary()
    {
        return salary;
    }
    public void setSalary(Long salary)
    {
        this.salary=salary;
    }

    public void calculate() {
        HRA = salary * 5 / 100;
        DA = salary * 3 / 100;
        TA = salary * 2 / 100;
        PF = salary * 4 / 100;
        GrossPay = salary + HRA + DA + TA;
        NetPay = GrossPay - PF;
    }
}
