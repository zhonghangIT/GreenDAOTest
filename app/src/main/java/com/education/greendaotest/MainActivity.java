package com.education.greendaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnInsert;
    private StudentDao studentDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoSession daoSession = ((App) getApplication()).getDaoSession();
        studentDao = daoSession.getStudentDao();
        mBtnInsert = (Button) findViewById(R.id.btn_insert);
        mBtnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student zhangsan = new Student(1L, "张三", "一班", "男");
                studentDao.insert(zhangsan);

                //使用studentDao删除zhangsan这个对象的id为主键那条数据
                studentDao.delete(zhangsan);

                Student lisi = new Student(1L, "lisi", "", "");
                studentDao.update(lisi);

                studentDao.queryRaw(" id=? and name LIKE ?", new String[]{"1", "%张%"});

                Student wangwu = studentDao.load(1L);
            }
        });
    }
}
