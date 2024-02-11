package embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable

public class NameIdentifier {
    private String firstName;
    private String middleName;
    private String lastName;
}
