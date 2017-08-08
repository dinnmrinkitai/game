package activity.com.game;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class HalamanPertama extends AppCompatActivity implements View.OnClickListener {
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_pertama);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        Button next1 = (Button) findViewById(R.id.Button1);
        next1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), TebakGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next2 = (ImageButton) findViewById(R.id.webview);
        next2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Assalaam.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        HalamanPertama.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        //TODO Auto-generated method stub dialog.cancel();
                    }
                }).show();

    }
}
