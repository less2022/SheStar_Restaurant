package com.ugb.shestarrestaurant.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ugb.shestarrestaurant.R;
import com.ugb.shestarrestaurant.adapters.DailyMealAdapter;
import com.ugb.shestarrestaurant.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.dayli_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Desayunos", "10% OFF", "Description Description","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Almuerzos", "20% OFF", "Description Description","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Cenas", "30% OFF", "Description Description","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Postres", "50% OFF", "Description Description","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffee, "Coffe", "30% OFF", "Description Description","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }


}