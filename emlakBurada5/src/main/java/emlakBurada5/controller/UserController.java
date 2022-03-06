package emlakBurada5.controller;

import emlakBurada5.client.UserClient;
import emlakBurada5.dto.request.UserRequest;
import emlakBurada5.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserClient userClient;

    @GetMapping
    ResponseEntity<List> getAllList(){
        return new ResponseEntity<List>((List) userClient.getAllList(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?>  delete(@PathVariable int id){
        return ResponseEntity.ok(userClient.delete(id));
    }

    @PutMapping
    ResponseEntity<UserResponse> update(@RequestBody UserRequest userRequest){
        userClient.update(userRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{advertNo}")
    ResponseEntity<?> getAdvertByAdvertNo(@PathVariable int id){
        return ResponseEntity.ok(userClient.getUserByUserId(id));
    }
}
