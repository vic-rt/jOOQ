/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class FilmNotInStock extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1877217492;

	/**
	 * The parameter <code>sakila.film_not_in_stock.p_film_id</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_FILM_ID = createParameter("p_film_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>sakila.film_not_in_stock.p_store_id</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_STORE_ID = createParameter("p_store_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>sakila.film_not_in_stock.p_film_count</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_FILM_COUNT = createParameter("p_film_count", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FilmNotInStock() {
		super("film_not_in_stock", org.jooq.examples.mysql.sakila.Sakila.SAKILA);

		addInParameter(P_FILM_ID);
		addInParameter(P_STORE_ID);
		addOutParameter(P_FILM_COUNT);
	}

	/**
	 * Set the <code>p_film_id</code> parameter IN value to the routine
	 */
	public void setPFilmId(java.lang.Integer value) {
		setValue(org.jooq.examples.mysql.sakila.routines.FilmNotInStock.P_FILM_ID, value);
	}

	/**
	 * Set the <code>p_store_id</code> parameter IN value to the routine
	 */
	public void setPStoreId(java.lang.Integer value) {
		setValue(org.jooq.examples.mysql.sakila.routines.FilmNotInStock.P_STORE_ID, value);
	}

	/**
	 * Get the <code>p_film_count</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getPFilmCount() {
		return getValue(P_FILM_COUNT);
	}
}
