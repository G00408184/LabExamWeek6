package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    public List<Customer>add(Customer customer){
        customerRepo.save(customer);
        return customerRepo.findAll();
    }

    public String get(long id ){
        if (customerRepo.existsById(id)) {
            customerRepo.findById(id);
            return "Product:";
        }else{
            return "not found";
        }

        }

    }

