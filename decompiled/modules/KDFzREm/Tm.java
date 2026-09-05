/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNuU
 *  KDFzREm.ow
 */
package KDFzREm;

import KDFzREm.NNuU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lv;
import KDFzREm.ow;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="AspectRatio", y=UR.VISUAL, N=Uz.SCREEN)
public class Tm
extends UM {
    private static byte[] u;
    private static float[] i;
    private static boolean[] R;
    private static String[] M;
    public Object[] L;
    private static short[] B;
    private static short[] Z;
    private static short[] z;
    private static short[] U;
    private static /* synthetic */ String l1jknklks;
    private static /* synthetic */ int[] l1r0jnnjp;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 26), 31), 9), 19);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{65, -121, 32, -67, 96, 8, -22, 61, 18, 13, 13, -45, 83, -73, -45, -115};
        int n = 0;
        int n2 = 13;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 127;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        R = new boolean[]{true, false, false, false, false, false, true};
    }

    private static void T() {
        M = new String[]{"_16_9", "_16_10", "_21_9", "_4_3", "custom", "aspect-ratio", "custom-ratio"};
    }

    public Tm() {
        Tm.lOmisp0("ltsai", -478829325, 689739549, 689739548, 689739551, -478829325, -478829325, (Tm)this);
        lv lv2 = new lv((String)((Object)Tm.lOmisp0("vildntdw", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[0]), (boolean)Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[0]);
        Tm.lOmisp0("wwbkpt", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739540, 689739543, -478829321, -478829321)[0]] = lv2;
        lv lv3 = new lv((String)((Object)Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[1]), (boolean)Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[1]);
        Tm.lOmisp0("ltsai", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("evtppa", -478829321, 689739549, 689739540, 689739543, -478829321, -478829321)[1]] = lv3;
        lv lv4 = new lv((String)((Object)Tm.lOmisp0("ootq", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[2]), (boolean)Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[2]);
        Tm.lOmisp0("opcsvl", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739540, 689739543, -478829321, -478829321)[2]] = lv4;
        lv lv5 = new lv((String)((Object)Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[3]), (boolean)Tm.lOmisp0("ootq", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[3]);
        Tm.lOmisp0("ojuuffq", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739540, 689739543, -478829321, -478829321)[3]] = lv5;
        lv lv6 = new lv((String)((Object)Tm.lOmisp0("vildntdw", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[4]), (boolean)Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[4]);
        Tm.lOmisp0("ltsai", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739540, 689739543, -478829321, -478829321)[4]] = lv6;
        lv[] lvArray = new lv[Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739542, 689739537, -478829321, -478829321)[0]];
        lvArray[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[5]] = (lv)((Object)Tm.lOmisp0("evtppa", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("vildntdw", -478829321, 689739549, 689739536, 689739543, -478829321, -478829321)[0]]);
        lvArray[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739544, 689739547, -478829321, -478829321)[6]] = (lv)((Object)Tm.lOmisp0("ltsai", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("vildntdw", -478829321, 689739549, 689739536, 689739543, -478829321, -478829321)[1]]);
        lvArray[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739542, 689739537, -478829321, -478829321)[1]] = (lv)((Object)Tm.lOmisp0("wwbkpt", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739536, 689739543, -478829321, -478829321)[2]]);
        lvArray[Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739542, 689739537, -478829321, -478829321)[2]] = (lv)((Object)Tm.lOmisp0("ojuuffq", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739536, 689739543, -478829321, -478829321)[3]]);
        lvArray[Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739542, 689739537, -478829321, -478829321)[3]] = (lv)((Object)Tm.lOmisp0("ootq", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("evtppa", -478829321, 689739549, 689739539, 689739543, -478829321, -478829321)[0]]);
        CallSite callSite = Tm.lOmisp0("ootq", -478829315, 689739538, 689739533, 689739532, -478829315, -478829315, (lY)this, (String)((Object)Tm.lOmisp0("ootq", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[5]), (lv[])lvArray);
        Tm.lOmisp0("ojuuffq", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739539, 689739543, -478829321, -478829321)[1]] = callSite;
        lQ lQ2 = (lQ)((Object)Tm.lOmisp0("vildntdw", -478829325, 689739528, 689739533, 689739531, -478829325, -478829325, (lQ)((Object)Tm.lOmisp0("ttknsz", -478829315, 689739538, 689739533, 689739529, -478829315, -478829315, (lY)this, (String)((Object)Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739550, 689739545, -478829321, -478829321)[6]), (float)Tm.lOmisp0("vildntdw", -478829321, 689739549, 689739535, 689739534, -478829321, -478829321)[0], (float)Tm.lOmisp0("evtppa", -478829321, 689739549, 689739535, 689739534, -478829321, -478829321)[1], (float)Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739535, 689739534, -478829321, -478829321)[2], (float)Tm.lOmisp0("ltsai", -478829321, 689739549, 689739535, 689739534, -478829321, -478829321)[3])), lw2 -> {
            Tm.lOmisp0("vildntdw", -478829325, 689739549, 689739548, 689739551, -1570599690, 1538259796, (Tm)this);
            return (boolean)Tm.lOmisp0("ltsai", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("ojuuffq", -478829327, 689739549, 689739546, 689739541, -744702950, -1866118326, (Tm)this)[Tm.lOmisp0("ltsai", -478829321, 689739549, 689739530, 689739543, 827085966, -714945612)[4]])));
        }));
        Tm.lOmisp0("evtppa", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this)[Tm.lOmisp0("ltsai", -478829321, 689739549, 689739539, 689739543, -478829321, -478829321)[2]] = lQ2;
    }

    static {
        Tm.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-85, 121, 78, 23, -45, -122, -99, 73, 13, 60, 30, 21, 9, 87, -30, 68};
        int n = 0;
        int n2 = 182;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, -10, -54, 44, -47, 96, 124, -50, 55, 12, 104, -29, 78, 28, -34, 103};
        int n = 0;
        int n2 = 240;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 21;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(n, 18), 12), 26), 27), 7) ^ 0xE4545AB4;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-5, -74, -83, -36, 25, 22, -72, 59, 115, -22, -124, -108, -109, 32, 93, -103};
        int n = 0;
        int n2 = 20;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 149;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (Tm.lOmisp0("wwbkpt", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this) == null) {
            Tm.lOmisp0("ojuuffq", -478829328, 689739549, 689739546, 689739541, -478829328, -478829328, (Tm)this, (Object[])new Object[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739542, 689739537, -478829321, -478829321)[4]]);
            CallSite callSite = Tm.lOmisp0("ttknsz", -478829327, 689739549, 689739546, 689739541, -478829327, -478829327, (Tm)this);
        }
    }

    private static void s() {
        u = new byte[]{5, 2, 3, 4, 7};
    }

    private static void m() {
        i = new float[]{1.0f, 0.5f, 2.0f, 0.01f, 1.7777778f, 1.6f, 2.3888888f, 1.3f};
    }

    private static void j() {
        B = new short[]{0, 1, 2, 3, 4};
        U = new short[]{0, 1, 2, 3};
        Z = new short[]{4, 5, 6, 0, 0, 0, 1};
        z = new short[]{2, 3, 4, 6, 4};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 19), 17), 22), 4) ^ 0x4C4FA871, 20) ^ 0xB14BE1F1, 14);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-83, 74, -97, 38, 58, -85, -77, -37, 101, -126, 68, -100, 8, -112, -81, 93};
        int n = 0;
        int n2 = 254;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 97;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 1), 11), 18), 28), 5), 2), 8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{116, -55, -113, -52, -56, 47, 28, 72, 75, -60, -81, 51, 94, 103, 97, -121};
        int n = 0;
        int n2 = 186;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 235;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(n ^ 0x9C6194CD, 13) ^ 0xE11CEF6E, 7);
    }

    public float N(float f) {
        Tm.lOmisp0("ojuuffq", -478829325, 689739549, 689739548, 689739551, -1570599690, 1538259796, (Tm)this);
        float f2 = (float)Tm.lOmisp0("evtppa", -478829325, 689739523, 689739536, 689739522, -1570599690, 1538259796, (ow)Tm.lOmisp0("ojuuffq", -478829325, 689739526, 689739521, 689739520, -1570599690, 1538259796, (NNuU)((NNuU)Tm.lOmisp0("wwbkpt", -478829327, 689739549, 689739527, 689739541, 712803140, 320275135, (Tm)this)[Tm.lOmisp0("ltsai", -478829321, 689739549, 689739539, 689739543, 8002297, 1131853076)[3]])));
        float f3 = (float)Tm.lOmisp0("ttknsz", -478829325, 689739523, 689739581, 689739522, -1570599690, 1538259796, (ow)Tm.lOmisp0("wwbkpt", -478829325, 689739526, 689739521, 689739520, -1570599690, 1538259796, (NNuU)((NNuU)Tm.lOmisp0("evtppa", -478829327, 689739549, 689739527, 689739541, -10013933, -1713520464, (Tm)this)[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739539, 689739543, 2055961236, 547292766)[4]])));
        if (Tm.lOmisp0("opcsvl", -478829325, 689739549, 689739536, 689739524, -1570599690, 1538259796, (Tm)this) == false) {
            return f;
        }
        if (Tm.lOmisp0("ootq", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("opcsvl", -478829327, 689739549, 689739546, 689739541, 783096267, -1119123780, (Tm)this)[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739539, 689739543, 1878450598, -876515790)[5]]))) != false) {
            return (float)Tm.lOmisp0("evtppa", -478829321, 689739549, 689739535, 689739534, -2042446470, 82636085)[4];
        }
        if (Tm.lOmisp0("ltsai", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("evtppa", -478829327, 689739549, 689739546, 689739541, -2106252722, 819640492, (Tm)this)[Tm.lOmisp0("ootq", -478829321, 689739549, 689739539, 689739543, -155019613, 319978874)[6]]))) != false) {
            return (float)Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739535, 689739534, -1691092215, 1744963206)[5];
        }
        if (Tm.lOmisp0("ootq", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("ojuuffq", -478829327, 689739549, 689739546, 689739541, 594352815, -1615437942, (Tm)this)[Tm.lOmisp0("evtppa", -478829321, 689739549, 689739530, 689739543, -820145080, -178598499)[0]]))) != false) {
            return (float)Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739535, 689739534, -1654676204, 95817125)[6];
        }
        if (Tm.lOmisp0("ltsai", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("ltsai", -478829327, 689739549, 689739546, 689739541, 658699453, -1999104379, (Tm)this)[Tm.lOmisp0("wwbkpt", -478829321, 689739549, 689739530, 689739543, 1565775299, -1050739339)[1]]))) != false) {
            return (float)Tm.lOmisp0("opcsvl", -478829321, 689739549, 689739535, 689739534, -673757109, -1446323971)[7];
        }
        if (Tm.lOmisp0("ttknsz", -478829325, 689739525, 689739536, 689739524, -1570599690, 1538259796, (lv)((lv)((Object)Tm.lOmisp0("opcsvl", -478829327, 689739549, 689739546, 689739541, -185535901, -771985323, (Tm)this)[Tm.lOmisp0("ojuuffq", -478829321, 689739549, 689739530, 689739543, 503813410, -195292366)[2]]))) != false) {
            return f2 / Tm.lOmisp0("evtppa", -478829325, 689739583, 689739582, 689739577, -1570599690, 1538259796, (Float)((Float)((Object)Tm.lOmisp0("opcsvl", -478829325, 689739528, 689739535, 689739580, -1570599690, 1538259796, (lQ)((lQ)((Object)Tm.lOmisp0("opcsvl", -478829327, 689739549, 689739546, 689739541, 865320663, 455249167, (Tm)this)[Tm.lOmisp0("ttknsz", -478829321, 689739549, 689739530, 689739543, 1019204290, 820716563)[3]])))))) / f3;
        }
        return f;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{37, -32, 16, 28, -107, 17, -73, 122, 50, -51, 45, -8, -48, 64, 19, 96};
        int n = 0;
        int n2 = 172;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 39;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lOmisp0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1r0jnnjp[n2 ^ 0x291C971D];
        int n8 = n7 >>> 16;
        String string2 = Tm.lOr0lmi(l1jknklks.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x291C971D);
        n7 = l1r0jnnjp[n3 ^ 0x291C971D];
        int n9 = n7 >>> 16;
        String string3 = Tm.lOr0lmi(l1jknklks.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x291C971D);
        n7 = l1r0jnnjp[n4 ^ 0x291C971D];
        int n10 = n7 >>> 16;
        String string4 = Tm.lOr0lmi(l1jknklks.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x291C971D);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE375A445) + -178;
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

    private static /* synthetic */ String lOr0lmi(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-51, -128, 17, -84, 95, -20, 82, 57, -107, -60, 110, 81, -38, -38, 79, -36};
        byte[] byArray3 = new byte[]{-108, 125, 7, 27, -15, -73, 32, -86, 95, 84, -90, -60, -68, -29, 100, -112};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void I1rIsitmt(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[37];
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
        l1jknklks = stringBuilder.toString();
        l1r0jnnjp = nArray;
    }

    private static /* synthetic */ CallSite IInrIq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1r0jnnjp[n2 ^ 0x291C971D];
        int n9 = n8 >>> 16;
        String string2 = Tm.lOr0lmi(l1jknklks.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x291C971D);
        n8 = l1r0jnnjp[n3 ^ 0x291C971D];
        int n10 = n8 >>> 16;
        String string3 = Tm.lOr0lmi(l1jknklks.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x291C971D);
        n8 = l1r0jnnjp[n4 ^ 0x291C971D];
        int n11 = n8 >>> 16;
        String string4 = Tm.lOr0lmi(l1jknklks.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x291C971D);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE375A445) + -178;
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

    private static /* synthetic */ CallSite Oljk0pnq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1r0jnnjp[n2 ^ 0x291C971D];
        int n9 = n8 >>> 16;
        String string2 = Tm.lOr0lmi(l1jknklks.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x291C971D);
        n8 = l1r0jnnjp[n3 ^ 0x291C971D];
        int n10 = n8 >>> 16;
        String string3 = Tm.lOr0lmi(l1jknklks.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x291C971D);
        n8 = l1r0jnnjp[n4 ^ 0x291C971D];
        int n11 = n8 >>> 16;
        String string4 = Tm.lOr0lmi(l1jknklks.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x291C971D);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE375A445) + -178;
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

    private static /* synthetic */ CallSite Ilnnk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1r0jnnjp[n2 ^ 0x291C971D];
        int n8 = n7 >>> 16;
        String string2 = Tm.lOr0lmi(l1jknklks.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x291C971D);
        n7 = l1r0jnnjp[n3 ^ 0x291C971D];
        int n9 = n7 >>> 16;
        String string3 = Tm.lOr0lmi(l1jknklks.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x291C971D);
        n7 = l1r0jnnjp[n4 ^ 0x291C971D];
        int n10 = n7 >>> 16;
        String string4 = Tm.lOr0lmi(l1jknklks.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x291C971D);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE375A445) + -178;
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

    private static /* synthetic */ void ntfClinit() {
        l1jknklks = "9\u00b8\u00f4\\\u00d5\u00fb\u0099\u00a1s.\u00caU\u00c4Z\u00d5\u00fb\u0099\u00a1s.\u00caU\u00fe\u00eb/\u00b8K\u00aa\u00b8\u00eb*\u00d5\u00fb\u0099\u00a1s.\u00caw\u00db\u00d6\u00a8e\u00dd\u00f6\u00a7\u00b5L\u0011\u00a0T\u00ba\u00cf\u00a4t[4\u00ec;\u00f0\u0092\u008f\u0092X$\u00caj\u00e1\u00d1\u0094!pe\u00d6\u0001\u00da\u00f9\u00a5\u0089d\u0006\u0088\u0016\u00f9\u00d5\u00c6f[\u0015\u00c9\u000b\u00eb\u00ef\u00a6\u009e\u0019/\u0081\u0002\u00e8\u00f0\u00cb\u0082\u00dcZ\"\u008b^\u00ba\u00e5\u0091 v*\u0003\u00d3\u00e6\u00d7\t\u00b8\u00f1\u00a8\u00b7p9\u00b7|\u00f8\u008c\u00928,\u008b\u00dd\u00d7\u0082\u0085Wl\u0090M\u00fc\u00cf\u00d2)b0e\u00d7\u00f8\u00d2\u008d\u00dcf1\u0080]\u00fc\u00c0\u009c;re/\u00ef\u00da\u00f9\u00a5\u0089d\u0006\u0088\u0016\u00f9\u00d4\u00c6\u00fa\u00fd\u00d2\u0082\u0087`\"\u0089L\u00f0E\u00c4\u00c2\u0097\u00d5\u00fb\u0099\u00a1s.\u00caV\u00e2\u00d1(\u00b8\u00fbte\u00b8\u00f1\u0089\u0092@\"\u00caU\u00f4\u00cd\u009a`X<\u00e7(\u00f2\u00c9\u00d8\u0086(\u00dd\u00f6\u00a7\u00b5L\u0011\u00a0T\u00ba\u00cf\u00a4t[4av\u00f0\u0092\u008f\u0092X$\u00caj\u00e1\u00d1\u0094!peFF\u00d7\u00fb\u00ca\u00bf}\u0007\u00a3C\u00c7\u00e6\u0090`{\u000f;\\\u00d5\u00fb\u0099\u00a1s.\u00caU\u00e3\u00c7\u00d7\u00d9\u00d5\u00fb\u0099\u00a1s.\u00cam\u00f8[\u00dd\u00d7\u0082\u0085Wl\u0089X\u00fb\u00c4\u00d2\u001cc,in\u00f6\u0086!\u00b8\u00e7\u0016\u00e5\u0014\u00f8\u00cbL\u00dd\u00d7\u0082\u0085Wl\u0089X\u00fb\u00c4\u00d2\u0000u4\u0015t\u00e5\u0086\u008e\u00dc";
        l1r0jnnjp = new int[]{18677770, 0x180001, 1769475, 13041665, 19333139, 12189697, 20971522, 0x190001, 21102611, 0x1A0001, 0xBB0002, 20905985, 0x720002, 13303809, 0xE00001, 851978, 22413313, 2752569, 0x170001, 18546690, 14745648, 196618, 8650796, 0x1550001, 0x111000A, 20578307, 7602177, 1966092, 20774914, 7733262, 12386314, 3, 7667713, 13369364, 6488079, 0xB0000A, 13107203};
        Tm.j();
        Tm.s();
        Tm.P();
        Tm.m();
        Tm.T();
    }
}
