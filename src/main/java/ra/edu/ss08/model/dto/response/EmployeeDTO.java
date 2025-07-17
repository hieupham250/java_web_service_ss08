package ra.edu.ss08.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
    private Long id;
    private String fullName;
    private String phone;
    private String address;
    private String position;
    private Double salary;
}
