package activity.com.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TebakGambar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_gambar);

        Button next1 = (Button) findViewById(R.id.Button1);
        next1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LevelSatu.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next2 = (Button) findViewById(R.id.Button2);
        next2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LevelDua.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next3 = (Button) findViewById(R.id.Button3);
        next3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LevelTiga.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next4 = (Button) findViewById(R.id.Button4);
        next4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LevelEmpat.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next5 = (Button) findViewById(R.id.Button5);
        next5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LevelLima.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
