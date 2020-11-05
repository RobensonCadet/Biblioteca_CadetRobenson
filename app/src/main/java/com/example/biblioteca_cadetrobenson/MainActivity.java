package com.example.biblioteca_cadetrobenson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar Pb;
    private Button Bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pb = (ProgressBar)findViewById(R.id.pb);
        Bt = (Button) findViewById(R.id.btn);
        Pb.setVisibility(View.INVISIBLE);

        Bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                new Task().execute();
            }
        });
    }

    class Task extends AsyncTask<String, Void, String>
    {

        @Override
        protected void onPreExecute() {
            Pb.setVisibility(View.VISIBLE);

        }


        @Override
        protected String doInBackground(String... strings) {
            for(int i =1; i<=10; i++)
            {
                try {
                    Thread.sleep(1000);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {

            Pb.setVisibility(View.INVISIBLE);

        }


    }

    public void Hilo(View v)
    {
        for(int i = 1; i<=10; i++)
        {
            try {

                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public void Github(View v)
    {
        ArrayList<String> libros= new ArrayList<String>();


        libros.add("Farenheit");
        libros.add("Revival");
        libros.add("El Alquimista");

        Intent i = new Intent(this, Github_act.class);
        i.putExtra("listaLibros", libros);
        startActivity(i);
    }
}
