package ie.atu.labexam;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    private CustomerService customerService;
    private List<Customer>customerList ;
    @GetMapping("/get/{id}")
    public String getCustomer(@PathVariable long id){//, Customer customer){
        return  customerService.get(id);

    }
    @PostMapping("/add")
    public ResponseEntity<List> addCustomer(@RequestBody Customer customer){
        customerService.add(customer);
        return ResponseEntity.ok(customerList);
    }

}
