package books.model;

import books.bookEnum.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String name;
    String surname;
    String email;
    String password;
    UserType userType;




}
