package nasta.tugas2praktikummobileprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public EditText edUsername, edPassword;
    public Button login, batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    private void initUI() {
        edUsername = (EditText) findViewById(R.id.EdUsername);
        edUsername.getText();
        edPassword = (EditText) findViewById(R.id.EdPassword);
        edPassword.getText();
        login = (Button) findViewById(R.id.btnLogin);
        batal = (Button) findViewById(R.id.btnBatal);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == login) {
                    if (edUsername.getText().toString().equals("admin") &&
                            edPassword.getText().toString().equals("admin")) {
                        Intent pindah = new Intent(Login.this, KRS.class);
                        startActivity(pindah);

                    } else
                        Toast.makeText(Login.this, "login gagal", Toast.LENGTH_LONG).show();
                }
            }

        });
        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edUsername.setText("");
                edPassword.setText("");
            }

        });
    }
}
