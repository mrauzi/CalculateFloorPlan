package css.mrauzi.calculatefloorplan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    // Declare Variables
    TextView tvResult;
    Double width;
    Double length;
    Double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Initialize the result TextView field
        tvResult = (TextView)findViewById(R.id.textViewResult);

        // Un-bundle the data from the Intent
        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("Width");
        length = extras.getDouble("Length");
        total = extras.getDouble("Total");

        // Set the TextView field to the calculation results
        tvResult.setText("Width is " + width + " and Length is " + length + " and flooring needed is " + total);
    }
}
