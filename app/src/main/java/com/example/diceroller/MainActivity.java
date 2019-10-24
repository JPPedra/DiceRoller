package com.example.diceroller;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View view) {

        TextView tv1 = this.findViewById(R.id.userpoints);

        tv1.setText(Integer.toString(count));

        try{

        TextView tv = this.findViewById(R.id.numberTextView);
        Random r = new Random();
        int number = roll_the_dice();


        tv.setText(Integer.toString(number));

        EditText insertnumber = this.findViewById(R.id.insertnumber);

        TextView textView00 = this.findViewById(R.id.textView00);


      String puta = insertnumber.getText().toString();
      int insertnumber1 = Integer.parseInt(puta);



        if (number == insertnumber1) {
            textView00.setText("Congrats");
            count++;
        }
        else{
            textView00.setText("Please Try Again");
        }
    } catch (Exception e) {
        }
        }

    public int roll_the_dice() {

        Random r = new Random();
        int numberondice = r.nextInt(6);
        return numberondice;

    }

        public void buttonclick2(View view) {

            TextView tv2 = this.findViewById(R.id.mensagem);
            //tv2.setText(Integer.toString(numberondice));
            TextView mensagem = this.findViewById(R.id.mensagem);

            int r = roll_the_dice();

            if (r == 0) {
                mensagem.setText("If you could go anywhere in the world, where would you go?\n");}
            if (r == 1) {
                mensagem.setText("If you were stranded on a desert island, what three things would you want to take with you?\n");}
            if (r == 2) {
                mensagem.setText("If you could eat only one food for the rest of your life, what would that be?\n");}
            if (r == 3) {
                mensagem.setText("If you won a million dollars, what is the first thing you would buy?\n");}
            if (r == 4) {
                mensagem.setText("If you could spaned the day with one fictional character, who would it be?\n");}
            if (r == 5) {
                mensagem.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?\n");}
        }
    }
