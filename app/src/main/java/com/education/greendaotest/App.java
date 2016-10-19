package com.education.greendaotest;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by zhonghang on 2016/10/19.
 */

public class App extends Application {
    private DaoSession daoSession;

    public DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //其实是创建了一个SqliteOpenhelper
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "test.db");
        //创建数据库
        Database db = helper.getWritableDb();
        //得到数据库操作类
        daoSession = new DaoMaster(db).newSession();
    }
}
