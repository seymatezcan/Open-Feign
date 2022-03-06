package emlakBurada5.controller;

import emlakBurada5.client.AdvertClient;
import emlakBurada5.dto.request.AdvertRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adverts")
public class AdvertController {

    @Autowired
    private AdvertClient advertClient;

    @GetMapping
    public ResponseEntity<List> getAllList(){
        return new ResponseEntity<List>((List) advertClient.getAllList(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<?> create(@RequestBody AdvertRequest advertRequest){
        return ResponseEntity.ok(advertClient.create(advertRequest));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?>  delete(@PathVariable Long id){
        return ResponseEntity.ok(advertClient.delete(id));
    }

    @PutMapping
    ResponseEntity<?> update(@RequestBody AdvertRequest advertRequest){
        return ResponseEntity.ok(advertClient.update(advertRequest));
    }

    @GetMapping("/{advertNo}")
    ResponseEntity<?> getAdvertByAdvertNo(@PathVariable long advertId){
        return ResponseEntity.ok(advertClient.getAdvertByAdvertNo(advertId));
    }
}
