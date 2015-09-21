package lifefit.com.lifefit;


import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private DrawerLayout drawerLayout;
    private ListView listView;
    private  String[] menu_drawer;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_drawer = getResources().getStringArray(R.array.menu_drawer);
        listView = (ListView)findViewById(R.id.left_drawer_list);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, menu_drawer));
        listView.setOnItemClickListener(this);
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
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        displayView(position);
    }

    private void displayView(int position) {
        switch (position) {
            case 0:
                intent = new Intent(this, Caminar.class);
                startActivity(intent);
                finish();
                break;
            case 1:
                intent = new Intent(this, Correr.class);
                startActivity(intent);
                finish();
                break;
            case 2:
                intent = new Intent(this, Bicicleta.class);
                startActivity(intent);
                finish();
                break;
        }
    }

}
