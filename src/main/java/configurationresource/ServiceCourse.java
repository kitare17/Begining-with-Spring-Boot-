package configurationresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServiceCourse {
    @Autowired
    private Course course;

    @RequestMapping("course")
    public Course getCourse() {

        return course;
    }

}
