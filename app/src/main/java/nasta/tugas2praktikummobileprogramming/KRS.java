package nasta.tugas2praktikummobileprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class KRS extends AppCompatActivity {
    public EditText Nim, Nama;
    public TextView txNim, txNama, txMatkul;
    public Button submit;
    public CheckBox Matkul1,Matkul2, Matkul3, Matkul4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs);

        txNim = (TextView)findViewById(R.id.textViewNIM);
        txNama = (TextView) findViewById(R.id.textViewNama);
        txMatkul = (TextView) findViewById(R.id.textViewMatkul);

        Nim = (EditText) findViewById(R.id.EdNIM);
        Nama = (EditText) findViewById(R.id.EdNamaa);
        Matkul1 = (CheckBox) findViewById(R.id.CbMP);
        Matkul2 = (CheckBox) findViewById(R.id.CbPMP);
        Matkul3 = (CheckBox) findViewById(R.id.CbPCD);
        Matkul4 = (CheckBox) findViewById(R.id.CbDM);
        submit = (Button) findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentform = new Intent(getApplicationContext(), HasilKRS.class);
                intentform.putExtra("txtnim", txNim.getText().toString());
                intentform.putExtra("txtnama", txNama.getText().toString());

                intentform.putExtra("nim",Nim.getText().toString());
                intentform.putExtra("nama", Nama.getText().toString());
                boolean checkstatus1 = Matkul1.isChecked();
                intentform.putExtra("status1", checkstatus1);
                startActivity(intentform);
            }
        });

    }
}
