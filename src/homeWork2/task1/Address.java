package homeWork2.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipCode;
    Geo geo;
}
