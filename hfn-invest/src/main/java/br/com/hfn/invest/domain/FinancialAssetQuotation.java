package br.com.hfn.invest.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Financial asset quotation entity - Maps access to financial asset quotation data
 * @author hefreita
 *
 */
@Entity
public class FinancialAssetQuotation implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FinancialAssetQuotationPK id = new FinancialAssetQuotationPK();
	
	private Double openPrice;
	private Double maxPrice;
	private Double MinPrice;
	private Double price;
	private Long volume;

	/**
	 * Standard constructor
	 */
	public FinancialAssetQuotation() {}

	/**
	 * Fast constructor and initialization
	 * 
	 * @param financialAsset : {@link FinancialAsset} - Part of the primary key that refers to the financial asset
	 * @param tradedDate : {@link Date} - Part of the primary key that refers to the date when the negotiation took place
	 * @param openPrice : {@link Double} - Price at the opening of the trading session
	 * @param maxPrice : {@link Double} - Maximum price of the trading session
	 * @param minPrice : {@link Double} - Minimum price of the trading session
	 * @param price : {@link Double} - Price at the closing of the trading session
	 * @param volume : {@link Double} - Number of trades of the trading session
	 */
	public FinancialAssetQuotation(FinancialAsset financialAsset, Date tradedDate, Double openPrice, Double maxPrice, Double minPrice, Double price, Long volume) {
		super();
		this.id.setFinancialAsset(financialAsset);
		this.id.setTradedDate(tradedDate);
		this.openPrice = openPrice;
		this.maxPrice = maxPrice;
		MinPrice = minPrice;
		this.price = price;
		this.volume = volume;
	}

	/**
	 * @return the id
	 */
	public FinancialAssetQuotationPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(FinancialAssetQuotationPK id) {
		this.id = id;
	}

	/**
	 * @return the openPrice
	 */
	public Double getOpenPrice() {
		return openPrice;
	}

	/**
	 * @param openPrice the openPrice to set
	 */
	public void setOpenPrice(Double openPrice) {
		this.openPrice = openPrice;
	}

	/**
	 * @return the maxPrice
	 */
	public Double getMaxPrice() {
		return maxPrice;
	}

	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	/**
	 * @return the minPrice
	 */
	public Double getMinPrice() {
		return MinPrice;
	}

	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(Double minPrice) {
		MinPrice = minPrice;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the volume
	 */
	public Long getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
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
		FinancialAssetQuotation other = (FinancialAssetQuotation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
