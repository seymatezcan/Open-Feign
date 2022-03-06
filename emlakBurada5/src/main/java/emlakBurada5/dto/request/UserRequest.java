package emlakBurada5.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserRequest {

    String name;
    String email;
    String enrolleeDescription;
}
