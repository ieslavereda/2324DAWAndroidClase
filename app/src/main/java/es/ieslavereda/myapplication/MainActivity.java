package es.ieslavereda.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonManolo;
    private Button buttonJuan;
    private TextView textView;
    private ToggleButton tbChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_evento);

        buttonManolo = findViewById(R.id.btnEjemplo);
        buttonJuan = findViewById(R.id.btnEjemplo2);
        textView = findViewById(R.id.txtViewEjemplo);
        tbChecked = findViewById(R.id.tbChecked);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button.setText("Manolo");
//            }
//        });
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button.setText("Button");
//            }
//        });
        buttonManolo.setOnClickListener(this);
        buttonJuan.setOnClickListener(this);
        textView.setOnClickListener(this);

        tbChecked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                textView.setText(String.valueOf(b));
            }
        });

    }

    @Override
    public void onClick(View view) {

       if(view.getId()==R.id.btnEjemplo)
           textView.setText("Manolo");
       else if (view.getId() == R.id.btnEjemplo2)
           textView.setText("Juan");
       else
           textView.setText("Desconocido");

    }
}