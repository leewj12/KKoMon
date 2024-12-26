package react.out.reactNaga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TController {
    @GetMapping("/")
    public String goHome() {
        return "/main";
    }

    @GetMapping("/course")
    public String goCourse() {
        return "/course/course";
    }

    @GetMapping("/courseList")
    public String goCourseList() {
        return "/course/courseList";
    }

    @GetMapping("/myPage")
    public String goMyPage() {
        return "/student/myPage";
    }
}
