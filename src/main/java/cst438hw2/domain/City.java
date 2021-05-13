package cst438hw2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "city")
public class City {
	@Id
	@Column(name = "ID")
	private long id;
	
	@NotNull
	@Size(min=1, max=25)
	private String cityName;
}
