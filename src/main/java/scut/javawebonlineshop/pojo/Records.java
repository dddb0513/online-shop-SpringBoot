package scut.javawebonlineshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Records {
    private Integer recordId;
    private String userName;
    private String proName;
    private Integer recordType;
}
