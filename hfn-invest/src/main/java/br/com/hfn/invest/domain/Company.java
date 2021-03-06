package br.com.hfn.invest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Company Entity - Maps access to company data
 * @author hefreita
 *
 */
@Entity
public class Company implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String ein;
	
	/**
	 * Standard constructor
	 */
	public Company() {}

	/**
	 * Fast constructor and initialization
	 * 
	 * @param id : {@link Integer} - Identifies the company in a unique way
	 * @param name : {@link String} - Company name
	 * @param ein : {@link String} - Employer identifier number 
	 */
	public Company(Integer id, String name, String ein) {
		super();
		this.id = id;
		this.name = name;
		this.ein = ein;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ein
	 */
	public String getEin() {
		return ein;
	}

	/**
	 * @param ein the ein to set
	 */
	public void setEin(String ein) {
		this.ein = ein;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
