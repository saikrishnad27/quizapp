package com.ntr.krishna.mek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count=0;
    int i=0;
    boolean r,b,t,p;

    boolean checked,checked1,checked2,checked3;
    public void question1(View view4)
    {
         checked = ((RadioButton) view4).isChecked();

        switch (view4.getId())
        {
            case R.id.sk1 :


                    p=true;

                break;
            case R.id.sk2 :



                    p=false;

                    break;
            case R.id.sk3 :


                    p=false;

                    break;
        }

    }
    public void question2(View view3)
    {
         checked1 = ((RadioButton) view3).isChecked();

         switch (view3.getId())
        {
            case R.id.s1 :


                    b=false;
                break;
            case R.id.s2 :

                    b=true;
                    break;
            case R.id.s3 :



                    b=false;

                    break;
        }

    }
    public void question3(View view2)
    {
         checked2 = ((RadioButton) view2).isChecked();

         switch (view2.getId())
        {
            case R.id.skr1 :

                    t=false;

                break;
            case R.id.skr2 :



                    t=false;

                    break;
            case R.id.skr3 :



                    t=true;
                    break;
        }

    }
    public void question4(View view1)
    {
         checked3 = ((RadioButton) view1).isChecked();


         switch (view1.getId())
        {
            case R.id.dsk1 :


                    r=true;

                break;
            case R.id.dsk2 :
                     r=false;
                    break;
            case R.id.dsk3 :
                    r=false;
                    break;
        }

    }

    public void end(View view)
    {
        display();
    }
    public void display()
    {

        TextView text=(TextView) findViewById(R.id.sr1);
        if(checked){
            i++;
        }
        if(checked1){
            i++;
        }
        if(checked2){
            i++;
        }
        if(checked3){
            i++;
        }
        if(i==4)
        {


            if(r)
            {
                count++;

            }
            if(b)
            {

                count++;
            }
            if(t) {
                count++;

            }
            if(p){
                count++;

            }

                String king=count+"/4";
            king+="\n"+"thankyou";
                text.setText(king);




            }
        else {
            if (i == 5) {
                String r = "Welcome back";
                text.setText(r);


            } else


            {
                String ss = "Answer all questions";
                text.setText(ss);


            }
        }
     i=0;
      count=0;
    }

public void begin(View v)
{
    RadioGroup rad=(RadioGroup) findViewById(R.id.b);
    rad.clearCheck();
    RadioGroup bad=(RadioGroup) findViewById(R.id.i);
    bad.clearCheck();
    RadioGroup dad=(RadioGroup) findViewById(R.id.n);
    dad.clearCheck();
    RadioGroup cad=(RadioGroup) findViewById(R.id.g);
    cad.clearCheck();
    i=1;
    checked=false;
    checked2=false;
    checked1=false;
    checked3=false;
    display();
}



}
/*we use View for the functions which are invoked by onclick
we use cleancheck function for to uncheck the radio group
the variable count is used for counting the crct options
the variable i is used to check whether all questions are answered or not to get the final score
ischecked is used to check whether radio button is used or not in that particular radio group or not
by using set text we can send only strings and resource ids not another data type
by using findviewbyid we will finding the id and assigining it
to convert a integer into string we used string.valueof function
View is present in android.view.View package
we used styles concept here

 */