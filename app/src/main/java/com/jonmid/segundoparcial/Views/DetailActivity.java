package com.jonmid.segundoparcial.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.jonmid.segundoparcial.Adapter.TeamAdapterOlivaCristian;
import com.jonmid.segundoparcial.Model.TeamModelOlivaCristian;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;

import java.util.List;

public class DetailActivity extends AppCompatActivity {


    ProgressBar progressBar;
    RecyclerView recyclerView;
    List<TeamModelOlivaCristian> teamModelOlivaCristianList;
    TeamAdapterOlivaCristian teamAdapterOlivaCristian;
    ImageView imageView;
    TextView textView;
    TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bund = getIntent().getExtras();
        progressBar = (ProgressBar) findViewById(R.id.id_pb_progressbar);
        recyclerView = (RecyclerView) findViewById(R.id.id_rv_recyclerview);
        imageView = (ImageView) findViewById(R.id.id_img_item_detail);
        textView = (TextView) findViewById(R.id.id_tv_namedetail);
        textView2 = (TextView) findViewById(R.id.id_tv_codedetail);
        textView.setText(bund.getString("name"));
        textView.setText(bund.getString("code"));







        progressBar = (ProgressBar) findViewById(R.id.id_pb_progressbar);
        recyclerView = (RecyclerView) findViewById(R.id.id_rv_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //loadData();
    }


    public void regesar(View view) {

        Intent a = new Intent(getApplicationContext(), TeamActivity.class);
        startActivity(a);
    }


}

