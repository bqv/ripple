package com.evernote.android.job.a.a;

import android.util.Xml;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

final class c {
   private static final Object a(XmlPullParser var0, String var1) {
      StringBuilder var4;
      try {
         if (var1.equals("int")) {
            return Integer.parseInt(var0.getAttributeValue((String)null, "value"));
         } else if (var1.equals("long")) {
            return Long.valueOf(var0.getAttributeValue((String)null, "value"));
         } else if (var1.equals("float")) {
            return Float.valueOf(var0.getAttributeValue((String)null, "value"));
         } else if (var1.equals("double")) {
            return Double.valueOf(var0.getAttributeValue((String)null, "value"));
         } else if (var1.equals("boolean")) {
            Boolean var5 = Boolean.valueOf(var0.getAttributeValue((String)null, "value"));
            return var5;
         } else {
            return null;
         }
      } catch (NullPointerException var2) {
         var4 = new StringBuilder();
         var4.append("Need value attribute in <");
         var4.append(var1);
         var4.append(">");
         throw new XmlPullParserException(var4.toString());
      } catch (NumberFormatException var3) {
         var4 = new StringBuilder();
         var4.append("Not a number in value attribute in <");
         var4.append(var1);
         var4.append(">");
         throw new XmlPullParserException(var4.toString());
      }
   }

   public static final Object a(XmlPullParser var0, String[] var1) {
      int var2 = var0.getEventType();

      int var3;
      do {
         if (var2 == 2) {
            return a((XmlPullParser)var0, (String[])var1, (c.a)null);
         }

         StringBuilder var4;
         if (var2 == 3) {
            var4 = new StringBuilder();
            var4.append("Unexpected end tag at: ");
            var4.append(var0.getName());
            throw new XmlPullParserException(var4.toString());
         }

         if (var2 == 4) {
            var4 = new StringBuilder();
            var4.append("Unexpected text: ");
            var4.append(var0.getText());
            throw new XmlPullParserException(var4.toString());
         }

         var3 = var0.next();
         var2 = var3;
      } while(var3 != 1);

      throw new XmlPullParserException("Unexpected end of document");
   }

   private static final Object a(XmlPullParser var0, String[] var1, c.a var2) {
      Object var3 = null;
      String var4 = var0.getAttributeValue((String)null, "name");
      String var5 = var0.getName();
      int var6;
      StringBuilder var7;
      StringBuilder var9;
      Object var13;
      if (var5.equals("null")) {
         var13 = var3;
      } else {
         if (var5.equals("string")) {
            String var17 = "";

            while(true) {
               var6 = var0.next();
               if (var6 == 1) {
                  throw new XmlPullParserException("Unexpected end of document in <string>");
               }

               if (var6 == 3) {
                  if (var0.getName().equals("string")) {
                     var1[0] = var4;
                     return var17;
                  }

                  var9 = new StringBuilder();
                  var9.append("Unexpected end tag in <string>: ");
                  var9.append(var0.getName());
                  throw new XmlPullParserException(var9.toString());
               }

               if (var6 == 4) {
                  StringBuilder var19 = new StringBuilder();
                  var19.append(var17);
                  var19.append(var0.getText());
                  var17 = var19.toString();
               } else if (var6 == 2) {
                  var9 = new StringBuilder();
                  var9.append("Unexpected start tag in <string>: ");
                  var9.append(var0.getName());
                  throw new XmlPullParserException(var9.toString());
               }
            }
         }

         var3 = a(var0, var5);
         if (var3 == null) {
            if (var5.equals("int-array")) {
               int[] var18 = d(var0, "int-array", var1);
               var1[0] = var4;
               return var18;
            }

            if (var5.equals("long-array")) {
               long[] var16 = e(var0, "long-array", var1);
               var1[0] = var4;
               return var16;
            }

            if (var5.equals("double-array")) {
               double[] var15 = f(var0, "double-array", var1);
               var1[0] = var4;
               return var15;
            }

            if (var5.equals("string-array")) {
               String[] var14 = g(var0, "string-array", var1);
               var1[0] = var4;
               return var14;
            }

            if (var5.equals("map")) {
               var0.next();
               HashMap var12 = a(var0, "map", var1);
               var1[0] = var4;
               return var12;
            }

            if (var5.equals("list")) {
               var0.next();
               ArrayList var11 = b(var0, "list", var1);
               var1[0] = var4;
               return var11;
            }

            if (var5.equals("set")) {
               var0.next();
               HashSet var10 = c(var0, "set", var1);
               var1[0] = var4;
               return var10;
            }

            if (var2 != null) {
               Object var8 = var2.a(var0, var5);
               var1[0] = var4;
               return var8;
            }

            var7 = new StringBuilder();
            var7.append("Unknown tag: ");
            var7.append(var5);
            throw new XmlPullParserException(var7.toString());
         }

         var13 = var3;
      }

      do {
         var6 = var0.next();
         if (var6 == 1) {
            var7 = new StringBuilder();
            var7.append("Unexpected end of document in <");
            var7.append(var5);
            var7.append(">");
            throw new XmlPullParserException(var7.toString());
         }

         if (var6 == 3) {
            if (var0.getName().equals(var5)) {
               var1[0] = var4;
               return var13;
            }

            var9 = new StringBuilder();
            var9.append("Unexpected end tag in <");
            var9.append(var5);
            var9.append(">: ");
            var9.append(var0.getName());
            throw new XmlPullParserException(var9.toString());
         }

         if (var6 == 4) {
            var9 = new StringBuilder();
            var9.append("Unexpected text in <");
            var9.append(var5);
            var9.append(">: ");
            var9.append(var0.getName());
            throw new XmlPullParserException(var9.toString());
         }
      } while(var6 != 2);

      var9 = new StringBuilder();
      var9.append("Unexpected start tag in <");
      var9.append(var5);
      var9.append(">: ");
      var9.append(var0.getName());
      throw new XmlPullParserException(var9.toString());
   }

