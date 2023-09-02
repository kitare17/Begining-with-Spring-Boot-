package configurationresource;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "service-course")
@Component
public class Course {

    private String idCourse;
    private String nameCourse;

    public String getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse='" + idCourse + '\'' +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }
}
