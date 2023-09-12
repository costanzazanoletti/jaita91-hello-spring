package org.learning.hello.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.learning.hello.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
  // metodo che ritorna la pagina web con la lista degli studenti
  @GetMapping
  public String studentList(Model model){
    // recuperiamo la lista degli studenti
    List<Student> studentList = getStudentsList();
    // aggiungo la lista al model come attributo
    model.addAttribute("students", studentList);
    return "student-list";
  }
  // metodo che ritorna la pagina web col profilo del rappresentante degli studenti
  @GetMapping("/representative")
  public String representative(Model model){
    // qui istanzio un oggetto Student coi dati del rappresentante
    Student rep = new Student("James", "Logan", LocalDate.parse("2021-09-10"));
    // aggiungo al model un attributo "student" che contiene lo studente rappresentante
    model.addAttribute("student", rep);
    return "student-rep";
  }

  // metodo private che restuisce la lista degli studenti
  private List<Student> getStudentsList(){
    List<Student> students = new ArrayList<>();

    students.add(new Student("Mario", "Rossi", LocalDate.parse("2023-05-12")));
    students.add(new Student("Giulia", "Bianchi", LocalDate.parse("2022-12-03")));
    students.add(new Student("Guido", "Verdi", LocalDate.parse("2022-07-07")));
    students.add(new Student("Piera", "Gialli", LocalDate.parse("2022-08-07")));

    return students;
  }
}
