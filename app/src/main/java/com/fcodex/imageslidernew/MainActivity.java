package com.fcodex.imageslidernew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2016/09/11/20/48/corn-1662551_960_720.jpg"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2014/02/12/18/11/lettuce-264826_960_720.jpg"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2014/09/09/19/07/corn-field-440338_960_720.jpg"));
        imageSlider.setImageList(slideModels, true);
        imageSlider.animate();
    }
}