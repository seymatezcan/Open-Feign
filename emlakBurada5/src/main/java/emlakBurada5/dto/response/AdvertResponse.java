package emlakBurada5.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Setter
public class AdvertResponse {

    String usageCase;
    String advertTitle;

}
