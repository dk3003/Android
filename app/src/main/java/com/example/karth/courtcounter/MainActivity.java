import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.karth.courtcounter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team);
        scoreView.setText(String.valueOf(score));
    }

    public void display3(View v) {
        displayForTeamA(3);
    }

    public void display2(View v) {
        displayForTeamA(2);
    }

    public void display1(View v) {
        displayForTeamA(1);
    }
}