package com.example.usuario.adapters;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


/**
 *
 

*/

public class GridViewActivity extends ActionBarActivity
{

   
 String[] mDatos;
  
  GridView mGridView;
    
TextView mTextView;

   
 @Override
  
  protected void onCreate(Bundle savedInstanceState) {
   
     super.onCreate(savedInstanceState);
       
 setContentView(R.layout.gridview_layout);


    
    mDatos = getResources().getStringArray(R.array.datos);
       
 mTextView = (TextView) findViewById(R.id.textView);
       
 mGridView = (GridView) findViewById(R.id.gridView);


/* GridView */
     
 ArrayAdapter<String> mMensaje = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatos);
      
  mGridView.setAdapter(mMensaje);
/* Escucha Items GridView */
   
     mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 
 String seleccionadoString = getResources().getString(R.string.select) + mDatos[position];
  
 Toast.makeText(getApplicationContext(), seleccionadoString, Toast.LENGTH_SHORT).show();
  
          }
        });
    }
}
