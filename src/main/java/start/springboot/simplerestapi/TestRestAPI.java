package start.springboot.simplerestapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Student(String id, String name) {
};

@RestController
public class TestRestAPI {
    @RequestMapping("student")
    public List<Student> getListStudent() {
        return Arrays.asList(new Student("1", "Nguyễn Ngọc Anh"),
                new Student("2", "Nguyễn Minh Quang"),
                new Student("3", "Nguyễn Quang Bảo"),
                new Student("4", "Nguyễn Tấn Anh Khoa"),
                new Student("5", "Bruh lmao")
        )
                ;
    }
}
