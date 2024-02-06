package dev.nirmal.userservicetestfinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
// @JsonDeserialize(as = User.class)
public class User extends BaseModel {
  private String email;
  private String password;

  //  @ManyToMany(fetch = jakarta.persistence.FetchType.EAGER)
  @ManyToMany @JsonIgnore private Set<Role> roles = new HashSet<>();
}