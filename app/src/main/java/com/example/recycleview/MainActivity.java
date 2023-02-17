package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> my_list = new ArrayList<>();
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv1);

        my_list.add(new Contact("Hakimova Zilola", "+998912223344", R.drawable.user01));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user02));
        my_list.add(new Contact("Najmiddinov Abdulaziz", "+998912223344", R.drawable.user03));
        my_list.add(new Contact("Hasanova Malika", "+998912223344", R.drawable.user04));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user05));
        my_list.add(new Contact("Hsanov Husan", "+998912223344", R.drawable.user06));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user07));
        my_list.add(new Contact("Hakimova Zilola", "+998912223344", R.drawable.user01));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user02));
        my_list.add(new Contact("Najmiddinov Abdulaziz", "+998912223344", R.drawable.user03));
        my_list.add(new Contact("Hasanova Malika", "+998912223344", R.drawable.user04));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user05));
        my_list.add(new Contact("Hsanov Husan", "+998912223344", R.drawable.user06));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user07));
        my_list.add(new Contact("Hakimova Zilola", "+998912223344", R.drawable.user01));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user02));
        my_list.add(new Contact("Najmiddinov Abdulaziz", "+998912223344", R.drawable.user03));
        my_list.add(new Contact("Hasanova Malika", "+998912223344", R.drawable.user04));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user05));
        my_list.add(new Contact("Hsanov Husan", "+998912223344", R.drawable.user06));
        my_list.add(new Contact("Aliyev Valijon", "+998912223344", R.drawable.user07));

        ContactAdapter adapter = new ContactAdapter(my_list);

        rv.setAdapter(adapter);


    }
}