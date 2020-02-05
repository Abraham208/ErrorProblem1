package cardoza.mcm.edu.ph.errorproblem1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button button = findViewById(R.id.button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String txtfromspinner;

        spiner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        txtfromspinner = spiner.getSelectedItem().toString;
                    }
                }
        )
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtFromTxtbox = String.valueOf(txtbox.getText());

                        number = Integer.parseInt(String.valueOf(numbox.getText()));

                        Intent i  = new Intent(MainActivity.this, SecondActivity.class);

                        i.putExtra("TEXT",txtFromspinner);

                        startActivity(i);

                    }
                }
        );
    }

}
