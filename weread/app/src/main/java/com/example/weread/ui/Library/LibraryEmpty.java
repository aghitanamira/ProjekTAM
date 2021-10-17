package com.example.weread.ui.Library;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.weread.R;
import com.example.weread.adapter.AdapterRecyclerView;

import java.util.ArrayList;

public class LibraryEmpty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_empty);
        RecyclerView recyclerView;
        AdapterRecyclerView adapterRecyclerView;
        RecyclerView.LayoutManager layoutManager;

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        int [] image = {
                R.drawable.dr_anarrative, R.drawable.dr_hujan, R.drawable.dr_renungan_pagi,
                R.drawable.dr_sebatas_mimpi, R.drawable.dr_the_spine
        };

        adapterRecyclerView = new AdapterRecyclerView(image);
        recyclerView.setAdapter(adapterRecyclerView);

    }
}