
package com.example.demoroomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv1, tv2;
    Button btn1, btn2, btn3, btn4;
    StudentDao st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.e1);
        tv2 = findViewById(R.id.e2);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        RoomDatabase.Builder builder;
        builder= Room.databaseBuilder(this,AppDatabase.class,"MyDb1");
        builder.allowMainThreadQueries();
        AppDatabase db=(AppDatabase)builder.build();
        st=db.getStudentDao();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                save();
                break;
            case R.id.b2:
                select();
                break;
            case R.id.b3:
                update();
                break;
            case R.id.b4:
                delete();
                break;
        }
    }

    public void save() {
        int id=Integer.parseInt(tv1.getText().toString());
        String n=tv2.getText().toString();
        Student st1=new Student();
        st1.id=id;
        st1.name=n;
        st.save(st1);
        Toast.makeText(this, "Record Saved", Toast.LENGTH_SHORT).show();
    }
    public void select(){
        int id=Integer.parseInt(tv1.getText().toString());
        Student st1=st.getStudent(id);
        if(st1!=null){
            tv2.setText(st1.name);
        }else{
            Toast.makeText(this, "Record not found", Toast.LENGTH_SHORT).show();
        }
    }
    public void update(){
        int id=Integer.parseInt(tv1.getText().toString());
        String n=tv2.getText().toString();
        Student st1=new Student();
        st1.id=id;
        st1.name=n;
        st.update(st1);
        Toast.makeText(this, "Record Updated", Toast.LENGTH_SHORT).show();
    }
    public void delete(){
        int id=Integer.parseInt(tv1.getText().toString());
        Student st1=new Student();
        st1.id=id;
        st.delete(st1);
        Toast.makeText(this, "Record Deleted", Toast.LENGTH_SHORT).show();
    }
}