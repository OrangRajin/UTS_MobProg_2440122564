package com.example.jawaban_uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Page_2 extends AppCompatActivity {

    private ListView mListView;
    private String[] user = {"Andi", "Budi", "Cantik", "Dara", "Elois"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mListView =findViewById(R.id.listView_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, user
        );
        mListView.setAdapter(adapter);
        registerForContextMenu(mListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.android_menu, menu);
        menu.setHeaderTitle("Select Action");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.change){
            Toast.makeText(this, "Change Number", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()== R.id.call){
            Toast.makeText(this, "Call", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()== R.id.delete) {
            Toast.makeText(this, "Delete Number", Toast.LENGTH_SHORT).show();
        }else{
            return false;
        }
     return true;
    }
}