package br.com.hfn.invest.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Financial asset entity - Maps access to financial asset data - may be a stock, ação, fii, etc.. - assets traded on the stock exchange
 * @author hefreita
 *
 */
@Entity
public class FinancialAsset implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@EmbeddedId
	private FinancialAssetPK id = new FinancialAssetPK();
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "financial_asset_category_id")
	private FinancialAssetCategory financialAssetCategory;
	
	private Date lastUpadate;
	
	/**
	 * Standard constructor
	 */
	public FinancialAsset() {}

	/**
	 * Fast constructor and initialization
	 * 
	 * @param id : {@link FinancialAssetPK} - Identifies the financial asset in a unique way
	 * @param company : {@link Company} - Identifies which company the financial asset refers to
	 * @param financialAssetCategory : {@link FinancialAssetCategory} - Identifies which category the financial asset is
	 * @param lastUpadate : {@link Date} - Date of last update
	 */
	public FinancialAsset(FinancialAssetPK id, Company company, FinancialAssetCategory financialAssetCategory, Date lastUpadate) {
		super();
		this.id = id;
		this.company = company;
		this.financialAssetCategory = financialAssetCategory;
		this.lastUpadate = lastUpadate;
	}

	/**
	 * @return the id
	 */
	public FinancialAssetPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(FinancialAssetPK id) {
		this.id = id;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the financialAssetCategory
	 */
	public FinancialAssetCategory getFinancialAssetCategory() {
		return financialAssetCategory;
	}

	/**
	 * @param financialAssetCategory the financialAssetCategory to set
	 */
	public void setFinancialAssetCategory(FinancialAssetCategory financialAssetCategory) {
		this.financialAssetCategory = financialAssetCategory;
	}

	/**
	 * @return the lastUpadate
	 */
	public Date getLastUpadate() {
		return lastUpadate;
	}

	/**
	 * @param lastUpadate the lastUpadate to set
	 */
	public void setLastUpadate(Date lastUpadate) {
		this.lastUpadate = lastUpadate;
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
		FinancialAsset other = (FinancialAsset) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
