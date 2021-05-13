package cst438hw2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Country {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=1, max=25)
	private int countryCode;
	
	@NotNull
	@Size(min=1, max=25)
	private String countryName;
}
