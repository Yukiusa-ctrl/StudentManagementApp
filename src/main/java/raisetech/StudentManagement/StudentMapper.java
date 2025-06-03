package raisetech.StudentManagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM students")
    List<Student> findAllStudents();

    @Select("SELECT * FROM student_course")
    List<StudentCourse> findAllCourse();
}
