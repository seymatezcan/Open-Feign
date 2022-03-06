package emlakBurada5.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Data
@Getter
@Setter
public class AdvertRequest {

    String usageCase;
    String advertTitle;

}
