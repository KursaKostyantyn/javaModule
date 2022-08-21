package homeWork2.task1;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
