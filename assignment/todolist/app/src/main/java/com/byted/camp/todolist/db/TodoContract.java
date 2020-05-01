package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static final String SQL_CREATE_ENTRIES=
            "CREATE TABLE "+ ToDoList.TABLE_NAME+" ("+
                    ToDoList._ID+" INTEGER PRIMARY KEY,"+
                    ToDoList.COLUMN_DATE + " INTEGER,"+
                    ToDoList.COLUMN_STATE +" INTEGER," +
                    ToDoList.COLUMN_CONTENT+" TEXT)";
    public static final String SQL_DELETE_ENRTIES=
            "DROP TABLE IF EXISTS "+ ToDoList.TABLE_NAME;

    private TodoContract() {
    }

    public static class ToDoList implements BaseColumns {
        public static final String TABLE_NAME="entry";
        public static final String COLUMN_CONTENT="content";
        public static final String COLUMN_DATE="time";
        public static final String COLUMN_STATE="state";
    }

}
