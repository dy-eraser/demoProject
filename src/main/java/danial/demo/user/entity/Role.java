package danial.demo.user.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role implements GrantedAuthority {

    @Id
    private String role;    //This is something like 'ROLE_ADMIN' etc ...
    @Column
    private String caption; //This is a description to role

    @Override
    public String getAuthority() {
        return this.role;
    }
}
