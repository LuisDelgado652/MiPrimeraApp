package facci.luisdelgado.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private EditText entradaFa;
    private TextView resultadoFa;
    private Button convertirFa;
    private EditText entradaCe;
    private TextView resultadoCe;
    private Button convertirCe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String idioma = Locale.getDefault().getLanguage();


        if(idioma=="es") {
            setContentView(R.layout.activity_main_es);
        }else{
            setContentView(R.layout.activity_main);
        }


        entradaFa = (EditText) findViewById(R.id.entradaFah);
        resultadoFa =(TextView) findViewById(R.id.resultadoFah);
        convertirFa =(Button) findViewById(R.id.convertirFah);

        entradaCe = (EditText) findViewById(R.id.entradaCel);
        resultadoCe =(TextView) findViewById(R.id.resultadoCel);
        convertirCe =(Button) findViewById(R.id.convertirAcelcius);

        convertirFa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String var = null;
                Double num = null;
                Double resultante = null;
                var = entradaFa.getText().toString();
                num = Double.parseDouble(var);
                resultante = (num-32)/(1.8);
                resultadoFa.setText(resultante.toString());

                Log.e("valor",resultante.toString());

            }
        });
        convertirCe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String var = null;
                Double num = null;
                Double resultante = null;
                var = entradaCe.getText().toString();
                num = Double.parseDouble(var);
                resultante = (num*1.8)+(32);
                resultadoCe.setText(resultante.toString());

                Log.e("valor",resultante.toString());

            }
        });

        Log.e("MainActivity","Luis Delgado");

    }
}