package com.Spring.RestAPI.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    List <Details> details=new ArrayList<>();
    Details detailsobj = new Details();

    //POST for Creating new detail
    @PostMapping("/details")
    public String addDetails(@RequestBody Details detail) {
        details.add(detail);
        return "Data Inserted";
    }
    //GET for fetching new detail
    @GetMapping(value = "/details")
    public List<Details> getDetails() {
        return details;
    }
    //PUT for Update
    @PutMapping("details/{id}")
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



}
