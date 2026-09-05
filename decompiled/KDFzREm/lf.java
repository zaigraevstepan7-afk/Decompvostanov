/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 */
package KDFzREm;

import KDFzREm.NF;
import KDFzREm.dN;
import KDFzREm.dy;
import KDFzREm.kb;
import KDFzREm.lA;
import KDFzREm.lD;
import KDFzREm.lF;
import KDFzREm.lH;
import KDFzREm.lS;
import KDFzREm.lX;
import KDFzREm.la;
import KDFzREm.lc;
import KDFzREm.le;
import KDFzREm.lh;
import KDFzREm.lr;
import KDFzREm.lx;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;

public class lf {
    private static String[] L;
    private static boolean[] u;
    private static boolean[] i;
    private static boolean[] R;
    private static boolean[] M;
    private static byte[] B;
    private static boolean[] Z;
    private static short[] z;
    private static short[] U;
    private static String[] E;
    private static short[] W;
    public Object[] N;
    private static byte[] m;
    private static String[] P;
    private static byte[] s;
    public static Object[] y;
    private static /* synthetic */ String llnt0jqq;
    private static /* synthetic */ int[] llqpO;

    public Path L() {
        return (Path)((Object)lf.OOkslrpqr("igltatu", 1312486907, 1166422906, 1166422907, 1166422904, 562791976, (lf)this)[lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422894, 1166422908, 1810725314)[5]]);
    }

    public void L(Class<? extends lA> clazz) {
        lf.OOkslrpqr("jvwfwit", 1312486905, 1166422817, 1166422811, 1166422808, 1312486905, (Optional)((Object)lf.OOkslrpqr("igltatu", 1312486902, 1166422903, 1166422819, 1166422816, 1312486902, (Stream)((Object)lf.OOkslrpqr("byilr", 1312486902, 1166422903, 1166422900, 1166422901, 1312486902, (Stream)((Object)lf.OOkslrpqr("jwcv", 1312486902, 1166422909, 1166422898, 1166422899, 1312486902, (List)((List)((Object)lf.OOkslrpqr("vzljjedc", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422911, 1166422908, 1312486909)[0]])))), lA2 -> (boolean)(lf.OOkslrpqr("pcap", 1312486905, 1166422824, 1166422825, 1166422830, 1312486905, (Object)lA2) == clazz ? lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422831, 1166422886, 1312486909)[0] : lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422831, 1166422886, 1312486909)[1]))))), this::N);
    }

    private static /* synthetic */ String L(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-66, 11, -18, -103, 68, -3, -18, -109, 49, -62, -84, 113, -128, 78, 95, 23};
        int n = 0;
        int n2 = 238;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 9;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-n, 24), 21), 8), 12), 1);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-20, 117, 9, -53, 23, -85, -128, -65, 92, 101, -72, -21, -75, 105, 29, -57};
        int n = 0;
        int n2 = 51;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 11;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void M() {
        if (lf.OOkslrpqr("lpnukv", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this) == null) {
            lf.OOkslrpqr("etxaxhfe", 1312486906, 1166422906, 1166422907, 1166422904, 1312486906, (lf)this, (Object[])new Object[lf.OOkslrpqr("igltatu", 1312486909, 1166422906, 1166422905, 1166422910, 1312486909)[1]]);
            CallSite callSite = lf.OOkslrpqr("igltatu", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this);
        }
    }

    public lf() {
        lf.OOkslrpqr("jwcv", 1312486905, 1166422906, 1166422881, 1166422855, 1312486905, (lf)this);
        CallSite callSite = lf.OOkslrpqr("etxaxhfe", 1312486902, 1166422882, 1166422883, 1166422880, 1312486902, (Path)((Path)((Object)lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422906, 1166422876, 1166422904, 1312486909)[lf.OOkslrpqr("igltatu", 1312486909, 1166422906, 1166422810, 1166422908, 1312486909)[0]])), (String)((Object)lf.OOkslrpqr("byilr", 1312486903, 1166422869, 1166422858, 1166422813, 1312486903, (int)lf.OOkslrpqr("xxzntgog", 1312486905, 1166422815, 1166422881, 1166422812, 1312486905, (kb)((kb)((Object)lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422820, 1166422814, 1166422904, 1312486909)[lf.OOkslrpqr("lsoq", 1312486909, 1166422906, 1166422810, 1166422908, 1312486909)[1]]))))));
        lf.OOkslrpqr("fipiptv", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422810, 1166422908, 1312486909)[2]] = callSite;
        Object[] objectArray = new lA[lf.OOkslrpqr("fipiptv", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[0]];
        objectArray[lf.OOkslrpqr("ylbog", 1312486909, 1166422906, 1166422829, 1166422886, 1312486909)[0]] = new lF((String)((Object)lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422814, 1166422866, 1312486909)[0]), (int)lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422829, 1166422886, 1312486909)[1]);
        objectArray[lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422829, 1166422886, 1312486909)[2]] = new dy((String)((Object)lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422814, 1166422866, 1312486909)[1]), (int)lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422829, 1166422886, 1312486909)[3]);
        objectArray[lf.OOkslrpqr("qojdccp", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[1]] = new lS((String)((Object)lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422814, 1166422866, 1312486909)[2]), (int)lf.OOkslrpqr("igltatu", 1312486909, 1166422906, 1166422829, 1166422886, 1312486909)[4]);
        objectArray[lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[2]] = new lx((String)((Object)lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422814, 1166422866, 1312486909)[3]), (int)lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[0]);
        objectArray[lf.OOkslrpqr("jvwfwit", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[3]] = new lh((String)((Object)lf.OOkslrpqr("jwcv", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[0]), (int)lf.OOkslrpqr("lsoq", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[1]);
        objectArray[lf.OOkslrpqr("argomh", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[4]] = new lH((String)((Object)lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[1]), (int)lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[2]);
        objectArray[lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[5]] = new lD((String)((Object)lf.OOkslrpqr("jvwfwit", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[2]), (int)lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[3]);
        objectArray[lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422802, 1166422910, 1312486909)[6]] = new la((String)((Object)lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[3]), (int)lf.OOkslrpqr("jvwfwit", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[4]);
        objectArray[lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422843, 1166422910, 1312486909)[0]] = new dN((String)((Object)lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[4]), (int)lf.OOkslrpqr("byilr", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[5]);
        objectArray[lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422843, 1166422910, 1312486909)[1]] = new lc((String)((Object)lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[5]), (int)lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[6]);
        objectArray[lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422843, 1166422910, 1312486909)[2]] = new lX((String)((Object)lf.OOkslrpqr("ylbog", 1312486909, 1166422906, 1166422827, 1166422866, 1312486909)[6]), (int)lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422803, 1166422886, 1312486909)[7]);
        CallSite callSite2 = lf.OOkslrpqr("byilr", 1312486903, 1166422909, 1166422800, 1166422801, 1312486903, (Object[])objectArray);
        lf.OOkslrpqr("qojdccp", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422810, 1166422908, 1312486909)[3]] = callSite2;
    }

    static {
        lf.ntfClinit();
    }

    private static void B() {
        B = new byte[]{11, 2, 3, 4, 5, 6, 7};
        s = new byte[]{8, 9, 10, 3, 2};
        m = new byte[]{2, 2, 3, 2};
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-70, -14, 116, -36, 8, 125, -119, 22, 79, -122, 61, -101, 51, -118, 104, -112};
        int n = 0;
        int n2 = 51;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 69;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-117, -106, 38, 25, -86, -46, -22, 111, -104, 17, 92, 6, -24, 126, -6, 75};
        int n = 0;
        int n2 = 125;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 67;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void Z() {
        i = new boolean[]{false, true, true, true, true};
        R = new boolean[]{true, true, true, true, true, true, true, true};
        M = new boolean[]{false, false, true, false, true, false};
        u = new boolean[]{true, false};
        Z = new boolean[]{true, false, true, false, false, false, true, true};
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 21) ^ 0xC83F434F, 7), 5), 21) ^ 0x87BFD9C3;
    }

    public List<lA> i() {
        return (List)((Object)lf.OOkslrpqr("pcap", 1312486907, 1166422906, 1166422907, 1166422904, -112262086, (lf)this)[lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422894, 1166422908, 103283876)[6]]);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-103, -103, 119, -53, 4, 23, 32, -80, -125, -9, 84, 28, 89, 35, 79, 21};
        int n = 0;
        int n2 = 74;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 223;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-43, -39, -7, -48, -83, 0, 92, -16, -37, -94, -118, 104, -128, -4, -32, 6};
        int n = 0;
        int n2 = 65;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-123, 93, -57, -50, -40, 59, 79, 75, 60, -115, 94, 23, -69, -71, -53, -126};
        int n = 0;
        int n2 = 23;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 183;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void U() {
        L = new String[]{"friends.dat", "waypoints.dat", "macros.dat", "nuker.dat"};
        E = new String[]{"selected-preset.dat", "accounts.dat", "selected-account.dat", "client-settings.dat", "ui-layout.dat", "autobuy.dat", "blockesp.dat", "Failed to save config {}"};
        P = new String[]{"Failed to load config {}", "configs"};
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-69, -51, 113, -56, 91, -123, 13, -41, -2, 89, 90, -26, -57, 80, -38, -25};
        int n = 0;
        int n2 = 228;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void z() {
        U = new short[]{1, 2, 0, 1, 1, 1};
        z = new short[]{1, 1, 1, 1, 1, 0};
        W = new short[]{0, 0, 0, 0, 0, 0, 1};
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(-Integer.rotateLeft(-Integer.rotateRight(n, 9) ^ 0xDAFB9842, 20), 8) ^ 0xE0692F15;
    }

    public void u() {
        lf.OOkslrpqr("igltatu", 1312486902, 1166422909, 1166422809, 1166422808, -1502732353, (List)((List)((Object)lf.OOkslrpqr("igltatu", 1312486907, 1166422906, 1166422907, 1166422904, -486542709, (lf)this)[lf.OOkslrpqr("ylbog", 1312486909, 1166422906, 1166422911, 1166422908, 1498172252)[1]])), this::y);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-60, 66, -91, -53, -86, -104, 67, 91, -85, 45, -77, -116, 89, 87, 50, 44};
        int n = 0;
        int n2 = 32;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void y() {
        lf.OOkslrpqr("fipiptv", 1312486902, 1166422909, 1166422809, 1166422808, 1312486902, (List)((List)((Object)lf.OOkslrpqr("ylbog", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("byilr", 1312486909, 1166422906, 1166422810, 1166422908, 1312486909)[5]])), this::N);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, -74, -10, 69, 45, -94, 105, -74, -17, 38, 73, 47, 62, 69, 70, 59};
        int n = 0;
        int n2 = 131;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void y(lA var1_1) {
        block16: {
            var2_2 = lf.OOkslrpqr("jvwfwit", 1312486902, 1166422882, 1166422883, 1166422880, -1502732353, (Path)((Path)lf.OOkslrpqr("qojdccp", 1312486907, 1166422906, 1166422907, 1166422904, -1847747849, (lf)this)[lf.OOkslrpqr("igltatu", 1312486909, 1166422906, 1166422911, 1166422908, -731258749)[5]]), (String)lf.OOkslrpqr("pcap", 1312486905, 1166422895, 1166422892, 1166422893, -1502732353, (lA)var1_1));
            var3_3 = lf.OOkslrpqr("whntdnr", 1312486902, 1166422882, 1166422883, 1166422880, -1502732353, (Path)((Path)lf.OOkslrpqr("qojdccp", 1312486907, 1166422906, 1166422907, 1166422904, 827910878, (lf)this)[lf.OOkslrpqr("fipiptv", 1312486909, 1166422906, 1166422894, 1166422908, -1731972774)[0]]), (String)((String)lf.OOkslrpqr("qojdccp", 1312486905, 1166422895, 1166422892, 1166422893, -1502732353, (lA)var1_1) + "." + (String)lf.OOkslrpqr("qojdccp", 1312486903, 1166422869, 1166422858, 1166422859, -1502732353, (Object)lf.OOkslrpqr("whntdnr", 1312486903, 1166422870, 1166422871, 1166422868, -1502732353)) + ".tmp"));
            lf.OOkslrpqr("pcap", 1312486903, 1166422887, 1166422856, 1166422857, -1502732353, (Path)((Path)lf.OOkslrpqr("lpnukv", 1312486907, 1166422906, 1166422907, 1166422904, 1618548977, (lf)this)[lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422894, 1166422908, 578577163)[1]]), (FileAttribute[])new FileAttribute[lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422881, 1166422886, 944566969)[0]]);
            var5_4 = lf.OOkslrpqr("fipiptv", 1312486903, 1166422862, 1166422863, 1166422860, -1502732353);
            try {
                lf.OOkslrpqr("pcap", 1312486905, 1166422895, 1166422876, 1166422861, -1502732353, (lA)var1_1, (MessageBufferPacker)var5_4);
                var4_5 = lf.OOkslrpqr("fipiptv", 1312486903, 1166422849, 1166422876, 1166422873, -1502732353, (byte[])lf.OOkslrpqr("vzljjedc", 1312486905, 1166422850, 1166422851, 1166422848, -1502732353, (MessageBufferPacker)var5_4));
                ** if (var5_4 == null) goto lbl-1000
            }
            catch (Throwable var6_9) {
                if (var5_4 != null) {
                    try {
                        lf.OOkslrpqr("xxzntgog", 1312486905, 1166422850, 1166422854, 1166422855, -1502732353, (MessageBufferPacker)var5_4);
                    }
                    catch (Throwable var7_10) {
                        lf.OOkslrpqr("ylbog", 1312486905, 1166422852, 1166422853, 1166422842, -1502732353, (Throwable)var6_9, (Throwable)var7_10);
                    }
                }
                throw var6_9;
            }