   public static final HashMap a(InputStream var0) {
      XmlPullParser var1 = Xml.newPullParser();
      var1.setInput(var0, (String)null);
      return (HashMap)a(var1, new String[1]);
   }

   public static final HashMap a(XmlPullParser var0, String var1, String[] var2) {
      return a((XmlPullParser)var0, var1, (String[])var2, (c.a)null);
   }

   public static final HashMap a(XmlPullParser var0, String var1, String[] var2, c.a var3) {
      HashMap var4 = new HashMap();
      int var5 = var0.getEventType();

      int var7;
      do {
         if (var5 == 2) {
            Object var6 = a(var0, var2, var3);
            var4.put(var2[0], var6);
         } else if (var5 == 3) {
            if (var0.getName().equals(var1)) {
               return var4;
            }

            StringBuilder var9 = new StringBuilder();
            var9.append("Expected ");
            var9.append(var1);
            var9.append(" end tag at: ");
            var9.append(var0.getName());
            throw new XmlPullParserException(var9.toString());
         }

         var7 = var0.next();
         var5 = var7;
      } while(var7 != 1);

      StringBuilder var8 = new StringBuilder();
      var8.append("Document ended before ");
      var8.append(var1);
      var8.append(" end tag");
      throw new XmlPullParserException(var8.toString());
   }

   public static final void a(Object var0, String var1, XmlSerializer var2) {
      a((Object)var0, var1, (XmlSerializer)var2, (c.b)null);
   }

