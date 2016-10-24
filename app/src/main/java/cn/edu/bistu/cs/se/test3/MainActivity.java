package cn.edu.bistu.cs.se.test3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which radio button was clicked
    }

    public void onCheckboxClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        boolean isChecked = checkBox.isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);
        switch (view.getId()){
            case R.id.Chinese:
                if(isChecked){
                    Toast.makeText(MainActivity.this,"Choose Chinese",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Don't choose Chinese",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.Japan:
                if(isChecked){
                    Toast.makeText(MainActivity.this,"Choose Japan",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Don't choose Japan",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.English:
                if (isChecked){
                    Toast.makeText(MainActivity.this,"Choose English",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Don't choose English",Toast.LENGTH_LONG).show();
                }
                break;
        }
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
}
