package emlakBurada5.client;

import emlakBurada5.dto.request.AdvertRequest;
import emlakBurada5.dto.response.AdvertResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="advert-client",url="http://localhost:8082/adverts")
public interface AdvertClient {

    @GetMapping
    ResponseEntity<List<AdvertResponse>> getAllList();

    @PostMapping
    ResponseEntity<AdvertResponse>create(@RequestBody AdvertRequest advertRequest);

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    ResponseEntity<AdvertResponse> delete(@PathVariable Long id);

    @PutMapping
    ResponseEntity<AdvertResponse> update(@RequestBody AdvertRequest advertRequest);

    @RequestMapping(value = "/{advertNo}",method = RequestMethod.GET)
    ResponseEntity getAdvertByAdvertNo(@PathVariable Long advertId);
}