   private static final void a(Object var0, String var1, XmlSerializer var2, c.b var3) {
      if (var0 == null) {
         var2.startTag((String)null, "null");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         var2.endTag((String)null, "null");
      } else if (var0 instanceof String) {
         var2.startTag((String)null, "string");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         var2.text(var0.toString());
         var2.endTag((String)null, "string");
      } else {
         String var5;
         if (var0 instanceof Integer) {
            var5 = "int";
         } else if (var0 instanceof Long) {
            var5 = "long";
         } else if (var0 instanceof Float) {
            var5 = "float";
         } else if (var0 instanceof Double) {
            var5 = "double";
         } else {
            if (!(var0 instanceof Boolean)) {
               if (var0 instanceof byte[]) {
                  a((byte[])var0, var1, var2);
                  return;
               }

               if (var0 instanceof int[]) {
                  a((int[])var0, var1, var2);
                  return;
               }

               if (var0 instanceof long[]) {
                  a((long[])var0, var1, var2);
                  return;
               }

               if (var0 instanceof double[]) {
                  a((double[])var0, var1, var2);
                  return;
               }

               if (var0 instanceof String[]) {
                  a((String[])var0, var1, var2);
                  return;
               }

               if (var0 instanceof Map) {
                  a((Map)var0, var1, var2);
                  return;
               }

               if (var0 instanceof List) {
                  a((List)var0, var1, var2);
                  return;
               }

               if (var0 instanceof Set) {
                  a((Set)var0, var1, var2);
                  return;
               }

               if (var0 instanceof CharSequence) {
                  var2.startTag((String)null, "string");
                  if (var1 != null) {
                     var2.attribute((String)null, "name", var1);
                  }

                  var2.text(var0.toString());
                  var2.endTag((String)null, "string");
                  return;
               }

               if (var3 != null) {
                  var3.a(var0, var1, var2);
                  return;
               }

               StringBuilder var4 = new StringBuilder();
               var4.append("writeValueXml: unable to write value ");
               var4.append(var0);
               throw new RuntimeException(var4.toString());
            }

            var5 = "boolean";
         }

         var2.startTag((String)null, var5);
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         var2.attribute((String)null, "value", var0.toString());
         var2.endTag((String)null, var5);
      }
   }

   public static final void a(List var0, String var1, XmlSerializer var2) {
      String var5;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var5 = "null";
      } else {
         var2.startTag((String)null, "list");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            a((Object)var0.get(var4), (String)null, (XmlSerializer)var2);
         }

