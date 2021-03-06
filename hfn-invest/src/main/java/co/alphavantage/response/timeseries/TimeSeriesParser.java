package co.alphavantage.response.timeseries;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import co.alphavantage.AlphaVantageParse;
import co.alphavantage.exception.AlphaVantageException;

public abstract class TimeSeriesParser<T> extends AlphaVantageParse<T> {
	/**
	 * The specifics of the resolution is pushed down to each response type, i.e
	 * Intraday, Daily etc.
	 *
	 * @param metaData  the meta data
	 * @param stockData the stock data
	 * @return the response for each individual response, i.e Intraday, Daily etc.
	 */
	abstract T resolve(Map<String, String> metaData, Map<String, Map<String, String>> stockData);

	/**
	 * Gets the key for the stock data, this differs for each response type, i.e
	 * Intraday, Daily etc. This is used by the resolve method below.
	 *
	 * @return the stock data key
	 */
	abstract String getStockDataKey();

	@Override
	public T resolve(JsonObject rootObject) {
		Type metaDataType = new TypeToken<Map<String, String>>() {}.getType();
		Type dataType = new TypeToken<Map<String, Map<String, String>>>() {}.getType();
		try {
			Map<String, String> metaData = GSON.fromJson(rootObject.get("Meta Data"), metaDataType);
			Map<String, Map<String, String>> stockData = GSON.fromJson(rootObject.get(getStockDataKey()), dataType);
			return resolve(metaData, stockData);
		} catch (JsonSyntaxException e) {
			throw new AlphaVantageException("time series api change", e);
		}
	}
}
