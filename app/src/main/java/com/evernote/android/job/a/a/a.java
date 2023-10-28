package com.evernote.android.job.a.a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

class a implements XmlSerializer {
   private static final String[] a = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
   private static String b;
   private final char[] c = new char[8192];
   private int d;
   private Writer e;
   private OutputStream f;
   private CharsetEncoder g;
   private ByteBuffer h = ByteBuffer.allocate(8192);
   private boolean i = false;
   private boolean j;
   private int k = 0;
   private boolean l = true;

   private void a() {
      int var1 = this.h.position();
      if (var1 > 0) {
         this.h.flip();
         this.f.write(this.h.array(), 0, var1);
         this.h.clear();
      }

   }

   private void a(char var1) {
      int var2 = this.d;
      int var3 = var2;
      if (var2 >= 8191) {
         this.flush();
         var3 = this.d;
      }

      this.c[var3] = (char)var1;
      this.d = var3 + 1;
   }

   private void a(int var1) {
      int var2 = var1 * 4;
      var1 = var2;
      if (var2 > b.length()) {
         var1 = b.length();
      }

      this.a((String)b, 0, var1);
   }

   private void a(String var1) {
      this.a((String)var1, 0, var1.length());
   }

   private void a(String var1, int var2, int var3) {
      int var4;
      int var5;
      if (var3 > 8192) {
         for(var4 = var3 + var2; var2 < var4; var2 = var5) {
            var5 = var2 + 8192;
            if (var5 < var4) {
               var3 = 8192;
            } else {
               var3 = var4 - var2;
            }

            this.a(var1, var2, var3);
         }

      } else {
         var4 = this.d;
         var5 = var4;
         if (var4 + var3 > 8192) {
            this.flush();
            var5 = this.d;
         }

         var1.getChars(var2, var2 + var3, this.c, var5);
         this.d = var5 + var3;
      }
   }

   private void a(char[] var1, int var2, int var3) {
      int var4;
      int var5;
      if (var3 > 8192) {
         for(var4 = var3 + var2; var2 < var4; var2 = var5) {
            var5 = var2 + 8192;
            if (var5 < var4) {
               var3 = 8192;
            } else {
               var3 = var4 - var2;
            }

            this.a(var1, var2, var3);
         }

      } else {
         var4 = this.d;
         var5 = var4;
         if (var4 + var3 > 8192) {
            this.flush();
            var5 = this.d;
         }

         System.arraycopy(var1, var2, this.c, var5, var3);
         this.d = var5 + var3;
      }
   }

   private void b(String var1) {
      int var2 = var1.length();
      char var3 = (char)a.length;
      String[] var4 = a;
      int var5 = 0;

      int var6;
      for(var6 = 0; var5 < var2; ++var5) {
         char var7 = var1.charAt(var5);
         if (var7 < var3) {
            String var8 = var4[var7];
            if (var8 != null) {
               if (var6 < var5) {
                  this.a(var1, var6, var5 - var6);
               }

               var6 = var5 + 1;
               this.a(var8);
            }
         }
      }

      if (var6 < var5) {
         this.a(var1, var6, var5 - var6);
      }

   }

   private void b(char[] var1, int var2, int var3) {
      char var4 = (char)a.length;
      String[] var5 = a;
      int var6 = var2;

      int var7;
      for(var7 = var2; var7 < var3 + var2; ++var7) {
         char var8 = var1[var7];
         if (var8 < var4) {
            String var9 = var5[var8];
            if (var9 != null) {
               if (var6 < var7) {
                  this.a(var1, var6, var7 - var6);
               }

               var6 = var7 + 1;
               this.a(var9);
            }
         }
      }

      if (var6 < var7) {
         this.a(var1, var6, var7 - var6);
      }

   }

   public XmlSerializer attribute(String var1, String var2, String var3) {
      this.a(' ');
      if (var1 != null) {
         this.a(var1);
         this.a(':');
      }

      this.a(var2);
      this.a("=\"");
      this.b(var3);
      this.a('"');
      this.l = false;
      return this;
   }

   public void cdsect(String var1) {
      throw new UnsupportedOperationException();
   }

   public void comment(String var1) {
      throw new UnsupportedOperationException();
   }

   public void docdecl(String var1) {
      throw new UnsupportedOperationException();
   }

