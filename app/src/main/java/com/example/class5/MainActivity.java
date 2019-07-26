package com.example.class5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


//    ***001***match**********************************
//    Integer abc=30;
//    Integer xyz=50;
//    Integer aaa=60;

    Student st;
    Student st1;
    Student st2;

    TextView tv1;
    TextView tv2;
    TextView tv3;

    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ********************* For Loop Condition *************************
//        for (int i=0; i<=10; i++){
//            Log.i("Count","onCreate:"+i);
//        }
//        ********************* If/Else Condition **************************
//        int faridnumber=91;
//
//        if (faridnumber >=80 && faridnumber<=100){
//            Log.i("result","onCreate:......... Gread : A");
//        }else if (faridnumber >=60 && faridnumber<=79) {
//            Log.i("result", "onCreate:......... Gread : B");
//        }else if (faridnumber >=40 && faridnumber<=59) {
//            Log.i("result", "onCreate:......... Gread : C");
//        }else if (faridnumber >100) {
//            Log.i("result", "onCreate:......... Not valid");
//        }else {
//            Log.i("result","onCreate:......... fail");
//        }
//        ***001***match***************************************************
//        number.add(abc);
//        number.add(xyz);
//        number.add(aaa);
//
//        Log.i("number", "onCreate:........."+number.get(abc));
//        Log.i("number", "onCreate:........."+number.get(xyz));
//        Log.i("number", "onCreate:........."+number.get(aaa));

        tv1 = findViewById(R.id.student1);
        tv2 = findViewById(R.id.student2);
        tv3 = findViewById(R.id.student3);

        st = new Student();
        st1 = new Student();
        st2 = new Student();


        st.setStudentID("33");
        st1.setStudentID("55");
        st2.setStudentID("75");
//        ***002***match***************************************************
//        Log.i("Student", "onCreate:........."+st.getStudentID());
//        Log.i("Student", "onCreate:........."+st1.getStudentID());

        students.add(st);
        students.add(st1);
        students.add(st2);

        tv1.setText(students.get(0).getStudentID());
        tv2.setText(students.get(1).getStudentID());
        tv3.setText(students.get(2).getStudentID());


//        *********gradle (app) update************************************************


    }
}
