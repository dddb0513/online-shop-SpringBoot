package scut.javawebonlineshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private Integer proId;
    private String proName;
    private BigDecimal proPrice;
    private String proDescrip;
    private String proImg;
    private Integer proNum;
}