   public void endDocument() {
      this.flush();
   }

   public XmlSerializer endTag(String var1, String var2) {
      --this.k;
      if (this.j) {
         var1 = " />\n";
      } else {
         if (this.i && this.l) {
            this.a(this.k);
         }

         this.a("</");
         if (var1 != null) {
            this.a(var1);
            this.a(':');
         }

         this.a(var2);
         var1 = ">\n";
      }

      this.a(var1);
      this.l = true;
      this.j = false;
      return this;
   }

   public void entityRef(String var1) {
      throw new UnsupportedOperationException();
   }

   public void flush() {
      if (this.d > 0) {
         if (this.f != null) {
            CharBuffer var1 = CharBuffer.wrap(this.c, 0, this.d);
            CharsetEncoder var2 = this.g;
            ByteBuffer var3 = this.h;

            while(true) {
               CoderResult var4 = var2.encode(var1, var3, true);
               if (var4.isError()) {
                  throw new IOException(var4.toString());
               }

               if (!var4.isOverflow()) {
                  this.a();
                  this.f.flush();
                  break;
               }

               this.a();
               var2 = this.g;
               var3 = this.h;
            }
         } else {
            this.e.write(this.c, 0, this.d);
            this.e.flush();
         }

         this.d = 0;
      }

   }

   public int getDepth() {
      throw new UnsupportedOperationException();
   }

   public boolean getFeature(String var1) {
      throw new UnsupportedOperationException();
   }

   public String getName() {
      throw new UnsupportedOperationException();
   }

   public String getNamespace() {
      throw new UnsupportedOperationException();
   }

   public String getPrefix(String var1, boolean var2) {
      throw new UnsupportedOperationException();
   }

   public Object getProperty(String var1) {
      throw new UnsupportedOperationException();
   }

   public void ignorableWhitespace(String var1) {
      throw new UnsupportedOperationException();
   }

   public void processingInstruction(String var1) {
      throw new UnsupportedOperationException();
   }

   public void setFeature(String var1, boolean var2) {
      if (var1.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
         this.i = true;
      } else {
         throw new UnsupportedOperationException();
      }
   }

   public void setOutput(OutputStream var1, String var2) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         try {
            this.g = Charset.forName(var2).newEncoder();
         } catch (IllegalCharsetNameException var3) {
            throw (UnsupportedEncodingException)(new UnsupportedEncodingException(var2)).initCause(var3);
         } catch (UnsupportedCharsetException var4) {
            throw (UnsupportedEncodingException)(new UnsupportedEncodingException(var2)).initCause(var4);
         }

         this.f = var1;
      }
   }

   public void setOutput(Writer var1) {
      this.e = var1;
   }

   public void setPrefix(String var1, String var2) {
      throw new UnsupportedOperationException();
   }

   public void setProperty(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public void startDocument(String var1, Boolean var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("<?xml version='1.0' encoding='utf-8' standalone='");
      if (var2) {
         var1 = "yes";
      } else {
         var1 = "no";
      }

      var3.append(var1);
      var3.append("' ?>\n");
      this.a(var3.toString());
      this.l = true;
   }

   public XmlSerializer startTag(String var1, String var2) {
      if (this.j) {
         this.a(">\n");
      }

      if (this.i) {
         this.a(this.k);
      }

      ++this.k;
      this.a('<');
      if (var1 != null) {
         this.a(var1);
         this.a(':');
      }

      this.a(var2);
      this.j = true;
      this.l = false;
      return this;
   }

   public XmlSerializer text(String var1) {
      boolean var2 = this.j;
      boolean var3 = false;
      if (var2) {
         this.a(">");
         this.j = false;
      }

      this.b(var1);
      if (this.i) {
         var2 = var3;
         if (var1.length() > 0) {
            var2 = var3;
            if (var1.charAt(var1.length() - 1) == '\n') {
               var2 = true;
            }
         }

         this.l = var2;
      }

      return this;
   }

   public XmlSerializer text(char[] var1, int var2, int var3) {
      if (this.j) {
         this.a(">");
         this.j = false;
      }

      this.b(var1, var2, var3);
      if (this.i) {
         boolean var4 = true;
         if (var1[var2 + var3 - 1] != '\n') {
            var4 = false;
         }

         this.l = var4;
      }

      return this;
   }
}
