package space.bum.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;

	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_authorities", 
		joinColumns = @JoinColumn(name = "userId"),
		inverseJoinColumns = @JoinColumn(name = "authorityId"))
	private Set<Authority> authorities;
}