lbl-1000:
            // 1 sources

            {
                lf.OOkslrpqr("jvwfwit", 1312486905, 1166422850, 1166422854, 1166422855, -1502732353, (MessageBufferPacker)var5_4);
            }
lbl-1000:
            // 2 sources

            {
            }
            v0 = new OpenOption[lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422843, 1166422910, 358193689)[3]];
            v0[lf.OOkslrpqr("jwcv", 1312486909, 1166422906, 1166422881, 1166422886, -1525128856)[1]] = lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422840, 1166422841, 1166422846, 1614592736);
            v0[lf.OOkslrpqr("jwcv", 1312486909, 1166422906, 1166422881, 1166422886, 1448840115)[2]] = lf.OOkslrpqr("jvwfwit", 1312486909, 1166422840, 1166422847, 1166422846, 1115220094);
            v0[lf.OOkslrpqr("ylbog", 1312486909, 1166422906, 1166422843, 1166422910, -449768635)[4]] = lf.OOkslrpqr("igltatu", 1312486909, 1166422840, 1166422844, 1166422846, -757036149);
            lf.OOkslrpqr("xxzntgog", 1312486903, 1166422887, 1166422845, 1166422834, -1502732353, (Path)var3_3, (byte[])lf.OOkslrpqr("lpnukv", 1312486903, 1166422872, 1166422907, 1166422873, -1502732353, (byte[])var4_5), (OpenOption[])v0);
            v1 = new CopyOption[lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422906, 1166422905, 1166422910, -821980170)[0]];
            v1[lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422881, 1166422886, 452210044)[3]] = lf.OOkslrpqr("vzljjedc", 1312486909, 1166422835, 1166422832, 1166422833, -614904954);
            v1[lf.OOkslrpqr("fipiptv", 1312486909, 1166422906, 1166422881, 1166422886, -433190946)[4]] = lf.OOkslrpqr("lsoq", 1312486909, 1166422835, 1166422838, 1166422833, -700923389);
            lf.OOkslrpqr("vzljjedc", 1312486903, 1166422887, 1166422839, 1166422836, -1502732353, (Path)var3_3, (Path)var2_2, (CopyOption[])v1);
            try {
                lf.OOkslrpqr("xxzntgog", 1312486903, 1166422887, 1166422837, 1166422826, -1502732353, (Path)var3_3);
            }
            catch (IOException var4_6) {}
            break block16;
            catch (IOException var4_7) {
                try {
                    lf.OOkslrpqr("igltatu", 1312486902, 1166422867, 1166422864, 1166422865, -1502732353, (Logger)((Logger)lf.OOkslrpqr("argomh", 1312486909, 1166422906, 1166422876, 1166422904, 2071270691)[lf.OOkslrpqr("vzljjedc", 1312486909, 1166422906, 1166422894, 1166422908, 443940622)[2]]), (String)lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422906, 1166422827, 1166422866, 2029431040)[7], (Object)lf.OOkslrpqr("vzljjedc", 1312486905, 1166422895, 1166422892, 1166422893, -1502732353, (lA)var1_1), (Object)var4_7);
                }
                catch (Throwable var8_11) {
                    try {
                        lf.OOkslrpqr("pcap", 1312486903, 1166422887, 1166422837, 1166422826, -1502732353, (Path)var3_3);
                    }
                    catch (IOException var9_12) {
                        // empty catch block
                    }
                    throw var8_11;
                }
                try {
                    lf.OOkslrpqr("argomh", 1312486903, 1166422887, 1166422837, 1166422826, -1502732353, (Path)var3_3);
                }
                catch (IOException var4_8) {}
            }
        }
    }

    public static void y(Class<? extends lA> clazz) {
        CallSite callSite = lf.OOkslrpqr("jvwfwit", 1312486903, 1166422820, 1166422881, 1166422821, -1502732353);
        CallSite callSite2 = lf.OOkslrpqr("jvwfwit", 1312486902, 1166422903, 1166422819, 1166422816, -1502732353, (Stream)((Object)lf.OOkslrpqr("etxaxhfe", 1312486902, 1166422903, 1166422900, 1166422901, -1502732353, (Stream)((Object)lf.OOkslrpqr("xxzntgog", 1312486902, 1166422909, 1166422898, 1166422899, -1502732353, (List)((List)((Object)lf.OOkslrpqr("jwcv", 1312486907, 1166422906, 1166422907, 1166422904, 760592020, (lf)((Object)callSite))[lf.OOkslrpqr("qojdccp", 1312486909, 1166422906, 1166422810, 1166422908, -227602966)[4]])))), lA2 -> (boolean)(lf.OOkslrpqr("jvwfwit", 1312486905, 1166422824, 1166422825, 1166422830, -1502732353, (Object)lA2) == clazz ? lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422831, 1166422886, 1697352369)[2] : lf.OOkslrpqr("pcap", 1312486909, 1166422906, 1166422831, 1166422886, -697023433)[3]))));
        CallSite callSite3 = callSite;
        lf.OOkslrpqr("vnyxkga", 1312486903, 1166422896, 1166422897, 1166422902, -1502732353, (Object)callSite3);
        lf.OOkslrpqr("lpnukv", 1312486905, 1166422817, 1166422811, 1166422808, -1502732353, (Optional)((Object)callSite2), ((lf)((Object)callSite3))::y);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(-n, 11), 26), 31);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{68, 114, 30, 43, 120, -63, -44, -125, 52, -36, -121, 84, -62, -72, -13, -58};
        int n = 0;
        int n2 = 111;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String N(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-84, -95, 50, -99, 114, -9, 16, -49, -82, -43, 2, 53, -87, 6, 43, 101};
        int n = 0;
        int n2 = 55;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public <T extends lA> T N(Class<T> clazz) {
        CallSite callSite = lf.OOkslrpqr("vzljjedc", 1312486902, 1166422909, 1166422898, 1166422899, 1312486902, (List)((List)((Object)lf.OOkslrpqr("jwcv", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("vnyxkga", 1312486909, 1166422906, 1166422911, 1166422908, 1312486909)[4]])));
        Class clazz2 = clazz;
        lf.OOkslrpqr("jvwfwit", 1312486903, 1166422896, 1166422897, 1166422902, 1312486903, clazz2);
        CallSite callSite2 = lf.OOkslrpqr("etxaxhfe", 1312486902, 1166422903, 1166422900, 1166422901, 1312486902, (Stream)((Object)callSite), clazz2::isInstance);
        Class clazz3 = clazz;
        lf.OOkslrpqr("jwcv", 1312486903, 1166422896, 1166422897, 1166422902, 1312486903, clazz3);
        return (T)((lA)((Object)lf.OOkslrpqr("xxzntgog", 1312486905, 1166422817, 1166422822, 1166422823, 1312486905, (Optional)((Object)lf.OOkslrpqr("fipiptv", 1312486902, 1166422903, 1166422819, 1166422816, 1312486902, (Stream)((Object)lf.OOkslrpqr("argomh", 1312486902, 1166422903, 1166422890, 1166422891, 1312486902, (Stream)((Object)callSite2), clazz3::cast)))), () -> new IllegalStateException("Config " + (String)((Object)lf.OOkslrpqr("pcap", 1312486905, 1166422807, 1166422804, 1166422893, -1502732353, (Class)clazz)) + " not registered"))));
    }

    public void N(lr lr2) {
        lf.OOkslrpqr("vzljjedc", 1312486905, 1166422906, 1166422876, 1166422806, -1502732353, (lf)this, (lA)((lA)((Object)lr2)));
    }

    public Optional<lr> N(NF nF) {
        CallSite callSite = lf.OOkslrpqr("whntdnr", 1312486902, 1166422909, 1166422898, 1166422899, -1502732353, (List)((List)((Object)lf.OOkslrpqr("igltatu", 1312486907, 1166422906, 1166422907, 1166422904, 282535786, (lf)this)[lf.OOkslrpqr("argomh", 1312486909, 1166422906, 1166422911, 1166422908, -211436935)[2]])));
        lf.OOkslrpqr("etxaxhfe", 1312486903, 1166422896, 1166422897, 1166422902, -1502732353, lr.class);
        CallSite callSite2 = lf.OOkslrpqr("igltatu", 1312486902, 1166422903, 1166422900, 1166422901, -1502732353, (Stream)((Object)callSite), lr.class::isInstance);
        lf.OOkslrpqr("jwcv", 1312486903, 1166422896, 1166422897, 1166422902, -1502732353, lr.class);
        return lf.OOkslrpqr("igltatu", 1312486902, 1166422903, 1166422819, 1166422816, -1502732353, (Stream)((Object)lf.OOkslrpqr("etxaxhfe", 1312486902, 1166422903, 1166422900, 1166422901, -1502732353, (Stream)((Object)lf.OOkslrpqr("byilr", 1312486902, 1166422903, 1166422890, 1166422891, -1502732353, (Stream)((Object)callSite2), lr.class::cast)), lr2 -> (boolean)(lf.OOkslrpqr("whntdnr", 1312486902, 1166422828, 1166422829, 1166422818, -1502732353, (lr)lr2) == nF ? lf.OOkslrpqr("etxaxhfe", 1312486909, 1166422906, 1166422892, 1166422886, -594026995)[0] : lf.OOkslrpqr("igltatu", 1312486909, 1166422906, 1166422892, 1166422886, 1685258344)[1]))));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 23), 3) ^ 0xE3B42C4, 24), 1), 30);
    }

    public void N(lA lA2) {
        CallSite callSite = lf.OOkslrpqr("lsoq", 1312486902, 1166422882, 1166422883, 1166422880, 1312486902, (Path)((Path)((Object)lf.OOkslrpqr("lsoq", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("qojdccp", 1312486909, 1166422906, 1166422894, 1166422908, 1312486909)[3]])), (String)((Object)lf.OOkslrpqr("igltatu", 1312486905, 1166422895, 1166422892, 1166422893, 1312486905, (lA)lA2)));
        if (lf.OOkslrpqr("jwcv", 1312486903, 1166422887, 1166422884, 1166422885, 1312486903, (Path)((Object)callSite), (LinkOption[])new LinkOption[lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422881, 1166422886, 1312486909)[5]]) == false) {
            return;
        }
        try {
            CallSite callSite2 = lf.OOkslrpqr("pcap", 1312486903, 1166422887, 1166422874, 1166422875, 1312486903, (Path)((Object)callSite));
            lf.OOkslrpqr("jwcv", 1312486903, 1166422878, 1166422907, 1166422879, 1312486903, (lA)lA2, (byte[])lf.OOkslrpqr("jwcv", 1312486903, 1166422872, 1166422907, 1166422873, 1312486903, (byte[])callSite2));
        }
        catch (Exception exception) {
            lf.OOkslrpqr("jvwfwit", 1312486902, 1166422867, 1166422864, 1166422865, -1502732353, (Logger)((Logger)lf.OOkslrpqr("lpnukv", 1312486909, 1166422906, 1166422876, 1166422904, 1277405547)[lf.OOkslrpqr("xxzntgog", 1312486909, 1166422906, 1166422894, 1166422908, 1488769518)[4]]), (String)((Object)lf.OOkslrpqr("ylbog", 1312486909, 1166422906, 1166422877, 1166422866, -467055590)[0]), (Object)lf.OOkslrpqr("whntdnr", 1312486905, 1166422895, 1166422892, 1166422893, -1502732353, (lA)lA2), (Object)exception);
        }
    }

    public List<lr> N() {
        CallSite callSite = lf.OOkslrpqr("etxaxhfe", 1312486902, 1166422909, 1166422898, 1166422899, 1312486902, (List)((List)((Object)lf.OOkslrpqr("jwcv", 1312486907, 1166422906, 1166422907, 1166422904, 1312486907, (lf)this)[lf.OOkslrpqr("argomh", 1312486909, 1166422906, 1166422911, 1166422908, 1312486909)[3]])));
        lf.OOkslrpqr("vnyxkga", 1312486903, 1166422896, 1166422897, 1166422902, 1312486903, lr.class);
        CallSite callSite2 = lf.OOkslrpqr("whntdnr", 1312486902, 1166422903, 1166422900, 1166422901, 1312486902, (Stream)((Object)callSite), lr.class::isInstance);
        lf.OOkslrpqr("vnyxkga", 1312486903, 1166422896, 1166422897, 1166422902, 1312486903, lr.class);
        return lf.OOkslrpqr("jwcv", 1312486902, 1166422903, 1166422888, 1166422889, 1312486902, (Stream)((Object)lf.OOkslrpqr("qojdccp", 1312486902, 1166422903, 1166422890, 1166422891, 1312486902, (Stream)((Object)callSite2), lr.class::cast)));
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-1, -1, -45, -117, -65, 15, -114, 8, 24, -59, -90, -74, -98, 23, -49, -7};
        int n = 0;
        int n2 = 149;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 183;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void R() {
        y = new Object[]{null, null, 1};
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-34, 10, -101, 12, 23, -55, 88, 43, -6, -39, 83, -68, -126, 0, -51, 115};
        int n = 0;
        int n2 = 130;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 167;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        lf.lOqqjIpOn(new String[]{"\u0000\u001b\u0000\u0001\u0089\u0000\u0002\u0000\u00136\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00a6\u00b80\u00a1\u000e\u00b3\u00d0\u0000-\u0000\n\u00f6\u00a6\u0085ri\u00e7d\r\u0085)\u0000M\u0000\u0004\u00e9\u00a8\u009ds\u0000T\u0000\u0013\u0019\u00ee\u00a7|g\u00fcPw\u00a0\f_T\u00c6\u00996\u0094B\u00b4\u00d0\u0000\u0004\u0000\u0002j\u0085\u00004\u0000\u001c^\u00b5\u008c9k\u00f9V(\u00ad\u000eZ\u001c\u008a\u00b5(\u0090\u001e\u008a\u008eeu\u00ebV=\u009c\fRX\u0000j\u0000\u0002r\u00a1\u0000J\u0000\u000b\\\u0093\u00a4[O\u00c9n\u0015\u0083;t\u0000@\u0000\u0018\u00e4\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00bd\u00b2(\u00b9\u00bb\u00a6\u0089zc\u00b1\u0018\u000e\u0000]\u00001\u00ac\u008b\u0081wp\u00eb\u001e-\u00b8\u0004]\u001c\u008f\u00af4\u0096\u00f0\u00ae\u0084x)\u00d9D(\u00bc\u0001XV\u009b\u00e1s\u00b9\u00ee\u00a6\u009dw)\u00e6P6\u00abB~Q\u0083\u00bf9\u0081\u00bf\u0000e\u0000\n|\u0083\u00adlT\u00cf\\w\u00a7\u000f\u0000i\u0000\u0001R\u0000b\u0000 E\u008b\u0081wp\u00eb\u001e-\u00b8\u0004]\u001c\u008f\u00af4\u00a7\u0019\u00ae\u0084x)\u00c9^6\u00bf\u0018\\V\u009b\u00e1s\u0092\u0000[\u0000\u0012\u00ae\u00a6\u009dw)\u00ffE1\u00a0B~C\u009d\u00b35\u00aa\u00a5\u00ab\u0000\u0005\u0000\u0001M\u0000\u0010\u0000\u0003\u00a1\u00a6\u009b\u0000(\u0000\u0013u\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00ba\u00ae(\u00bf@\u00a0\u00d0\u0000Z\u0000\u00165\u00ee\u00a7|g\u00fcPw\u00b9\u0019X_\u00c6\u0095*\u00b0t\u00a8\u0085wj\u00b1\u0000n\u0000\r\u00bd\u00a2\u009fEo\u00e7A4\u00a9#P^\u008c\u0000I\u0000 j\u00a6\u009dw)\u00e4X7\u00e3\u000bX_\u008c\u00f5\t\u00a2a\u00a9\u008fwt\u00eer7\u00bc\u0014~C\u009d\u00b35\u00b8\u0000\u0014\u0000\u0001f\u00006\u0000(\u0095\u00ee\u00a7yt\u00ed\u001e5\u00bf\nAR\u008a\u00b1uc\u00d2\u00b5\u008e9K\u00efB+\u00ad\nTq\u009c\u00bc<e\u00cf\u0097\u008aum\u00efCc\u0000E\u0000\u0011c\u0095\u00beXE\u00cbe\u001d\u0093(iz\u00ba\u008e\u0013\u00bbp\u00001\u0000&(\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00a6\u00b80\u00b3c\u00b3\u00d0?J\u00e0P.\u00adB]R\u0087\u00bdu\u0085t\u00b5\u0082xa\u00b1\u0000:\u0000\u00045\u00ee\u00b0T\u0000>\u0000\u0013\u00b0\u00a6\u009dw)\u00e6P6\u00abBe[\u009b\u00b5-a\u00b8\u00ab\u008e\u0000*\u0000\u0005x\u00b5\u0099yt\u0000B\u0000 \u0007\u00a6\u009dw)\u00e4X7\u00e3\u000bX_\u008c\u00f5\t\u00b0\f\u00a9\u008fwt\u00ee~(\u00a9\u0003~C\u009d\u00b35\u00aa\u0000\u0017\u0000\u0014\u00dd\u00ee\u00a7|g\u00fcPw\u00a0\f_T\u00c6\u0089.r\u009c\u00a9\u008c-\u0000\b\u0000\u0006]\u00b3\u0099sg\u00e7\u00005\u0000\u0016Y\u00a2\u009cRc\u00ecP-\u00a0\u0019sF\u008f\u00bc?\u0087g\u00a6\u0088}c\u00f8\u0000d\u0000\u0001}\u0000\n\u0000\u0011w\u00a6\u009dw)\u00ffE1\u00a0B~Q\u0083\u00bf9\u00b0n\u0000V\u0000\n\u00f6\u0083\u00adlT\u00cf\\w\u00a0\u001f\u0000\u0015\u0000\n|\u0083\u00adlT\u00cf\\w\u00a0,\u0000H\u0000G\u0006\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?\u00f9~\u00a6\u009f~=\u00d1s\u0003\u0080\u0007PE\u0088\u00f54\u00bfA\u00e8\u008d\u007fj\u00ef\u001e\u0017\u00bc\b_|\u0099\u00ae3\u00b9@\u00fc\u00c2Zl\u00ebG9\u00e3\u0003X\\\u00c6\u00bc3\u00baK\u00e8\u00bbwr\u00e2\n\u0000a\u0000\ti\u00a1\u00bbdc\u00f9T6\u00b8\u0000\u0003\u0000\u0001\u008a\u0000P\u0000\u0017\u00e4\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?\u00f9\u009c\u00a6\u009f~=\u00a3k\u00000\u0000\u0007\u00ba\u00a6\u0087cc\u00c5W\u0000\u0000\u0000\n\u0087\u0083\u00adlT\u00cf\\w\u00a0\u000b\u0000f\u0000\u0003\u0095\u00ee\u00a2\u00008\u0000$A\u00b5\u008c9k\u00f9V(\u00ad\u000eZ\u001c\u008a\u00b5(\u00b3\u0001\u008a\u008eeu\u00ebV=\u008e\u0018WU\u008c\u00a8\n\u00b7M\u00ac\u008ed\u0000,\u0000\u000e\u00fe\u00a6\u009dw)\u00ffE1\u00a0Bdf\u00a0\u009e\u0000<\u0000\u0005\u00f7\u00ab\u0084ec\u0000#\u0000\u0006\u00cf\u009c\u00a9?]\u00c8\u0000l\u0000\u000f\u00bc\u008b\u00a0R@\u00f0c\u001d\u00a1B]r\u00d2\u00f3\f\u0000\u0013\u0000\u0012\u00cf\u00ee\u00a7|g\u00fcPw\u00b9\u0019X_\u00c6\u00963\u00b7\u0093\u00fc\u0000+\u00009\u00ec\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00ba\u00ae(\u00ad\u00aa\u00a0\u00d0Zl\u00ebG9\u00e3\u0001P]\u008e\u00f5\u0015\u00a6\u00ae\u00a2\u0088b=\u00c6[9\u00ba\f\u001e_\u0088\u00b4=\u00eb\u008b\u00a5\u0081se\u00fe\nq\u009a\u0000K\u0000\"\u0088\u00ad\u008a`g\u00a5_1\u00a3BWZ\u0085\u00bfu\u0097\u00b0\u00a6\u0085rg\u00f8U\u001b\u00a3\u001dH|\u0099\u00ae3\u00ab\u00aa\u00fc\u0000h\u0000\u0001l\u0000A\u0000\u0001s\u0000`\u0000\u0001\u0099\u0000\u001a\u0000(5\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00ba\u00ae(\u00ads\u00a0\u00d0?J\u00e0P.\u00adB_Z\u0086\u00f5<\u00adq\u00a2\u00c4Fg\u00feYc\u0000\f\u0000&\u00bc\u008b\u0081wp\u00eb\u001e4\u00ad\u0003V\u001c\u00a6\u00b80\u0090\u00f7\u00b3\u00d0?J\u00e0P.\u00adB]R\u0087\u00bdu\u00ba\u00f6\u00ad\u008eur\u00b1\u0000)\u0000\u001fo\u00b5\u008c9g\u00faP;\u00a4\b\u001e_\u0086\u00bd=\u00bfn\u00a0\u00c4zi\u00ed\u00052\u00e3!^T\u008e\u00bf(\u0000$\u0000\nz\u0083\u00adlT\u00cf\\w\u00a0\u001d\u0000g\u0000\u0015\u00dd\u008e\u00c2Zl\u00ebG9\u00e3\u0001P]\u008e\u00f5\tt\u0087\u00ae\u0085q=\u0000.\u0000\u0012\u00f2\u00ee\u00a7|g\u00fcPw\u00b9\u0019X_\u00c6\u008f\u000fI\u009e\u00fc\u0000\\\u0000\u000b\u00fb\u00b5\u00aezu\u00efe0\u00be\u0002F\u0000!\u0000\u0018(\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?\u00f9P\u00a6\u009f~=\u00a3j\u001a\u0000 \u0000\f\u00be\u00a2\u008arG\u00e6]\u001a\u00b5\u0019T@\u0000\u0001\u0000\u0001N\u0000\u0019\u0000\u0007r\u00a2\u0098yj\u00fcT\u00009\u0000\u000bt\u00a8\u00a9or\u00efp*\u00be\fH\u0000;\u0000\n\u008f\u0083\u00adlT\u00cf\\w\u00a0;\u0000\"\u0000\n&\u0083\u00adlT\u00cf\\w\u00a0&\u0000\u000e\u0000\u0006\u00bc\u00ae\u0087bc\u00f8\u0000S\u0000\b\u0080\u00a2\u009fUj\u00ebB+\u0000\u001e\u0000\u0006\u00bf\u00bf\u0082er\u00f9\u0000\u0018\u0000\u0012D\u00a6\u009dw)\u00e4X7\u00e3\u000bX_\u008c\u00f5\n\u00b7Z\u00af\u0000\u000b\u0000\u000e\u00b6\u00a2\u009aco\u00f8T\u0016\u00a3\u0003\u007fF\u0085\u00b6\u0000\u0016\u0000\u0001\u00c8\u0000\t\u0000\u001b(\u00ee\u00a7|g\u00fcPw\u00b9\u0019X_\u00c6\u00a9.\u00a4e\u00a6\u00869U\u00feC=\u00ad\u0000\n\u00002\u0000\u0011\u000e\u00b5\u008ewr\u00efu1\u00be\bRG\u0086\u00a83\u00a1\u001e\u0000\u001f\u00002\u0019\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?/a\u00a6\u009f~=\u00d1}2\u00ad\u001bP\u001c\u0087\u00b35/W\u00ae\u0087s)\u00c6X6\u00a7\"AG\u0080\u00b54;\u0018\u009d\u0000/\u0000\u0010[\u00a6\u009dw)\u00e6P6\u00abBbG\u009b\u00b34g\u0000\u0011\u00008(\u008b\u0081wp\u00eb\u001e-\u00b8\u0004]\u001c\u008f\u00af4\u00b5t\u00ae\u0084x)\u00ccD6\u00af\u0019X\\\u0087\u00e1s\u009aj\u00a6\u009dw)\u00ffE1\u00a0BBG\u009b\u00bf;\u00bb/\u0094\u009fdc\u00eb\\c\u0000U\u0000\u0001m\u0000^\u0000\t\u0091\u0083\u00adlT\u00cf\\w\u00b5\u0000\u001c\u0000\u0002\u00cf\u009d\u0000&\u0000\u0001\u00c4\u0000D\u0000\"}\u00ad\u008a`g\u00a5_1\u00a3BWZ\u0085\u00bfu\u00a6E\u00a6\u0085rg\u00f8U\u0017\u00bc\b_|\u0099\u00ae3\u009a_\u00fc\u0000Y\u0000\tf\u00ae\u0085r@\u00e3C+\u00b8\u0000X\u0000\u000e\u0006\u00ee\u00a7]B\u00ccK\n\u0089\u0000\u001e}\u00af\u00e1\u0000k\u0000%\u00ec\u009c\u00a7|g\u00fcPw\u00a0\f_T\u00c6\u00958\u00ae\u00a1\u00a4\u009f-/\u00c6[9\u00ba\f\u001eF\u009d\u00b36\u00eb\u0088\u00ae\u0098b=\u0000'\u0000\u0001\u00a5\u0000\r\u0000\u0017\u00ee\u00a6\u009dw)\u00ffE1\u00a0BBG\u009b\u00bf;\u0098\u00ab\u0094\u009fdc\u00eb\\\u0000m\u0000\u000f\u00ee\u00a6\u009dw)\u00e6P6\u00abBr_\u0088\u00a9)\u0000c\u0000\u0007\u0081\u00a8\u0099Sg\u00e9Y\u0000\u0012\u0000\u0006\u0019\u00a8\u00a7\u007fu\u00fe\u00007\u0000)\u00dd\u008b\u0084da\u00a5\\+\u00ab\u001dPP\u0082\u00f59o\u0087\u00a2\u00c4[c\u00f9B9\u00ab\bsF\u008f\u00bc?r\u00a5\u00a6\u0088}c\u00f8\nq\u009a\u0000F\u0000\u0005\u00ea\u0095\u00a2BC\u0000O\u0000\u000eU\u00a2\u0087sr\u00efx>\u0089\u0015X@\u009d\u00a9\u0000Q\u0000\u0001E\u0000=\u0000\u0003\u00ac\u00ee\u00bd\u0000C\u0000\u0006\u00a4\u0095\u00aeWR\u00cf\u0000\u000f\u00009\u0019\u008b\u0081wp\u00eb\u001e-\u00b8\u0004]\u001c\u008f\u00af4cE\u00ae\u0084x)\u00daC=\u00a8\u0004RR\u009d\u00bfa)}\u00ad\u008a`g\u00a5D,\u00a5\u0001\u001e@\u009d\u00a8?a\\\u00e8\u00b8bt\u00efP5\u00f7\u0000\u0007\u0000\u000e\u009f\u00a6\u009dw)\u00ffE1\u00a0B}Z\u009a\u00ae\u0000L\u0000\u0010\u00c6\u0082\u00bbZG\u00c9t\u0007\u00895x`\u00bd\u0093\u0014\u00b2\u0000?\u0000\rP\u00a3\u008fEs\u00faA*\u00a9\u001eBV\u008d\u00003\u0000R\u00cf\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?\u00eb\u00b7\u00a6\u009f~=\u00d1}2\u00ad\u001bP\u001c\u0087\u00b35\u00eb\u0081\u00ae\u0087s)\u00ebE,\u00be\u0004SF\u009d\u00bfu\u0082\u008e\u00ab\u008eWr\u00feC1\u00ae\u0018EV\u00d2\u00f3\u0016\u00ae\u0086\u00b1\u008a9h\u00e3^w\u00aa\u0004]V\u00c6\u008a;\u00b0\u008f\u00fc\u0000%\u0000\u0011\u001f\u008b\u00a0R@\u00f0c\u001d\u00a1B]r\u00d2\u0081\u0018\u00dca\u0000\u001d\u0000\u0013\u00ee\u00a6\u009dw)\u00e4X7\u00e3\u000bX_\u008c\u00f5\u001c\u009c\u00e8\u00a2\u0098\u0000W\u0000\u0001\u009c\u0000G\u0000\u0005\u0082\u00b5\u0082bc\u0000R\u0000\u0010\u0007\u00a6\u009dw)\u00e6P6\u00abB~Q\u0083\u00bf9\u00b0\u0000_\u0000\u000e\u0019\u00ee\u00a7]B\u00ccK\n\u0089\u0000\u001e_\u008f\u00e1\u0000\u0006\u0000\u0002\u00e6\u0094\u0000N\u0000Y\u00f2\u008b\u0081wp\u00eb\u001e6\u00a5\u0002\u001eU\u0080\u00b6?/\u008a\u00a6\u009f~=\u00c6[9\u00ba\f\u001e]\u0080\u00b5uf\u00b3\u00ab\u008e9V\u00ebE0\u00f76}Y\u0088\u00ac;/\u00b4\u00ae\u00849`\u00e3]=\u00e3.^C\u0090\u0095*t\u00b3\u00a8\u0085-/\u00c6[9\u00ba\f\u001e]\u0080\u00b5uf\u00b3\u00ab\u008e9V\u00ebE0\u00f7"});
        lf.z();
        lf.B();
        lf.Z();
        lf.U();
        lf.R();
        lf.y[0] = LogManager.getLogger(String.class);
        lf.y[1] = ((Path)le.N[0]).resolve(P[1]);
    }

    private static /* synthetic */ void lOqqjIpOn(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[111];
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
        llnt0jqq = stringBuilder.toString();
        llqpO = nArray;
    }

    private static /* synthetic */ String I1ntjrjr(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{71, 90, 118, -117, 112, -6, -125, -45, 71, 42, -78, 105, -61, -99, -96, 118};
        byte[] byArray3 = new byte[]{-71, -118, -25, 84, 106, 111, 4, -128, -27, 95, 116, -100, 103, 99, 45, -81};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOkslrpqr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = llqpO[n2 ^ 0x4586337A];
        int n7 = n6 >>> 16;
        String string2 = lf.I1ntjrjr(llnt0jqq.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x4586337A);
        n6 = llqpO[n3 ^ 0x4586337A];
        int n8 = n6 >>> 16;
        String string3 = lf.I1ntjrjr(llnt0jqq.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x4586337A);
        n6 = llqpO[n4 ^ 0x4586337A];
        int n9 = n6 >>> 16;
        String string4 = lf.I1ntjrjr(llnt0jqq.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x4586337A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4E3AF54F) + -178;
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

    private static /* synthetic */ CallSite Ol0Iki(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = llqpO[n2 ^ 0x4586337A];
        int n7 = n6 >>> 16;
        String string2 = lf.I1ntjrjr(llnt0jqq.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x4586337A);
        n6 = llqpO[n3 ^ 0x4586337A];
        int n8 = n6 >>> 16;
        String string3 = lf.I1ntjrjr(llnt0jqq.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x4586337A);
        n6 = llqpO[n4 ^ 0x4586337A];
        int n9 = n6 >>> 16;
        String string4 = lf.I1ntjrjr(llnt0jqq.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x4586337A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4E3AF54F) + -178;
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

    private static /* synthetic */ CallSite Ilrjjiqr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llqpO[n2 ^ 0x4586337A];
        int n8 = n7 >>> 16;
        String string2 = lf.I1ntjrjr(llnt0jqq.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x4586337A);
        n7 = llqpO[n3 ^ 0x4586337A];
        int n9 = n7 >>> 16;
        String string3 = lf.I1ntjrjr(llnt0jqq.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x4586337A);
        n7 = llqpO[n4 ^ 0x4586337A];
        int n10 = n7 >>> 16;
        String string4 = lf.I1ntjrjr(llnt0jqq.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x4586337A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4E3AF54F) + -178;
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
}
