package nasta.tugas2praktikummobileprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilKRS extends AppCompatActivity {
    public TextView tekshasil;
    public TextView tekshasil2;
    public String result;
    public String result2;
    public Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_krs);

        tekshasil = (TextView) findViewById(R.id.txhasil1);
        tekshasil2 = (TextView) findViewById(R.id.txhasil2);

        back = (Button) findViewById(R.id.btnback);
        Intent intentget = getIntent();
        Bundle bundle = intentget.getExtras();
        String txtnim = bundle.getString("txtnim");
        String txtnama = bundle.getString("txtnama");

        String nama = bundle.getString("nama");
        String nim = bundle.getString("nim");

        String matkulone = bundle.getString("status1");

        result = txtnim + "\n" + txtnama;
        result2 = nim + "\n" + nama;

        tekshasil.setText(result);
        tekshasil2.setText(result2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(HasilKRS.this, KRS.class);
                startActivity(pindah);
            }
        });

    }
}
