package com.theironyard.mycontacts;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText2;
    EditText editText;
    Button button;
    ListView listView;


    ArrayAdapter<String> items;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);

        items = new ArrayAdapter (this, android.R.layout.simple_list_item_1);
        listView.setAdapter(items);
        listView.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String item = editText.getText().toString();
        items.add(item);
        editText.setText("");
        String item2 = editText2.getText().toString();
        items.add(item);
        editText2.setText("");}



    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        String item = items.getItem(position);
        items.remove(item);
        return true;


    }
}
