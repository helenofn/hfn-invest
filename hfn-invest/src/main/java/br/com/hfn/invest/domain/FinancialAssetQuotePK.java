package br.com.hfn.invest.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Primary key of the financial asset quote entity 
 * 
 * @author hefreita
 *
 */
@Embeddable
public class FinancialAssetQuotePK implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ticker_symbol_id")
	private FinancialAsset financialAsset;
	private Date tradedDate;
	
	/**
	 * @return the financialAsset
	 */
	public FinancialAsset getFinancialAsset() {
		return financialAsset;
	}
	/**
	 * @param financialAsset the financialAsset to set
	 */
	public void setFinancialAsset(FinancialAsset financialAsset) {
		this.financialAsset = financialAsset;
	}
	/**
	 * @return the tradedDate
	 */
	public Date getTradedDate() {
		return tradedDate;
	}
	/**
	 * @param tradedDate the tradedDate to set
	 */
	public void setTradedDate(Date tradedDate) {
		this.tradedDate = tradedDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((financialAsset == null) ? 0 : financialAsset.hashCode());
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
		FinancialAssetQuotePK other = (FinancialAssetQuotePK) obj;
		if (financialAsset == null) {
			if (other.financialAsset != null)
				return false;
		} else if (!financialAsset.equals(other.financialAsset))
			return false;
		return true;
	}
	
}
