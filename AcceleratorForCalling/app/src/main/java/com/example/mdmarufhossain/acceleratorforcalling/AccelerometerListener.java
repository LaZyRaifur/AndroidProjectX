package com.example.Raifurrahim.acceleratorforcalling;

/**
 * Created by Raifurrahim on 8/26/2017.
 */
public interface AccelerometerListener {
   public void onShake(float force);

   public void onAccelerationChanged(float x, float y, float z);
}
