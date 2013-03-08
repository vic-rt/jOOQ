/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> {

	private static final long serialVersionUID = -850250043;

	/**
	 * Setter for <code>test.t_dates.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.t_dates.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>test.t_dates.d</code>. 
	 */
	public void setD(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.t_dates.d</code>. 
	 */
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>test.t_dates.t</code>. 
	 */
	public void setT(java.sql.Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test.t_dates.t</code>. 
	 */
	public java.sql.Time getT() {
		return (java.sql.Time) getValue(2);
	}

	/**
	 * Setter for <code>test.t_dates.ts</code>. 
	 */
	public void setTs(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test.t_dates.ts</code>. 
	 */
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>test.t_dates.d_int</code>. 
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>test.t_dates.d_int</code>. 
	 */
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>test.t_dates.ts_bigint</code>. 
	 */
	public void setTsBigint(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>test.t_dates.ts_bigint</code>. 
	 */
	public java.lang.Long getTsBigint() {
		return (java.lang.Long) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.mysql.generatedclasses.tables.TDates.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.TDates.T_DATES);
	}
}
