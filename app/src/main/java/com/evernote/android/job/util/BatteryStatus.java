package com.evernote.android.job.util;

public final class BatteryStatus {
   public static final BatteryStatus DEFAULT = new BatteryStatus(false, 1.0F);
   private final boolean mCharging;
   private final float mBatteryPercent;

   BatteryStatus(boolean var1, float var2) {
      this.mCharging = var1;
      this.mBatteryPercent = var2;
   }

   public boolean isCharging() {
      return this.mCharging;
   }

   public boolean isBatteryLow() {
      return this.mBatteryPercent < 0.15F && !this.mCharging;
   }
}
