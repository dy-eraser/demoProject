package danial.demo.user.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
