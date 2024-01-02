package aa.bb.demostatusbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.monmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.act1) {
Intent it = new Intent(getApplicationContext(),action2Activity.class);
startActivity(it);
        }
        else if (item.getItemId() == R.id.act2) {

        }
        else if (item.getItemId() == R.id.act3) {



    }
        else {
            finish();
        }
               return true;
     //          return super.onOptionsItemSelected(item);



  }
}