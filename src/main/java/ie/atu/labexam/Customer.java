package ie.atu.labexam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    @NotBlank(message = "first name must not be empty")
    private String firstName;
    @NotBlank(message = "last name must not be empty")
    private String lastName;
    @Email(message = "Email must be valid")
    private String email;
    @Min(value = 18, message = "cannot be less than 18")
    private double dateOfBirth;
    @NotBlank(message = "eircode cannot be blank")
    private String eircode;
}
