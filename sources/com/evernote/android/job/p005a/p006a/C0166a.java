package com.evernote.android.job.p005a.p006a;

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

/* renamed from: com.evernote.android.job.a.a.a */
class C0166a implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f586a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    private static String f587b = "                                                              ";

    /* renamed from: c */
    private final char[] f588c = new char[8192];

    /* renamed from: d */
    private int f589d;

    /* renamed from: e */
    private Writer f590e;

    /* renamed from: f */
    private OutputStream f591f;

    /* renamed from: g */
    private CharsetEncoder f592g;

    /* renamed from: h */
    private ByteBuffer f593h = ByteBuffer.allocate(8192);

    /* renamed from: i */
    private boolean f594i = false;

    /* renamed from: j */
    private boolean f595j;

    /* renamed from: k */
    private int f596k = 0;

    /* renamed from: l */
    private boolean f597l = true;

    C0166a() {
    }

    /* renamed from: a */
    private void m572a() {
        int position = this.f593h.position();
        if (position > 0) {
            this.f593h.flip();
            this.f591f.write(this.f593h.array(), 0, position);
            this.f593h.clear();
        }
    }

    /* renamed from: a */
    private void m573a(char c) {
        int i = this.f589d;
        if (i >= 8191) {
            flush();
            i = this.f589d;
        }
        this.f588c[i] = c;
        this.f589d = i + 1;
    }

    /* renamed from: a */
    private void m574a(int i) {
        int i2 = i * 4;
        if (i2 > f587b.length()) {
            i2 = f587b.length();
        }
        m576a(f587b, 0, i2);
    }

    /* renamed from: a */
    private void m575a(String str) {
        m576a(str, 0, str.length());
    }

    /* renamed from: a */
    private void m576a(String str, int i, int i2) {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m576a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f589d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f589d;
        }
        str.getChars(i, i + i2, this.f588c, i5);
        this.f589d = i5 + i2;
    }

    /* renamed from: a */
    private void m577a(char[] cArr, int i, int i2) {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m577a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f589d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f589d;
        }
        System.arraycopy(cArr, i, this.f588c, i5, i2);
        this.f589d = i5 + i2;
    }

    /* renamed from: b */
    private void m578b(String str) {
        String str2;
        int length = str.length();
        char length2 = (char) f586a.length;
        String[] strArr = f586a;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    m576a(str, i2, i - i2);
                }
                i2 = i + 1;
                m575a(str2);
            }
            i++;
        }
        if (i2 < i) {
            m576a(str, i2, i - i2);
        }
    }

    /* renamed from: b */
    private void m579b(char[] cArr, int i, int i2) {
        String str;
        char length = (char) f586a.length;
        String[] strArr = f586a;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    m577a(cArr, i4, i - i4);
                }
                i4 = i + 1;
                m575a(str);
            }
            i++;
        }
        if (i4 < i) {
            m577a(cArr, i4, i - i4);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        m573a(' ');
        if (str != null) {
            m575a(str);
            m573a(':');
        }
        m575a(str2);
        m575a("=\"");
        m578b(str3);
        m573a('\"');
        this.f597l = false;
        return this;
    }

    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    public void endDocument() {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) {
        String str3;
        this.f596k--;
        if (this.f595j) {
            str3 = " />\n";
        } else {
            if (this.f594i && this.f597l) {
                m574a(this.f596k);
            }
            m575a("</");
            if (str != null) {
                m575a(str);
                m573a(':');
            }
            m575a(str2);
            str3 = ">\n";
        }
        m575a(str3);
        this.f597l = true;
        this.f595j = false;
        return this;
    }

    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public void flush() {
        if (this.f589d > 0) {
            if (this.f591f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f588c, 0, this.f589d);
                CharsetEncoder charsetEncoder = this.f592g;
                ByteBuffer byteBuffer = this.f593h;
                while (true) {
                    CoderResult encode = charsetEncoder.encode(wrap, byteBuffer, true);
                    if (!encode.isError()) {
                        if (!encode.isOverflow()) {
                            m572a();
                            this.f591f.flush();
                            break;
                        }
                        m572a();
                        charsetEncoder = this.f592g;
                        byteBuffer = this.f593h;
                    } else {
                        throw new IOException(encode.toString());
                    }
                }
            } else {
                this.f590e.write(this.f588c, 0, this.f589d);
                this.f590e.flush();
            }
            this.f589d = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.f594i = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f592g = Charset.forName(str).newEncoder();
            this.f591f = outputStream;
        } catch (IllegalCharsetNameException e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        } catch (UnsupportedCharsetException e2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
        }
    }

    public void setOutput(Writer writer) {
        this.f590e = writer;
    }

    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        m575a(sb.toString());
        this.f597l = true;
    }

    public XmlSerializer startTag(String str, String str2) {
        if (this.f595j) {
            m575a(">\n");
        }
        if (this.f594i) {
            m574a(this.f596k);
        }
        this.f596k++;
        m573a('<');
        if (str != null) {
            m575a(str);
            m573a(':');
        }
        m575a(str2);
        this.f595j = true;
        this.f597l = false;
        return this;
    }

    public XmlSerializer text(String str) {
        boolean z = false;
        if (this.f595j) {
            m575a(">");
            this.f595j = false;
        }
        m578b(str);
        if (this.f594i) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == 10) {
                z = true;
            }
            this.f597l = z;
        }
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        if (this.f595j) {
            m575a(">");
            this.f595j = false;
        }
        m579b(cArr, i, i2);
        if (this.f594i) {
            int i3 = i + i2;
            boolean z = true;
            if (cArr[i3 - 1] != 10) {
                z = false;
            }
            this.f597l = z;
        }
        return this;
    }
}
