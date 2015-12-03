package app.com.example.android.project0;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    Show appropriate toast when the button is clicked
    public void showToast(View v) {
        Context context = getApplicationContext();
        String text = "Nothing Clicked";
        int duration = Toast.LENGTH_SHORT;

        switch (v.getId()){
            case R.id.spotify_streamer_button:
                text = "This button will launch the \"Spotify Streamer\" app";
                break;

            case R.id.scores_app_button:
                text = "This button will launch the \"Super Duo (2 buttons: Football Scores App and Library App)\" ";
                break;

            case R.id.library_app_button:
                text = "This button will launch the \"Library\" app";
                break;

            case R.id.build_it_bigger_button:
                text = "This button will launch the \"Build It Bigger\" app";
                break;

            case R.id.xyz_reader_button:
                text = "This button will launch the \"XYZ Reader\" app";
                break;

            case R.id.capstone_project_button:
                text = "This button will launch my Capstone app!";
                break;

            default:
                break;
        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
