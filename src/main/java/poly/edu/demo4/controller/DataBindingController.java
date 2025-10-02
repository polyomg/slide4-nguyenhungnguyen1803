package poly.edu.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import poly.edu.demo4.util.Student;

@Controller
public class DataBindingController {

    // Hiển thị form nhập
    @GetMapping("/student/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("message", "Enter student info please!");
        return "demo/student-form";
    }

    // Nhận dữ liệu sau khi submit
    @PostMapping("/student/save")
    public String save(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("message", "Student saved successfully!");
        model.addAttribute("student", student);
        return "demo/student-form";
    }
}
