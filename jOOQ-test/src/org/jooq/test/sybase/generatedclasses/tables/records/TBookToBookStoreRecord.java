/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1366671175;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [dba.t_book_store.name]
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [dba.t_book_store.name]
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [dba.t_book_store.name]
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [dba.t_book_store.name]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord getTBookStore() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_id]
	 * REFERENCES t_book [dba.t_book.ID]
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_id]
	 * REFERENCES t_book [dba.t_book.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_id]
	 * REFERENCES t_book [dba.t_book.ID]
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord fetchTBook() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book_to_book_store.book_id]
	 * REFERENCES t_book [dba.t_book.ID]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord getTBook() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create an attached TBookToBookStoreRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public TBookToBookStoreRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, configuration);
	}
}
