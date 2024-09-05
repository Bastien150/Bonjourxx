package fr.forestba.a02bonjourxxx;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView TVhello;
    TextView textView;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.inputText);
        TVhello = (TextView) findViewById(R.id.TVhello);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void updateText (View view){
        if (TextUtils.isEmpty(inputText.getText())){
            inputText.setError("Veuillez entrez Votre nom !");
            textView.setVisibility(View.VISIBLE);
        } else {
            TVhello.setText("Bonjour "+ inputText.getText() +" !");
            Toast.makeText(this, "\"Bienvenue "+ inputText.getText() +" !\"", Toast.LENGTH_SHORT).show();
            textView.setVisibility(View.INVISIBLE);
        }
    }
}