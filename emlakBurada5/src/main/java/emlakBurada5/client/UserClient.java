package emlakBurada5.client;

import emlakBurada5.dto.request.UserRequest;
import emlakBurada5.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="user-client",url="http://localhost:8082/users")
public interface UserClient {

    @GetMapping
    ResponseEntity<List<UserResponse>>getAllList();

    @PostMapping
    ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest);

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    ResponseEntity<UserResponse> delete(@PathVariable int id);

    @PutMapping
    ResponseEntity<UserResponse> update(@RequestBody UserRequest userRequest);

    @RequestMapping(value = "/{advertNo}",method = RequestMethod.GET)
    ResponseEntity<UserResponse> getUserByUserId(@PathVariable int userId);
}
