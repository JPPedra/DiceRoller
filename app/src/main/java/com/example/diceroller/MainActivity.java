package com.example.diceroller;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View view) {

        try{

        TextView tv = this.findViewById(R.id.numberTextView);
        Random r = new Random();
        int number = r.nextInt(6);


        tv.setText(Integer.toString(number));

        EditText insertnumber = this.findViewById(R.id.insertnumber);

        TextView textView00 = this.findViewById(R.id.textView00);



      String puta = insertnumber.getText().toString();
      int insertnumber1 = Integer.parseInt(puta);


        if (number == insertnumber1) {
            textView00.setText("Congrats");
        }
        else{
            textView00.setText("Try Again");
        }
    } catch (Exception e) {
        }
        }

    }
