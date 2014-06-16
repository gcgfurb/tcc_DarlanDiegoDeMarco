package br.com.furb.tagarela.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table SYMBOL_HISTORIC.
*/
public class SymbolHistoricDao extends AbstractDao<SymbolHistoric, Long> {

    public static final String TABLENAME = "SYMBOL_HISTORIC";

    /**
     * Properties of entity SymbolHistoric.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Date = new Property(0, java.util.Date.class, "date", false, "DATE");
        public final static Property SymbolID = new Property(1, Long.class, "symbolID", false, "SYMBOL_ID");
        public final static Property TutorID = new Property(2, Long.class, "tutorID", false, "TUTOR_ID");
        public final static Property UserID = new Property(3, Long.class, "userID", false, "USER_ID");
        public final static Property ServerID = new Property(4, Long.class, "serverID", true, "SERVER_ID");
    };


    public SymbolHistoricDao(DaoConfig config) {
        super(config);
    }
    
    public SymbolHistoricDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SYMBOL_HISTORIC' (" + //
                "'DATE' INTEGER," + // 0: date
                "'SYMBOL_ID' INTEGER," + // 1: symbolID
                "'TUTOR_ID' INTEGER," + // 2: tutorID
                "'USER_ID' INTEGER," + // 3: userID
                "'SERVER_ID' INTEGER PRIMARY KEY );"); // 4: serverID
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SYMBOL_HISTORIC'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, SymbolHistoric entity) {
        stmt.clearBindings();
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(1, date.getTime());
        }
 
        Long symbolID = entity.getSymbolID();
        if (symbolID != null) {
            stmt.bindLong(2, symbolID);
        }
 
        Long tutorID = entity.getTutorID();
        if (tutorID != null) {
            stmt.bindLong(3, tutorID);
        }
 
        Long userID = entity.getUserID();
        if (userID != null) {
            stmt.bindLong(4, userID);
        }
 
        Long serverID = entity.getServerID();
        if (serverID != null) {
            stmt.bindLong(5, serverID);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4);
    }    

    /** @inheritdoc */
    @Override
    public SymbolHistoric readEntity(Cursor cursor, int offset) {
        SymbolHistoric entity = new SymbolHistoric( //
            cursor.isNull(offset + 0) ? null : new java.util.Date(cursor.getLong(offset + 0)), // date
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // symbolID
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // tutorID
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // userID
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // serverID
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, SymbolHistoric entity, int offset) {
        entity.setDate(cursor.isNull(offset + 0) ? null : new java.util.Date(cursor.getLong(offset + 0)));
        entity.setSymbolID(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setTutorID(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setUserID(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setServerID(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(SymbolHistoric entity, long rowId) {
        entity.setServerID(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(SymbolHistoric entity) {
        if(entity != null) {
            return entity.getServerID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
