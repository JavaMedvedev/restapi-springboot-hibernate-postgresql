package com.sergeymedvedev.springboot.restapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;

	@Column
	@NotBlank
	private String firstName;

	@Column
	@NotBlank
	private String lastName;

	@Column
	@NotNull
	private Date dob;

	@Column
	@NotBlank
	private String department;

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDob() {
		return dob;
	}

	public String getDepartment() {
		return department;
	}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", dob=" + dob +
				", department='" + department + '\'' +
				'}';
	}
}
