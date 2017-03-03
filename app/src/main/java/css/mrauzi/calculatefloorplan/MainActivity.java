package css.mrauzi.calculatefloorplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    TextView tvWidth, tvLength;
    EditText etWidth, etLength;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize variables
        tvWidth = (TextView) findViewById(R.id.textViewWidth);
        tvLength = (TextView) findViewById(R.id.textViewLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);
        btnResult = (Button) findViewById(R.id.buttonResult);

        /**
         * Creates button click to calculate the total flooring and send Intent to the
         * result activity.
         */
        btnResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double width = Double.parseDouble(etWidth.getText().toString());
                Double length = Double.parseDouble(etLength.getText().toString());
                // Calculates the total flooring
                Double total = width * length;
                // Clears the two EditText fields
                etWidth.setText("");
                etLength.setText("");

                // Intent to send flooring calculation to result activity
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                resultIntent.putExtra("Width", width);
                resultIntent.putExtra("Length", length);
                resultIntent.putExtra("Total", total);
                startActivity(resultIntent);

            }
        });

    }
}
