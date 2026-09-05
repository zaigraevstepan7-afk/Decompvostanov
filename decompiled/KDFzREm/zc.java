/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNG
 *  com.google.gson.reflect.TypeToken
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package KDFzREm;

import KDFzREm.NNNG;
import KDFzREm.zH;
import KDFzREm.zX;
import KDFzREm.za;
import com.google.gson.reflect.TypeToken;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zc {
    public Object[] N;
    private static boolean[] L;
    private static String[] u;
    private static byte[] i;
    public static Object[] y;
    private static short[] R;
    private static short[] M;
    private static /* synthetic */ String lliks;
    private static /* synthetic */ int[] lInrri;

    private void L(zH zH2) {
        zc.lIqsql0s("hokurka", -490099277, -1977804352, -1977804345, -1977804346, -490099277, -490099277, -490099277, (Set)((Object)zc.lIqsql0s("icpsetw", -490099278, -1977804350, -1977804320, -1977804351, -490099278, -490099278, -490099278, (String)("locale/" + (String)((Object)zc.lIqsql0s("icpsetw", -490099268, -1977804349, -1977804320, -1977804301, -490099268, -490099268, -490099268, (zH)zH2))), nNNG -> (boolean)zc.lIqsql0s("pzwblvi", -490099268, -1977804304, -1977804297, -1977804298, -490099268, -490099268, -490099268, (String)((Object)zc.lIqsql0s("atkgari", -490099268, -1977804308, -1977804320, -1977804301, -490099268, -490099268, -490099268, (NNNG)nNNG)), (String)((Object)zc.lIqsql0s("tayehgmk", -490099272, -1977804317, -1977804302, -1977804303, -490099272, -490099272, -490099272)[0])))), nNNG -> {
            zX zX2 = new zX(this);
            Map map = (Map)((Object)zc.lIqsql0s("pzwblvi", -490099278, -1977804350, -1977804320, -1977804347, -490099278, -490099278, -490099278, (NNNG)nNNG, (TypeToken)zX2));
            if (map != null) {
                zc.lIqsql0s("vvid", -490099277, -1977804316, -1977804348, -1977804341, -490099277, -490099277, -490099277, (Map)((Map)((Object)zc.lIqsql0s("vnze", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("atkgari", -490099272, -1977804317, -1977804295, -1977804315, -490099272, -490099272, -490099272)[3]])), (Map)map);
            }
        });
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight((-Integer.rotateLeft(Integer.rotateLeft(-n, 6), 6) ^ 0x97991F05) + 1 ^ 0x82D31FDA, 20);
    }

    private static void L() {
        i = new byte[]{3};
    }

    private static void M() {
        u = new String[]{".json"};
    }

    public zc(zH zH2, zH zH3) {
        zc.lIqsql0s("jbneacn", -490099268, -1977804317, -1977804291, -1977804310, -490099268, -490099268, -490099268, (zc)this);
        HashMap hashMap = new HashMap();
        zc.lIqsql0s("cyjw", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("jbneacn", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[0]] = hashMap;
        zH zH4 = zH3;
        zc.lIqsql0s("atkgari", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("cyjw", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[1]] = zH4;
        zc.lIqsql0s("vnze", -490099268, -1977804317, -1977804320, -1977804312, -490099268, -490099268, -490099268, (zc)this, (zH)zH2);
    }

    static {
        zc.ntfClinit();
    }

    private static void B() {
        y = new Object[]{null};
    }

    private void i() {
        if (zc.lIqsql0s("lamdeqgy", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this) == null) {
            zc.lIqsql0s("eyerttrg", -490099265, -1977804317, -1977804320, -1977804313, -490099265, -490099265, -490099265, (zc)this, (Object[])new Object[zc.lIqsql0s("cyjw", -490099272, -1977804317, -1977804291, -1977804292, -490099272, -490099272, -490099272)[0]]);
            CallSite callSite = zc.lIqsql0s("icpsetw", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this);
        }
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateRight(-n, 2) ^ 0xCE36BA49) + 1;
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n, 12), 19), 2);
    }

    private static void u() {
        R = new short[]{2, 1, 2, 1, 0, 2, 0, 0};
        M = new short[]{2, 2, 0, 2};
    }

    private boolean y(zH zH2) {
        if ((zH)((Object)zc.lIqsql0s("tayehgmk", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("pzwblvi", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[6]]) == zH2) {
            return (boolean)zc.lIqsql0s("pzwblvi", -490099272, -1977804317, -1977804311, -1977804299, -1040406295, 1630130302, -1566376073)[0];
        }
        zH zH3 = zH2;
        zc.lIqsql0s("birxh", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("pzwblvi", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[7]] = zH3;
        return (boolean)zc.lIqsql0s("vnze", -490099272, -1977804317, -1977804311, -1977804299, -490099272, -490099272, -490099272)[1];
    }

    public Map<String, String> y() {
        return zc.lIqsql0s("eyerttrg", -490099278, -1977804316, -1977804342, -1977804343, -2088536433, -1575426854, -314764489, (Map)((Map)((Object)zc.lIqsql0s("icpsetw", -490099266, -1977804317, -1977804320, -1977804313, 45544607, 2058345400, 909991219, (zc)this)[zc.lIqsql0s("icpsetw", -490099272, -1977804317, -1977804314, -1977804315, -1073291174, -565438601, -1031142524)[5]])));
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{73, 28, -100, 34, -11, -80, -92, -17, 110, -79, 99, -109, -94, -49, -107, -85};
        int n = 0;
        int n2 = 202;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 43;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight((Integer.rotateLeft(n, 12) ^ 0x351DB4EE) + 1, 25);
    }

    public void N(zH zH2) {
        if (zc.lIqsql0s("jbneacn", -490099268, -1977804317, -1977804318, -1977804319, -490099268, -490099268, -490099268, (zc)this, (zH)zH2) == false) {
            return;
        }
        try {
            zc.lIqsql0s("eyerttrg", -490099277, -1977804316, -1977804309, -1977804310, -490099277, -490099277, -490099277, (Map)((Map)((Object)zc.lIqsql0s("cyjw", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("tayehgmk", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[2]])));
            zc.lIqsql0s("birxh", -490099268, -1977804317, -1977804311, -1977804312, -490099268, -490099268, -490099268, (zc)this, (zH)((zH)((Object)zc.lIqsql0s("tayehgmk", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("hokurka", -490099272, -1977804317, -1977804314, -1977804315, -490099272, -490099272, -490099272)[3]])));
            zc.lIqsql0s("eyerttrg", -490099268, -1977804317, -1977804311, -1977804312, -490099268, -490099268, -490099268, (zc)this, (zH)zH2);
        }
        catch (Exception exception) {
            zc.lIqsql0s("brfzok", -490099277, -1977804305, -1977804306, -1977804307, -2088536433, -1575426854, -314764489, (Logger)((Logger)zc.lIqsql0s("pzwblvi", -490099272, -1977804317, -1977804318, -1977804313, 1015419544, -440909275, -13404387)[zc.lIqsql0s("hokurka", -490099272, -1977804317, -1977804314, -1977804315, 738136465, 1833479107, 1294349504)[4]]), (Object)exception, (Throwable)exception);
        }
    }

    public zH N() {
        return (zH)((Object)zc.lIqsql0s("ferbmh", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)this)[zc.lIqsql0s("vnze", -490099272, -1977804317, -1977804295, -1977804315, -490099272, -490099272, -490099272)[2]]);
    }

    public static String N(String string) {
        return (String)((Object)zc.lIqsql0s("jbneacn", -490099277, -1977804316, -1977804289, -1977804290, -490099277, -490099277, -490099277, (Map)((Map)((Object)zc.lIqsql0s("icpsetw", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)((Object)zc.lIqsql0s("ferbmh", -490099278, -1977804300, -1977804293, -1977804294, -490099278, -490099278, -490099278)))[zc.lIqsql0s("brfzok", -490099272, -1977804317, -1977804295, -1977804315, -490099272, -490099272, -490099272)[0]])), (Object)string, (Object)string));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(n, 2), 27), 12), 10);
    }

    public static String N(za za2) {
        return (String)((Object)zc.lIqsql0s("vnze", -490099277, -1977804316, -1977804289, -1977804290, -490099277, -490099277, -490099277, (Map)((Map)((Object)zc.lIqsql0s("pzwblvi", -490099266, -1977804317, -1977804320, -1977804313, -490099266, -490099266, -490099266, (zc)((Object)zc.lIqsql0s("hokurka", -490099278, -1977804300, -1977804293, -1977804294, -490099278, -490099278, -490099278)))[zc.lIqsql0s("pzwblvi", -490099272, -1977804317, -1977804295, -1977804315, -490099272, -490099272, -490099272)[1]])), (Object)zc.lIqsql0s("jbneacn", -490099268, -1977804296, -1977804320, -1977804301, -490099268, -490099268, -490099268, (za)za2), (Object)zc.lIqsql0s("cyjw", -490099268, -1977804296, -1977804320, -1977804301, -490099268, -490099268, -490099268, (za)za2)));
    }

    private static void R() {
        L = new boolean[]{false, true, false, true};
    }

    private static /* synthetic */ void ntfClinit() {
        zc.lOImri(new String[]{"\u0000\u0016\u0000\u0002J\u0099\u0000\r\u0000\u0005(\u00b1\u0015o\u00f5\u0000\b\u0000\u00053\u00af\u0002a\u00f5\u0000\f\u0000\u001f\u0092\u00b1\u0000/\u00e6\u00c7\fCu\u00ecN0eH2>\u0093\u00a4Hl\u00e8\u00d0YJ2\u00c5\u000e;mJ'\u0000\u0012\u0000\u0013\u0096\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sY['\u0011\u00a3\u00a4\\\u0000&\u0000E9\u008f,D\u00c1\u00cd?ep\u00a6/\u0012DhnLr\u00ac\n/\u00e0\u00d8\u0002Gq\u00ecN;y@;/c\u00a6\u0001l\u00e2\u00d4\u0019\u000fI\u00f0\u00119^@>e\u007f\u00f8NL\u00ed\u00d6\u001bA2\u00e5\u00002m\u0000\u001ab{\u00a6\u0004t\u00bc\u0000\u001e\u0000\u0001\u00c3\u0000\u0013\u0000\u0010\b\u00a2\u0011a\u00a8\u00db\fNz\u00a62(xF;\u001f\u0000 \u0000\nK\u0087!z\u00d5\u00f2\u0000\u000fg\u00c1\u0000\u0005\u0000\u0001\u0087\u0000\u001b\u0000\nu\u0087!z\u00d5\u00f2\u0000\u000fg\u00e8\u0000\u0019\u0000\u000e\u001d\u00ea+K\u00c3\u00f1\u0017rX\u00e4N&i\u0014\u0000\n\u0000\u0001\u00dc\u0000\u0010\u0000\u0014(\u00ea+j\u00e6\u00c1\f\u000fq\u00e8\u000f;%|!\u00dfi\u00ad\u0000;\u0000!\u0000\n;\u0087!z\u00d5\u00f2\u0000\u000fj\u00ea\u0000\t\u0000\u0003\u001d\u00ea1\u0000\u0001\u0000\u0001\t\u0000\u0018\u0000\u0001\u0000\u0000\u0015\u0000\u0015\u00fd\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sY['b\u00bb\u00a4\\)\u00dd\u0000\u0007\u0000\r\u00e4\u00a2\u0011a\u00a8\u00c2\u0019Iq\u00a6,=z\u0000#\u0000\r\b\u00a2\u0011a\u00a8\u00c2\u0019Iq\u00a629~\u0000\u0004\u0000\u0013!\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sEM?n\u0019\u00b7\\\u0000\u0011\u0000\u0001\u0005\u0000$\u0000\u0007\u001c\u00ac\u0015E\u00e6\u00d4\u0005\u0000\u0006\u0000\u0002J\u0090\u0000)\u0000\u0006V\u00ac\u0017y\u00c8\u00d1\u0000\u0002\u0000\u000f\u00e5\u008f,D\u00c1\u00cd?ep\u00a6\u001b\u00141\u0006\u000f\u0000\u0014\u0000\b\u001f\u00ad\u0003s\u00d0\u00de\u0019H\u0000\u0017\u0000\t\u00c5\u0087!z\u00d5\u00f2\u0000\u000fd\u0000\u000f\u0000\f\u00d3\u0087!z\u00d5\u00f2\u0000\u000fS\u00c7/\u001b\u0000(\u0000\u0012x\u008f\ra\u00f1\u00d6BUi\u00e0\rsGN%\u0080y\u0095\u0000*\u0000 \u00b8\u008f\ra\u00f1\u00d6BUi\u00e0\rsGN%\u00db\u00b9\u008f\ra\u00f1\u00d6BUi\u00e0\rsGN%\u00db\u0000%\u0000 \u00fd\u008f\ra\u00f1\u00d6BUi\u00e0\rslZ;h\u00a1\u00aa\bn\u00a8\u00f4\u0002Nn\u00fc\f9x\u0014|]\u0000\u000b\u0000\u000f\u0016\u008f,D\u00c1\u00cd?ep\u00a6\u001b\u00141\u0006\u0003\u0000\u0003\u0000\u0001,\u0000\"\u0000A\u00e5\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sY['\u0011\u00a3\u00a4\\L\u00ed\u00d6\u001bA2\u00fc\u00155f\u00003\r\u00a3\u00a0\u0013i\u00e8\u00d9Bpo\u00ec\u00055iN!\u001d\u00f6\u00ea+j\u00e6\u00c1\f\u000fh\u00fd\b0%|0\f\u00f6\u0000\u000e\u0000*\u0082\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sEM? \u00c9\u00b7\\L\u00ed\u00d6\u001bA2\u00e5\u00002m\u0000\u0001-\u00d8\u00ac\u0010a\u00e5\u00db\b\u001b4\u00df\u0000\u0000\u0000\nK\u0087!z\u00d5\u00f2\u0000\u000fg\u00ea\u0000\u001d\u00008e\u008f\ra\u00f1\u00d6BL|\u00e7\u0006sEM?2.\u00b7\\L\u00ed\u00d6\u001bA2\u00e5\u00002m\u0000\u001a5'\u00a6\u0004t\u00bc\u009e!J|\u00ff\u0000sfN;0b\u008c\u0005j\u00e2\u00d4\u0019\u001b\u0000'\u0000\u0006\u00fe\u00b6\u0013A\u00eb\u00db\u0000\u001c\u0000\f\u009a\u00a6\u0013O\u00f5\u00f3\bF|\u00fc\r(\u0000\u001a\u0000\u0001\u00dd\u0000\u001f\u0000\u0002\u00c3\u0081"});
        zc.u();
        zc.L();
        zc.R();
        zc.M();
        zc.B();
        zc.y[0] = LogManager.getLogger(String.class);
    }

    private static /* synthetic */ CallSite lIqsql0s(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lInrri[n2 ^ 0x8A1D19E3];
        int n9 = n8 >>> 16;
        String string2 = zc.l1km0Okim(lliks.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8A1D19E3);
        n8 = lInrri[n3 ^ 0x8A1D19E3];
        int n10 = n8 >>> 16;
        String string3 = zc.l1km0Okim(lliks.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8A1D19E3);
        n8 = lInrri[n4 ^ 0x8A1D19E3];
        int n11 = n8 >>> 16;
        String string4 = zc.l1km0Okim(lliks.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8A1D19E3);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2C9AD0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite lIkqlmkli(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lInrri[n2 ^ 0x8A1D19E3];
        int n8 = n7 >>> 16;
        String string2 = zc.l1km0Okim(lliks.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x8A1D19E3);
        n7 = lInrri[n3 ^ 0x8A1D19E3];
        int n9 = n7 >>> 16;
        String string3 = zc.l1km0Okim(lliks.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x8A1D19E3);
        n7 = lInrri[n4 ^ 0x8A1D19E3];
        int n10 = n7 >>> 16;
        String string4 = zc.l1km0Okim(lliks.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x8A1D19E3);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2C9AD0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ void lOImri(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[43];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            int n = 0;
            while (n < string.length()) {
                int n2 = string.charAt(n) << 8 | string.charAt(n + 1);
                int n3 = string.charAt(n + 2) << 8 | string.charAt(n + 3);
                int n4 = n + 4;
                nArray[n2] = stringBuilder.length() << 16 | n3;
                stringBuilder.append(string, n4, n4 + n3);
                n = n4 + n3;
            }
        }
        lliks = stringBuilder.toString();
        lInrri = nArray;
    }

    private static /* synthetic */ String l1km0Okim(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{93, -45, -9, -120, -96, 63, -51, 45, 13, -59, 76, 16, 39, 99, -112, 104};
        byte[] byArray3 = new byte[]{-128, -10, 60, -40, -40, -8, -2, 17, -9, 85, -37, -37, 31, 117, 45, 106};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
