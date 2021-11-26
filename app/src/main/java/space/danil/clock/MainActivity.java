package space.danil.clock;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEd,passEd;
    private Button loginBtn;
    private String login = "test@mail.ru";
    private String password = "test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emailEd.getText().toString().equals(login)&&passEd.getText().toString().equals(password)) {
                    Intent i = new Intent(MainActivity.this, MainScreen.class);
                    startActivity(i);
                    finish();
                }else if (emailEd.getText().toString().isEmpty() || passEd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Проверьте пустые поля данных", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Проверьте проверте правильность данных", Toast.LENGTH_LONG).show();
                }
            }
        });





    }


     private void init(){
        loginBtn = findViewById(R.id.logInBtn);
        emailEd = findViewById(R.id.emailEd);
        passEd = findViewById(R.id.passEd);
    }
}