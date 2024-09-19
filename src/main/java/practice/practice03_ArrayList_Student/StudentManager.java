package practice.practice03_ArrayList_Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    public static void main(String[] args) {

        List<StudentDTO> stdtDTO = new ArrayList<>();
        stdtDTO.add(new StudentDTO("홍길동", 20, "2023001"));
        stdtDTO.add(new StudentDTO("김철수", 21, "2023002"));

        for (int i = 0; i < stdtDTO.size(); i++) {
            System.out.println(stdtDTO.get(i));
        }




    }
}
