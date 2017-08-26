package com.example.mdmarufhossain.acceleratorforcalling;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity implements AccelerometerListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onAccelerationChanged(float x,float y,float z){

    }

    public void onShake(float force){
        Toast.makeText(getBaseContext(),"Motion Detected",Toast.LENGTH_SHORT).show();

        String phone = "01681095485";
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.fromParts("tel",phone,null));
        startActivity(intent);

    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(),"onResume Accelerometer Started",Toast.LENGTH_SHORT).show();

       if (AccelerometerManager.isSupported(this)){

        AccelerometerManager.startListening(this);}
    }


    @Override
    protected void onStop() {
        super.onStop();
        if (AccelerometerManager.isListening()){

            AccelerometerManager.stopListening();

            Toast.makeText(getBaseContext(),"onStop Accerlerometer Stoped",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Senor","Service distroy");

        if(AccelerometerManager.isListening()){
            AccelerometerManager.stopListening();

            Toast.makeText(getBaseContext(),"OnDestroy Accelerometer Stopped",Toast.LENGTH_SHORT).show();
        }
    }
}
