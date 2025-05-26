package raisetech.StudentManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.GenerationType;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String furigana;
    private String nickname;
    private String email;
    private String region;
    private Integer age;
    private String gender;
}
