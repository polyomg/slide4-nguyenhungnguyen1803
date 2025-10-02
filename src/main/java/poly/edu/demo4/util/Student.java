package poly.edu.demo4.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String id;
    private String fullname;
    private Boolean gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Builder.Default
    private String photo = "photo.png";

    private Double mark;
}
