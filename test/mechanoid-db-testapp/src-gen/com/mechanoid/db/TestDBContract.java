/*
 * Generated by Robotoworks Mechanoid
 */
package com.mechanoid.db;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.BaseColumns;

public class TestDBContract  {
    public static final String CONTENT_AUTHORITY = "com.mechanoid.db.testdb";

    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

	interface TableAColumns {
	}
	

	interface QuxColumns {
	}
	
			
	public static class TableA implements TableAColumns, BaseColumns {
	    public static final Uri CONTENT_URI = 
				BASE_CONTENT_URI.buildUpon().appendPath("table_a").build();
	
	    public static final String CONTENT_TYPE =
	            "vnd.android.cursor.dir/vnd.testdb.table_a";
	    public static final String ITEM_CONTENT_TYPE =
	            "vnd.android.cursor.item/vnd.testdb.table_a";
	
	    public static Uri buildGetByIdUri(String id) {
	        return CONTENT_URI.buildUpon().appendPath(id).build();
	    }
	
		public static ContentValues createContentValues() {
			ContentValues values = new ContentValues();
			return values;
		}
	}
	

	public static class Qux implements QuxColumns {
	    public static final Uri CONTENT_URI = 
				BASE_CONTENT_URI.buildUpon().appendPath("qux").build();
	
	    public static final String CONTENT_TYPE =
	            "vnd.android.cursor.dir/vnd.testdb.qux";
	}


	private TestDBContract(){}
}
