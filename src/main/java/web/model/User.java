package web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 30, message = "Имя должно содержать от 2 до 30 символов.")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Адрес электронной почты должен быть действительным.")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Age is mandatory")
    @Min(value = 18, message = "Возраст должен быть не менее 18 лет.")
    @Max(value = 85, message = "Возраст должен быть не более 85 лет.")

    @Column(name = "age")
    private Integer age;


}

