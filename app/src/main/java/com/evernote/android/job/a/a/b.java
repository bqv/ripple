package com.evernote.android.job.a.a;

import com.evernote.android.job.a.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
   private static final d a = new d("PersistableBundleCompat");
   private final Map b;

   public b() {
      this((Map)(new HashMap()));
   }

   public b(b var1) {
      this((Map)(new HashMap(var1.b)));
   }

   private b(Map var1) {
      this.b = var1;
   }

   public static b a(String param0) {
      // $FF: Couldn't be decompiled
   }

   public String a() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         c.a((Map)this.b, (OutputStream)var1);
         String var2 = var1.toString("UTF-8");
         return var2;
      } catch (IOException | XmlPullParserException var11) {
         a.a((Throwable)var11);
      } catch (Error var12) {
         a.a((Throwable)var12);
         return "";
      } finally {
         try {
            var1.close();
         } catch (IOException var10) {
         }

      }

      return "";
   }

   public void a(String var1, int var2) {
      this.b.put(var1, var2);
   }

   public void a(String var1, String var2) {
      this.b.put(var1, var2);
   }

   public int b(String var1, int var2) {
      Object var3 = this.b.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : var2;
   }

   public String b(String var1, String var2) {
      Object var3 = this.b.get(var1);
      return var3 instanceof String ? (String)var3 : var2;
   }
}
