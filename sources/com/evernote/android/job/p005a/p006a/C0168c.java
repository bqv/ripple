package com.evernote.android.job.p005a.p006a;

import android.util.Xml;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.evernote.android.job.a.a.c */
final class C0168c {

    /* renamed from: com.evernote.android.job.a.a.c$a */
    public interface C0169a {
        /* renamed from: a */
        Object mo562a(XmlPullParser xmlPullParser, String str);
    }

    /* renamed from: com.evernote.android.job.a.a.c$b */
    public interface C0170b {
        /* renamed from: a */
        void mo563a(Object obj, String str, XmlSerializer xmlSerializer);
    }

    /* renamed from: a */
    private static final Object m586a(XmlPullParser xmlPullParser, String str) {
        try {
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value")));
            }
            if (str.equals("long")) {
                return Long.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("float")) {
                return Float.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("double")) {
                return Double.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("boolean")) {
                return Boolean.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            return null;
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need value attribute in <" + str + ">");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in value attribute in <" + str + ">");
        }
    }

    /* renamed from: a */
    public static final Object m587a(XmlPullParser xmlPullParser, String[] strArr) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            }
        }
        return m588a(xmlPullParser, strArr, (C0169a) null);
    }

    /* renamed from: a */
    private static final Object m588a(XmlPullParser xmlPullParser, String[] strArr, C0169a aVar) {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else {
                obj = m586a(xmlPullParser, name);
                if (obj == null) {
                    if (name.equals("int-array")) {
                        int[] d = m609d(xmlPullParser, "int-array", strArr);
                        strArr[0] = attributeValue;
                        return d;
                    } else if (name.equals("long-array")) {
                        long[] e = m610e(xmlPullParser, "long-array", strArr);
                        strArr[0] = attributeValue;
                        return e;
                    } else if (name.equals("double-array")) {
                        double[] f = m611f(xmlPullParser, "double-array", strArr);
                        strArr[0] = attributeValue;
                        return f;
                    } else if (name.equals("string-array")) {
                        String[] g = m612g(xmlPullParser, "string-array", strArr);
                        strArr[0] = attributeValue;
                        return g;
                    } else if (name.equals("map")) {
                        xmlPullParser.next();
                        HashMap<String, ?> a = m590a(xmlPullParser, "map", strArr);
                        strArr[0] = attributeValue;
                        return a;
                    } else if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList b = m605b(xmlPullParser, "list", strArr);
                        strArr[0] = attributeValue;
                        return b;
                    } else if (name.equals("set")) {
                        xmlPullParser.next();
                        HashSet c = m607c(xmlPullParser, "set", strArr);
                        strArr[0] = attributeValue;
                        return c;
                    } else if (aVar != null) {
                        Object a2 = aVar.mo562a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return a2;
                    } else {
                        throw new XmlPullParserException("Unknown tag: " + name);
                    }
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m589a(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return (HashMap) m587a(newPullParser, new String[1]);
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m590a(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m591a(xmlPullParser, str, strArr, (C0169a) null);
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m591a(XmlPullParser xmlPullParser, String str, String[] strArr, C0169a aVar) {
        HashMap<String, ?> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], m588a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: a */
    public static final void m592a(Object obj, String str, XmlSerializer xmlSerializer) {
        m593a(obj, str, xmlSerializer, (C0170b) null);
    }

    /* renamed from: a */
    private static final void m593a(Object obj, String str, XmlSerializer xmlSerializer, C0170b bVar) {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag((String) null, "null");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag((String) null, "string");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                m600a((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                m602a((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof long[]) {
                m603a((long[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof double[]) {
                m601a((double[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof String[]) {
                m604a((String[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                m596a((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                m594a((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                m599a((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag((String) null, "string");
                if (str != null) {
                    xmlSerializer.attribute((String) null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag((String) null, "string");
                return;
            } else if (bVar != null) {
                bVar.mo563a(obj, str, xmlSerializer);
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    /* renamed from: a */
    public static final void m594a(List list, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (list == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "list");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m592a(list.get(i), (String) null, xmlSerializer);
            }
            str2 = "list";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m595a(Map map, OutputStream outputStream) {
        C0166a aVar = new C0166a();
        aVar.setOutput(outputStream, "utf-8");
        aVar.startDocument((String) null, true);
        aVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        m596a(map, (String) null, (XmlSerializer) aVar);
        aVar.endDocument();
    }

    /* renamed from: a */
    public static final void m596a(Map map, String str, XmlSerializer xmlSerializer) {
        m597a(map, str, xmlSerializer, (C0170b) null);
    }

    /* renamed from: a */
    public static final void m597a(Map map, String str, XmlSerializer xmlSerializer, C0170b bVar) {
        String str2;
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "map");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            m598a(map, xmlSerializer, bVar);
            str2 = "map";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m598a(Map map, XmlSerializer xmlSerializer, C0170b bVar) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                m593a(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
            }
        }
    }

    /* renamed from: a */
    public static final void m599a(Set set, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (set == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "set");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            for (Object a : set) {
                m592a(a, (String) null, xmlSerializer);
            }
            str2 = "set";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m600a(byte[] bArr, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (bArr == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "byte-array");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                int i = b >> 4;
                sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
                byte b2 = b & 255;
                sb.append(b2 >= 10 ? (b2 + 97) - 10 : b2 + 48);
            }
            xmlSerializer.text(sb.toString());
            str2 = "byte-array";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m601a(double[] dArr, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (dArr == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "double-array");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "num", Integer.toString(r6));
            for (double d : dArr) {
                xmlSerializer.startTag((String) null, "item");
                xmlSerializer.attribute((String) null, "value", Double.toString(d));
                xmlSerializer.endTag((String) null, "item");
            }
            str2 = "double-array";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m602a(int[] iArr, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (iArr == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "int-array");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
            for (int num : iArr) {
                xmlSerializer.startTag((String) null, "item");
                xmlSerializer.attribute((String) null, "value", Integer.toString(num));
                xmlSerializer.endTag((String) null, "item");
            }
            str2 = "int-array";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m603a(long[] jArr, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (jArr == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "long-array");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "num", Integer.toString(r6));
            for (long l : jArr) {
                xmlSerializer.startTag((String) null, "item");
                xmlSerializer.attribute((String) null, "value", Long.toString(l));
                xmlSerializer.endTag((String) null, "item");
            }
            str2 = "long-array";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: a */
    public static final void m604a(String[] strArr, String str, XmlSerializer xmlSerializer) {
        String str2;
        String str3;
        if (strArr == null) {
            xmlSerializer.startTag((String) null, "null");
            str2 = "null";
        } else {
            xmlSerializer.startTag((String) null, "string-array");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            int length = strArr.length;
            xmlSerializer.attribute((String) null, "num", Integer.toString(length));
            for (int i = 0; i < length; i++) {
                if (strArr[i] == null) {
                    xmlSerializer.startTag((String) null, "null");
                    str3 = "null";
                } else {
                    xmlSerializer.startTag((String) null, "item");
                    xmlSerializer.attribute((String) null, "value", strArr[i]);
                    str3 = "item";
                }
                xmlSerializer.endTag((String) null, str3);
            }
            str2 = "string-array";
        }
        xmlSerializer.endTag((String) null, str2);
    }

    /* renamed from: b */
    public static final ArrayList m605b(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m606b(xmlPullParser, str, strArr, (C0169a) null);
    }

    /* renamed from: b */
    private static final ArrayList m606b(XmlPullParser xmlPullParser, String str, String[] strArr, C0169a aVar) {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m588a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: c */
    public static final HashSet m607c(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m608c(xmlPullParser, str, strArr, (C0169a) null);
    }

    /* renamed from: c */
    private static final HashSet m608c(XmlPullParser xmlPullParser, String str, String[] strArr, C0169a aVar) {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m588a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: d */
    public static final int[] m609d(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            int[] iArr = new int[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    /* renamed from: e */
    public static final long[] m610e(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            long[] jArr = new long[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            jArr[i] = Long.parseLong(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    /* renamed from: f */
    public static final double[] m611f(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            double[] dArr = new double[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            dArr[i] = Double.parseDouble(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    /* renamed from: g */
    public static final String[] m612g(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            String[] strArr2 = new String[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            strArr2[i] = xmlPullParser.getAttributeValue((String) null, "value");
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else if (xmlPullParser.getName().equals("null")) {
                        strArr2[i] = null;
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (xmlPullParser.getName().equals("item") || xmlPullParser.getName().equals("null")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }
}
