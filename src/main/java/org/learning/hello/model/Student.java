package org.learning.hello.model;

import java.time.LocalDate;

// questa è una classica classe Java, non gestita da Spring, che rappresenta gli studenti
public class Student {
  private String firstName;
  private String lastName;
  private LocalDate enrollmentDate;
  // costruttore con parametri
  public Student(String firstName, String lastName, LocalDate enrollmentDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.enrollmentDate = enrollmentDate;
  }
  // se faccio un costruttore con parametri devo anche fare il costruttore vuoto
  public Student(){

  }
  // tutti i getter e setter
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }
}
