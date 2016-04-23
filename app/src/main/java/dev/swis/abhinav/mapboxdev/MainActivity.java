package dev.swis.abhinav.mapboxdev;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mapbox.mapboxsdk.tileprovider.tilesource.MapboxTileLayer;
import com.mapbox.mapboxsdk.tileprovider.tilesource.WebSourceTileLayer;
import com.mapbox.mapboxsdk.views.MapView;

public class MainActivity extends AppCompatActivity {
    private String mapTilesUrl = "http://swisapp.co:8080/_/{z}/{x}/{y}" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapView mapView = new MapView(this);
        mapView.setAccessToken("asdasdasdasdasd");
        mapView.setTileSource(new MapboxTileLayer("_"));
        this.setContentView(mapView);
    }


}
