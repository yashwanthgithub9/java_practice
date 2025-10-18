package com.Spring.RestAPI.Controller;

import ch.qos.logback.core.boolex.EvaluationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    List <Details> details=new ArrayList<>();
    Details detailsobj = new Details();

    //POST for Creating new detail
    @PostMapping("/details")
    public String addDetails(@RequestBody List<Details> detail) { // changed post mapping to accept list of details
        details.addAll(detail); //addAll method to add list
        return "Data Inserted";
    }
    //GET for fetching new detail
    @GetMapping(value = "/details")
    public List<Details> getDetails() {
        return details;
    }
    //PUT for Update
    @PutMapping("/details/{id}")
    public String updateDetails(@PathVariable int id, @RequestBody Details detail){
        for (Details d:details){
            if (d.getId()==id){
                d.setName(detail.getName());
                return "Data Updated";
            }
        }
        return "Detail not found";
    }

    //DELETE
    @DeleteMapping("/details/{id}")
    public String deleteDetail(@PathVariable int id){
        details.removeIf(d->d.getId()==id);
        return "Deleted Detail";
    }

    @GetMapping(value = "/details/{id}")
    public List<Details> getUniqueDetails(@PathVariable int id) {
        return Collections.singletonList(details.get(id));// This creates a List that contains exactly one element — the item at position id in your details list.
    }

/*    @GetMapping("/search")
    public ResponseEntity<List<Details>> listResponseEntity(
            @RequestParam(value = "name",defaultValue = "Yash",required = false) String name){
            System.out.println(listResponseEntity(name).getBody());
        return (ResponseEntity<List<Details>>) ResponseEntity.ok(details);

    }*/
    @GetMapping("/hello")
    public String sayHello(
            @RequestParam String name
    ){
        return "Hello "+name;
    }
}
