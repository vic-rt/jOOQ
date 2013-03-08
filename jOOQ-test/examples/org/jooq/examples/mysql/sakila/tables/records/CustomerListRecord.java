/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class CustomerListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord> implements org.jooq.Record9<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> {

	private static final long serialVersionUID = -1579902148;

	/**
	 * Setter for <code>sakila.customer_list.ID</code>. 
	 */
	public void setId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.ID</code>. 
	 */
	public java.lang.Short getId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.customer_list.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.customer_list.address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.address</code>. 
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sakila.customer_list.zip code</code>. 
	 */
	public void setZipCode(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.zip code</code>. 
	 */
	public java.lang.String getZipCode() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>sakila.customer_list.phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.phone</code>. 
	 */
	public java.lang.String getPhone() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>sakila.customer_list.city</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.city</code>. 
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>sakila.customer_list.country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.country</code>. 
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>sakila.customer_list.notes</code>. 
	 */
	public void setNotes(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.notes</code>. 
	 */
	public java.lang.String getNotes() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>sakila.customer_list.SID</code>. 
	 */
	public void setSid(java.lang.Byte value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sakila.customer_list.SID</code>. 
	 */
	public java.lang.Byte getSid() {
		return (java.lang.Byte) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.ZIP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.NOTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field9() {
		return org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST.SID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getZipCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getNotes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value9() {
		return getSid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustomerListRecord
	 */
	public CustomerListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST);
	}
}
