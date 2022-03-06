package emlakBurada5.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserResponse {

    String name;
    String email;
    String enrolleeDescription;
}
