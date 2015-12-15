package app.com.example.android.project0;

import android.content.Context;
import android.content.res.Resources;
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

        Resources res = getResources();

        switch (v.getId()){
            case R.id.spotify_streamer_button:
                text = res.getString(R.string.spotify_streamer_toast_text);
                break;

            case R.id.scores_app_button:
                text = res.getString(R.string.scores_app_toast_text);
                break;

            case R.id.library_app_button:
                text = res.getString(R.string.library_app_toast_text);
                break;

            case R.id.build_it_bigger_button:
                text = res.getString(R.string.build_it_bigger_toast_text);
                break;

            case R.id.xyz_reader_button:
                text = res.getString(R.string.xyz_reader_toast_text);
                break;

            case R.id.capstone_project_button:
                text = res.getString(R.string.capstone_project_toast_text);
                break;

            default:
                break;
        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
