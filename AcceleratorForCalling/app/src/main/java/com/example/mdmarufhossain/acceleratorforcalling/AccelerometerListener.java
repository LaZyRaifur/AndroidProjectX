package com.example.mdmarufhossain.acceleratorforcalling;

/**
 * Created by Md.Maruf Hossain on 8/26/2017.
 */
public interface AccelerometerListener {
   public void onShake(float force);

   public void onAccelerationChanged(float x, float y, float z);
}