         var5 = "list";
      }

      var2.endTag((String)null, var5);
   }

   public static final void a(Map var0, OutputStream var1) {
      com.evernote.android.job.a.a.a var2 = new com.evernote.android.job.a.a.a();
      var2.setOutput(var1, "utf-8");
      var2.startDocument((String)null, true);
      var2.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
      a((Map)var0, (String)null, (XmlSerializer)var2);
      var2.endDocument();
   }

   public static final void a(Map var0, String var1, XmlSerializer var2) {
      a((Map)var0, var1, (XmlSerializer)var2, (c.b)null);
   }

   public static final void a(Map var0, String var1, XmlSerializer var2, c.b var3) {
      String var4;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var4 = "null";
      } else {
         var2.startTag((String)null, "map");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         a(var0, var2, var3);
         var4 = "map";
      }

      var2.endTag((String)null, var4);
   }

   public static final void a(Map var0, XmlSerializer var1, c.b var2) {
      if (var0 != null) {
         Iterator var3 = var0.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            a(var4.getValue(), (String)var4.getKey(), var1, var2);
         }

      }
   }

   public static final void a(Set var0, String var1, XmlSerializer var2) {
      String var3;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var3 = "null";
      } else {
         var2.startTag((String)null, "set");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            a((Object)var4.next(), (String)null, (XmlSerializer)var2);
         }

         var3 = "set";
      }

      var2.endTag((String)null, var3);
   }

   public static final void a(byte[] var0, String var1, XmlSerializer var2) {
      String var7;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var7 = "null";
      } else {
         var2.startTag((String)null, "byte-array");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.length;
         var2.attribute((String)null, "num", Integer.toString(var3));
         StringBuilder var8 = new StringBuilder(var0.length * 2);

         for(int var4 = 0; var4 < var3; ++var4) {
            byte var5 = var0[var4];
            int var6 = var5 >> 4;
            if (var6 >= 10) {
               var6 = var6 + 97 - 10;
            } else {
               var6 += 48;
            }

            var8.append(var6);
            var6 = var5 & 255;
            if (var6 >= 10) {
               var6 = var6 + 97 - 10;
            } else {
               var6 += 48;
            }

            var8.append(var6);
         }

         var2.text(var8.toString());
         var7 = "byte-array";
      }

      var2.endTag((String)null, var7);
   }

   public static final void a(double[] var0, String var1, XmlSerializer var2) {
      String var5;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var5 = "null";
      } else {
         var2.startTag((String)null, "double-array");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.length;
         var2.attribute((String)null, "num", Integer.toString(var3));

         for(int var4 = 0; var4 < var3; ++var4) {
            var2.startTag((String)null, "item");
            var2.attribute((String)null, "value", Double.toString(var0[var4]));
            var2.endTag((String)null, "item");
         }

         var5 = "double-array";
      }

      var2.endTag((String)null, var5);
   }

   public static final void a(int[] var0, String var1, XmlSerializer var2) {
      String var5;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var5 = "null";
      } else {
         var2.startTag((String)null, "int-array");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.length;
         var2.attribute((String)null, "num", Integer.toString(var3));

         for(int var4 = 0; var4 < var3; ++var4) {
            var2.startTag((String)null, "item");
            var2.attribute((String)null, "value", Integer.toString(var0[var4]));
            var2.endTag((String)null, "item");
         }

         var5 = "int-array";
      }

      var2.endTag((String)null, var5);
   }

   public static final void a(long[] var0, String var1, XmlSerializer var2) {
      String var5;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var5 = "null";
      } else {
         var2.startTag((String)null, "long-array");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.length;
         var2.attribute((String)null, "num", Integer.toString(var3));

         for(int var4 = 0; var4 < var3; ++var4) {
            var2.startTag((String)null, "item");
            var2.attribute((String)null, "value", Long.toString(var0[var4]));
            var2.endTag((String)null, "item");
         }

         var5 = "long-array";
      }

      var2.endTag((String)null, var5);
   }

   public static final void a(String[] var0, String var1, XmlSerializer var2) {
      String var5;
      if (var0 == null) {
         var2.startTag((String)null, "null");
         var5 = "null";
      } else {
         var2.startTag((String)null, "string-array");
         if (var1 != null) {
            var2.attribute((String)null, "name", var1);
         }

         int var3 = var0.length;
         var2.attribute((String)null, "num", Integer.toString(var3));

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var0[var4] == null) {
               var2.startTag((String)null, "null");
               var1 = "null";
            } else {
               var2.startTag((String)null, "item");
               var2.attribute((String)null, "value", var0[var4]);
               var1 = "item";
            }

            var2.endTag((String)null, var1);
         }

         var5 = "string-array";
      }

      var2.endTag((String)null, var5);
   }

   public static final ArrayList b(XmlPullParser var0, String var1, String[] var2) {
      return b(var0, var1, var2, (c.a)null);
   }

   private static final ArrayList b(XmlPullParser var0, String var1, String[] var2, c.a var3) {
      ArrayList var4 = new ArrayList();
      int var5 = var0.getEventType();

      int var6;
      do {
         if (var5 == 2) {
            var4.add(a(var0, var2, var3));
         } else if (var5 == 3) {
            if (var0.getName().equals(var1)) {
               return var4;
            }

            StringBuilder var8 = new StringBuilder();
            var8.append("Expected ");
            var8.append(var1);
            var8.append(" end tag at: ");
            var8.append(var0.getName());
            throw new XmlPullParserException(var8.toString());
         }

         var6 = var0.next();
         var5 = var6;
      } while(var6 != 1);

      StringBuilder var7 = new StringBuilder();
      var7.append("Document ended before ");
      var7.append(var1);
      var7.append(" end tag");
      throw new XmlPullParserException(var7.toString());
   }

   public static final HashSet c(XmlPullParser var0, String var1, String[] var2) {
      return c(var0, var1, var2, (c.a)null);
   }

   private static final HashSet c(XmlPullParser var0, String var1, String[] var2, c.a var3) {
      HashSet var4 = new HashSet();
      int var5 = var0.getEventType();

      int var6;
      do {
         if (var5 == 2) {
            var4.add(a(var0, var2, var3));
         } else if (var5 == 3) {
            if (var0.getName().equals(var1)) {
               return var4;
            }

            StringBuilder var8 = new StringBuilder();
            var8.append("Expected ");
            var8.append(var1);
            var8.append(" end tag at: ");
            var8.append(var0.getName());
            throw new XmlPullParserException(var8.toString());
         }

         var6 = var0.next();
         var5 = var6;
      } while(var6 != 1);

      StringBuilder var7 = new StringBuilder();
      var7.append("Document ended before ");
      var7.append(var1);
      var7.append(" end tag");
      throw new XmlPullParserException(var7.toString());
   }

   public static final int[] d(XmlPullParser var0, String var1, String[] var2) {
      int var3;
      try {
         var3 = Integer.parseInt(var0.getAttributeValue((String)null, "num"));
      } catch (NullPointerException var9) {
         throw new XmlPullParserException("Need num attribute in byte-array");
      } catch (NumberFormatException var10) {
         throw new XmlPullParserException("Not a number in num attribute in byte-array");
      }

      var0.next();
      int[] var13 = new int[var3];
      int var4 = 0;
      var3 = var0.getEventType();

      int var6;
      do {
         int var5;
         if (var3 == 2) {
            if (!var0.getName().equals("item")) {
               StringBuilder var12 = new StringBuilder();
               var12.append("Expected item tag at: ");
               var12.append(var0.getName());
               throw new XmlPullParserException(var12.toString());
            }

            try {
               var13[var4] = Integer.parseInt(var0.getAttributeValue((String)null, "value"));
            } catch (NullPointerException var7) {
               throw new XmlPullParserException("Need value attribute in item");
            } catch (NumberFormatException var8) {
               throw new XmlPullParserException("Not a number in value attribute in item");
            }

            var5 = var4;
         } else {
            var5 = var4;
            if (var3 == 3) {
               if (var0.getName().equals(var1)) {
                  return var13;
               }

               if (!var0.getName().equals("item")) {
                  StringBuilder var14 = new StringBuilder();
                  var14.append("Expected ");
                  var14.append(var1);
                  var14.append(" end tag at: ");
                  var14.append(var0.getName());
                  throw new XmlPullParserException(var14.toString());
               }

               var5 = var4 + 1;
            }
         }

         var6 = var0.next();
         var4 = var5;
         var3 = var6;
      } while(var6 != 1);

      StringBuilder var11 = new StringBuilder();
      var11.append("Document ended before ");
      var11.append(var1);
      var11.append(" end tag");
      throw new XmlPullParserException(var11.toString());
   }

   public static final long[] e(XmlPullParser var0, String var1, String[] var2) {
      int var3;
      try {
         var3 = Integer.parseInt(var0.getAttributeValue((String)null, "num"));
      } catch (NullPointerException var9) {
         throw new XmlPullParserException("Need num attribute in long-array");
      } catch (NumberFormatException var10) {
         throw new XmlPullParserException("Not a number in num attribute in long-array");
      }

      var0.next();
      long[] var13 = new long[var3];
      int var4 = 0;
      var3 = var0.getEventType();

      int var6;
      do {
         int var5;
         if (var3 == 2) {
            if (!var0.getName().equals("item")) {
               StringBuilder var12 = new StringBuilder();
               var12.append("Expected item tag at: ");
               var12.append(var0.getName());
               throw new XmlPullParserException(var12.toString());
            }

            try {
               var13[var4] = Long.parseLong(var0.getAttributeValue((String)null, "value"));
            } catch (NullPointerException var7) {
               throw new XmlPullParserException("Need value attribute in item");
            } catch (NumberFormatException var8) {
               throw new XmlPullParserException("Not a number in value attribute in item");
            }

            var5 = var4;
         } else {
            var5 = var4;
            if (var3 == 3) {
               if (var0.getName().equals(var1)) {
                  return var13;
               }

               if (!var0.getName().equals("item")) {
                  StringBuilder var14 = new StringBuilder();
                  var14.append("Expected ");
                  var14.append(var1);
                  var14.append(" end tag at: ");
                  var14.append(var0.getName());
                  throw new XmlPullParserException(var14.toString());
               }

               var5 = var4 + 1;
            }
         }

         var6 = var0.next();
         var4 = var5;
         var3 = var6;
      } while(var6 != 1);

      StringBuilder var11 = new StringBuilder();
      var11.append("Document ended before ");
      var11.append(var1);
      var11.append(" end tag");
      throw new XmlPullParserException(var11.toString());
   }

   public static final double[] f(XmlPullParser var0, String var1, String[] var2) {
      int var3;
      try {
         var3 = Integer.parseInt(var0.getAttributeValue((String)null, "num"));
      } catch (NullPointerException var9) {
         throw new XmlPullParserException("Need num attribute in double-array");
      } catch (NumberFormatException var10) {
         throw new XmlPullParserException("Not a number in num attribute in double-array");
      }

      var0.next();
      double[] var13 = new double[var3];
      int var4 = 0;
      var3 = var0.getEventType();

      int var6;
      do {
         int var5;
         if (var3 == 2) {
            if (!var0.getName().equals("item")) {
               StringBuilder var12 = new StringBuilder();
               var12.append("Expected item tag at: ");
               var12.append(var0.getName());
               throw new XmlPullParserException(var12.toString());
            }

            try {
               var13[var4] = Double.parseDouble(var0.getAttributeValue((String)null, "value"));
            } catch (NullPointerException var7) {
               throw new XmlPullParserException("Need value attribute in item");
            } catch (NumberFormatException var8) {
               throw new XmlPullParserException("Not a number in value attribute in item");
            }

            var5 = var4;
         } else {
            var5 = var4;
            if (var3 == 3) {
               if (var0.getName().equals(var1)) {
                  return var13;
               }

               if (!var0.getName().equals("item")) {
                  StringBuilder var14 = new StringBuilder();
                  var14.append("Expected ");
                  var14.append(var1);
                  var14.append(" end tag at: ");
                  var14.append(var0.getName());
                  throw new XmlPullParserException(var14.toString());
               }

               var5 = var4 + 1;
            }
         }

         var6 = var0.next();
         var4 = var5;
         var3 = var6;
      } while(var6 != 1);

      StringBuilder var11 = new StringBuilder();
      var11.append("Document ended before ");
      var11.append(var1);
      var11.append(" end tag");
      throw new XmlPullParserException(var11.toString());
   }

   public static final String[] g(XmlPullParser var0, String var1, String[] var2) {
      int var3;
      try {
         var3 = Integer.parseInt(var0.getAttributeValue((String)null, "num"));
      } catch (NullPointerException var9) {
         throw new XmlPullParserException("Need num attribute in string-array");
      } catch (NumberFormatException var10) {
         throw new XmlPullParserException("Not a number in num attribute in string-array");
      }

      var0.next();
      var2 = new String[var3];
      int var4 = 0;
      var3 = var0.getEventType();

      int var6;
      do {
         int var5;
         if (var3 == 2) {
            if (var0.getName().equals("item")) {
               try {
                  var2[var4] = var0.getAttributeValue((String)null, "value");
               } catch (NullPointerException var7) {
                  throw new XmlPullParserException("Need value attribute in item");
               } catch (NumberFormatException var8) {
                  throw new XmlPullParserException("Not a number in value attribute in item");
               }

               var5 = var4;
            } else {
               if (!var0.getName().equals("null")) {
                  StringBuilder var12 = new StringBuilder();
                  var12.append("Expected item tag at: ");
                  var12.append(var0.getName());
                  throw new XmlPullParserException(var12.toString());
               }

               var2[var4] = null;
               var5 = var4;
            }
         } else {
            var5 = var4;
            if (var3 == 3) {
               if (var0.getName().equals(var1)) {
                  return var2;
               }

               if (!var0.getName().equals("item") && !var0.getName().equals("null")) {
                  StringBuilder var13 = new StringBuilder();
                  var13.append("Expected ");
                  var13.append(var1);
                  var13.append(" end tag at: ");
                  var13.append(var0.getName());
                  throw new XmlPullParserException(var13.toString());
               }

               var5 = var4 + 1;
            }
         }

         var6 = var0.next();
         var4 = var5;
         var3 = var6;
      } while(var6 != 1);

      StringBuilder var11 = new StringBuilder();
      var11.append("Document ended before ");
      var11.append(var1);
      var11.append(" end tag");
      throw new XmlPullParserException(var11.toString());
   }

   public interface a {
      Object a(XmlPullParser var1, String var2);
   }

   public interface b {
      void a(Object var1, String var2, XmlSerializer var3);
   }
}
